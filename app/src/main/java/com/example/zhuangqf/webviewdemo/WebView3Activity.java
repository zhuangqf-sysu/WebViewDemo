package com.example.zhuangqf.webviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import java.io.InputStream;

public class WebView3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view3);

        String webPage = null;
        try {
            InputStream inputStream = getResources().openRawResource(R.raw.web_page);
            int length = inputStream.available();
            byte[] buffer = new byte[length];
            inputStream.read(buffer);
            webPage = new String(buffer,"UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }

        WebView webView = (WebView)findViewById(R.id.webView3);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadData(webPage,"text/html","UTF-8");
        webView.addJavascriptInterface(new WebAppInterface(this),"Android");
    }
}
