package com.example.zhuangqf.webviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class WebView1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view1);

        final EditText editText = (EditText)findViewById(R.id.url1);
        final Button goButton = (Button)findViewById(R.id.goButton1);
        final WebView webView = (WebView)findViewById(R.id.webView1);

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://"+editText.getText().toString();
                loadURL(webView,url);
            }
        });

        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if(KeyEvent.KEYCODE_ENTER == keyCode && KeyEvent.ACTION_DOWN == event.getAction()){
                    String url = "http://"+editText.getText().toString();
                    loadURL(webView,url);
                    return true;
                }
                return false;
            }
        });

    }

    private void loadURL(WebView webView,String url){
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl(url);
    }

}
