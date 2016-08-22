package com.example.zhuangqf.webviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bn1 = (Button)findViewById(R.id.button1);
        Button bn2 = (Button)findViewById(R.id.button2);
        Button bn3 = (Button)findViewById(R.id.button3);

        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,WebView1Activity.class);
                startActivity(intent);
            }
        });
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,WebView2Activity.class);
                startActivity(intent);
            }
        });
        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,WebView3Activity.class);
                startActivity(intent);
            }
        });


    }
}
