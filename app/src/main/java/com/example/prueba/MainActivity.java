package com.example.prueba;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private WebView myWebView;
    private WebSettings myWebSettings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        myWebView = findViewById(R.id.web1);
        myWebSettings = myWebView.getSettings();
        myWebSettings.setJavaScriptEnabled(true);
        myWebSettings.setDomStorageEnabled(true);
        myWebView.loadUrl("https://portaltecmonclovaitsm.kesug.com/");
        myWebView.setWebViewClient(new WebViewClient());


    }
}