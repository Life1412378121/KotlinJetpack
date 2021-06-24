package com.yangchoi.lib_base.base

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.blankj.utilcode.util.GsonUtils
import com.blankj.utilcode.util.LogUtils
import com.yangchoi.lib_base.error.ErrorResult
import com.yangchoi.lib_base.utils.ErrorUtil
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * Created on 2021/4/27
 * describe: viewmodel基类
 *           open关键字让继承它的子类可以重写他的方法
 */
open class BaseViewModel : ViewModel() {

    private var TAG = "BaseViewModel"


    //是否现在等待loading
    var isShowLoading = MutableLiveData<Boolean>()
    //错误信息
    var errorResult = MutableLiveData<ErrorResult>()

    //显示loading
    private fun showLoading(){
        isShowLoading.value = true
    }
    //关闭loading
    private fun dismissLoading(){
        isShowLoading.value = false
    }

    //显示错误信息
    private fun showError(error:ErrorResult){
        errorResult.value = error
    }

    /**
     * 请求接口，可定制是否显示loading和错误提示
     */
    fun <T> launch(
        block:suspend  CoroutineScope.() -> BaseResult<T>,//请求接口方法，
        liveData: MutableLiveData<T>,//T表示data实体泛型，调用时可将data对应的bean传入即可
        isShowLoading: Boolean = false,//是否显示加载框
        isShowError: Boolean = true
    ){
        if (isShowLoading) showLoading()
        viewModelScope.launch {
            try {
                val result = withContext(Dispatchers.IO) { block() }
                if (result.errorCode == 0) {//请求成功
                    Log.e("requestTAG","请求成功>>" + GsonUtils.toJson(result.data))
                    liveData.value = result.data
                } else {
                    Log.e("requestTAG","请求错误>>" + result.errorMsg)
                    showError(ErrorResult(result.errorCode, result.errorMsg, isShowError))
                }
            } catch (e: Throwable) {//接口请求失败
                Log.e("requestTAG","请求异常>>" + e.message)
                val errorResult = ErrorUtil.getError(e)
                errorResult.show = isShowError
                showError(errorResult)
            } finally {//请求结束
                dismissLoading()
            }
        }
    }
}