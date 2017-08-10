package com.appoclipse.readersnewsportal;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.NativeExpressAdView;

import java.net.URI;
import java.net.URL;

public class WebViewClass extends AppCompatActivity {

    private String webURL;
    private WebView web;
    private ProgressBar bar;
    private Integer activityNum;


    @SuppressLint("SetJavaScriptEnabled")
    void websiteView() {
        bar.setProgress(70);
        bar.setMax(100);
        web.setWebViewClient(new WebViewClient());

        web.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                if (newProgress == 100) {
                    bar.setVisibility(View.GONE);
                } else {
                    bar.setVisibility(View.VISIBLE);
                }
            }
        });

        web.getSettings().setJavaScriptEnabled(true);
        CookieManager.getInstance().setAcceptCookie(true);
        web.loadUrl(webURL);
        web.setVerticalScrollBarEnabled(false);
        web.setInitialScale(100);
        loadFast(web);
    }

    private void loadFast(WebView web) {
        web.setScrollBarStyle(View.SCROLLBARS_OUTSIDE_OVERLAY);
        WebSettings webSettings = web.getSettings();
        webSettings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        webSettings.setAppCacheEnabled(true);
        webSettings.setEnableSmoothTransition(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webSettings.setDomStorageEnabled(true);
        webSettings.setAppCacheEnabled(true);
        webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webSettings.setEnableSmoothTransition(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setBuiltInZoomControls(true);

    }

    boolean checkInternetConnection(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo ni = cm.getActiveNetworkInfo();
        return ni != null && ni.isAvailable() && ni.isConnected();

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_class);

        final String title = getIntent().getExtras().getString("titleText");
        TextView text = (TextView) findViewById(R.id.titeText);
        text.setText(title);

        webURL = getIntent().getExtras().getString("urlString");
        bar = (ProgressBar) findViewById(R.id.webbar);
        web = (WebView) findViewById(R.id.webView);
        activityNum = getIntent().getExtras().getInt("Integer");

        final boolean check = checkInternetConnection(this);

        final Intent i = new Intent(this, ConnectionLost.class);
        i.putExtra("urlString", webURL);
        i.putExtra("titleText", title);

        if (!check) {
            Toast.makeText(this, "No Internet Connection! Please Connect and Refresh.",
                    Toast.LENGTH_SHORT).show();
            startActivity(i);
            finish();
        }
        else {
            websiteView();
            Toast.makeText(this, "Loading...",
                    Toast.LENGTH_LONG).show();
        }
        final ImageButton refresh = (ImageButton) findViewById(R.id.reload);


        refresh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!check) {
                    Toast.makeText(getApplicationContext(),
                            "No Internet Connection! Please Connect and Refresh.",
                            Toast.LENGTH_SHORT).show();
                    startActivity(i);
                    finish();
                } else {
                    web.reload();
                }
            }
        });

        web.setWebViewClient(new WebViewClient() {


            @Override
            public void onReceivedError(final WebView view, int errorCode, String description,
                                        final String failingUrl) {
                Toast.makeText(getApplicationContext(),
                        "No Internet Connection! Please Connect and Refresh.",
                        Toast.LENGTH_SHORT).show();
                super.onReceivedError(view, errorCode, description, failingUrl);
                startActivity(i);
                finish();
            }
        });

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        ImageButton back = (ImageButton) findViewById(R.id.backward);
        ImageButton forward = (ImageButton) findViewById(R.id.forward);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (web.canGoBack()) {
                    web.goBack();
                }
            }
        });
        forward.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (web.canGoForward()) {
                    web.goForward();
                }
            }
        });
    }

    Intent i;
    @Override
    public void onBackPressed() {
        if (web.canGoBack()) {
            web.goBack();
        } else {
//
//            if (activityNum == 1){
//                i = new Intent(this, BanglaNews.class);
//                startActivity(i);
//                //finish();
//                Log.i("Fuck", "Pressed!");
//            } else if (activityNum == 2){
//                i = new Intent(this, EnglishNews.class);
//                startActivity(i);
//                //finish();
//            }
//        }
            switch (activityNum){
                case 1:
                    i = new Intent(this, BanglaNews.class);
                    startActivity(i);
                    finish();
                    break;
                case 2:
                    i = new Intent(this, EnglishNews.class);
                    startActivity(i);
                    finish();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
            }
        }

    }
}
