package com.example.aniversestudio

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWeb: WebView = findViewById(R.id.MyWebView)
        myWeb.apply {
            loadUrl("https://moyasiginko.github.io/ToDoList-Project/dist/")

            // Enable JavaScript (if needed)
            settings.javaScriptEnabled = true

            // Enable zoom controls
            settings.setSupportZoom(true)
            settings.builtInZoomControls = true
            settings.displayZoomControls = false

            // Use wide viewport and set initial scale
            settings.useWideViewPort = true
            settings.loadWithOverviewMode = true
            settings.defaultZoom = WebSettings.ZoomDensity.FAR // Adjust the density as needed

            // Enable responsive layout
            settings.layoutAlgorithm = WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING

            // Improve rendering performance
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH)

            // Enable hardware acceleration
            setLayerType(WebView.LAYER_TYPE_HARDWARE, null)
        }
    }
}
