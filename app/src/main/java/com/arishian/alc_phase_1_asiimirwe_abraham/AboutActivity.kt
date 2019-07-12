package com.arishian.alc_phase_1_asiimirwe_abraham

import android.net.http.SslError
import android.os.Bundle
import android.view.View
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_about.*


class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        setSupportActionBar(tb_about)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        tb_about.setNavigationIcon(R.drawable.ic_arrow_back_white)
        tb_about.setNavigationOnClickListener {
            finish()
        }


        showProgress()

        webview_alc.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                view.loadUrl(url)
                return true
            }

            override fun onPageFinished(view: WebView, url: String) {
                hideProgress()
                webview_alc.visibility = View.VISIBLE

            }
            override fun onReceivedSslError(view: WebView, handler: SslErrorHandler, error: SslError) {
                handler.proceed()

            }
        }

        webview_alc.loadUrl("https://andela.com/alc/")


    }

    private fun showProgress() {
        pb_load_webview.visibility = View.VISIBLE
        tv_progress_msg.visibility = View.VISIBLE
    }

    private fun hideProgress() {
        pb_load_webview.visibility = View.GONE
        tv_progress_msg.visibility = View.GONE
    }
}
