package com.yangchoi.lib_public.mmkv

import com.tencent.mmkv.MMKV

/**
 * Created on 2021/6/25
 * describe: MMKV数据存储
 */
object MMKVUtil {
    //获取kv实例
    val kv = MMKV.defaultMMKV()

    /**
     * @param dataType 保存数据的类型
     * @param dataKey 保存数据的key
     * @param dataValue 保存数据的value
     * */
    @JvmStatic
    fun saveValue(dataType: String,dataKey:String,dataValue:String){
        when(dataType){
            MMKVDataTypeMenu.BOOLEAN.toString() -> kv.encode(dataKey,dataValue.toBoolean())
            MMKVDataTypeMenu.INT.toString() -> kv.encode(dataKey,dataValue.toInt())
            MMKVDataTypeMenu.LONG.toString() -> kv.encode(dataKey,dataValue.toLong())
            MMKVDataTypeMenu.FLOAT.toString() -> kv.encode(dataKey,dataValue.toFloat())
            MMKVDataTypeMenu.DOUBLE.toString() -> kv.encode(dataKey,dataValue.toDouble())
            MMKVDataTypeMenu.STRING.toString() -> kv.encode(dataKey,dataValue)
            MMKVDataTypeMenu.ENTITY.toString() -> kv.encode(dataKey,dataValue)
        }
    }
    /**
     * @param dataType 数据类型
     *        boolean 布尔类型
     *        int     int
     *        long    长整形
     *        float   float
     *        double  double
     *        string  字符串
     *        entity  实体类  将实体类转成json字符串再进行保存
     * @param dataKey  保存的key
     * */
    fun getValue(dataType: String,dataKey:String):String{
        return when(dataType){
            MMKVDataTypeMenu.BOOLEAN.toString() -> "${kv.decodeBool(dataKey)}"
            MMKVDataTypeMenu.INT.toString() -> "${kv.decodeInt(dataKey)}"
            MMKVDataTypeMenu.LONG.toString() -> "${kv.decodeLong(dataKey)}"
            MMKVDataTypeMenu.FLOAT.toString() -> "${kv.decodeFloat(dataKey)}"
            MMKVDataTypeMenu.DOUBLE.toString() -> "${kv.decodeDouble(dataKey)}"
            MMKVDataTypeMenu.STRING.toString() -> kv.decodeString(dataKey)
            MMKVDataTypeMenu.ENTITY.toString() -> kv.decodeString(dataKey)
            else -> ""
        }
    }
}