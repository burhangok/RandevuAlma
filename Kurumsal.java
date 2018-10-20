package com.teknodate.drkim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Kurumsal extends AppCompatActivity {


    public WebView webAlani;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurumsal);

        webAlani=findViewById(R.id.webview);

        webAlani.getSettings().setJavaScriptEnabled(true);

        webAlani.loadUrl("http://ibb.ist");

    }
}
