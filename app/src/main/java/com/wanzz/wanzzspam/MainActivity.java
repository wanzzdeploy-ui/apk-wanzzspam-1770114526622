package com.wanzz.wanzzspam;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    private WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myWebView = new WebView(this);
        setContentView(myWebView);
        
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setAllowFileAccess(true);
        
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://spamer-ngl-by-wanzz.vercel.app");
    }
    @Override
    public void onBackPressed() {
        if(myWebView.canGoBack()) myWebView.goBack();
        else super.onBackPressed();
    }
}