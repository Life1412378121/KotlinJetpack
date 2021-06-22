package com.yangchoi.lib_network.utils

import java.security.cert.CertificateException
import java.security.cert.X509Certificate
import javax.net.ssl.*

/**
 * Created on 2021/4/27
 * describe: 访问https需要配置相关帧数
 */
object SSLContextSecurity {

    fun createIgnoreVerifySSL(sslVersion: String): SSLSocketFactory {
        var sc = SSLContext.getInstance(sslVersion);
        val trustAllCerts: Array<TrustManager> = arrayOf(object : X509TrustManager {
            @Throws(CertificateException::class)
            override fun checkClientTrusted(
                chain: Array<java.security.cert.X509Certificate>, authType: String
            ) {
            }

            @Throws(CertificateException::class)
            override fun checkServerTrusted(
                chain: Array<java.security.cert.X509Certificate>,
                authType: String
            ) {
            }

            override fun getAcceptedIssuers(): Array<X509Certificate?> {
                return arrayOfNulls(0)
            }
        })

        sc!!.init(null, trustAllCerts, java.security.SecureRandom())

        // Create all-trusting host name verifier
        val allHostsValid = HostnameVerifier { _, _ -> true }

        HttpsURLConnection.setDefaultSSLSocketFactory(sc.socketFactory);
        HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
        return sc.socketFactory;
    }
}