package com.appoclipse.readersnewsportal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.NativeExpressAdView;

public class EnglishNews extends AppCompatActivity {


    public void back(View view ){
        Intent i =  new Intent(this, MainActivity.class);
        startActivity(i);

    }

    public void dailyStar(View view){

        String title = "The Daily Star";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.thedailystar.net");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 2);
        startActivity(intent);
        finish();

    }

    public void dailySun(View view){


        String title = "The Daily Sun";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.daily-sun.com");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 2);
        startActivity(intent);
        finish();
    }

    public void bdToday(View view){

        String title = "The Bangladesh Today";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://thebangladeshtoday.com");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 2);
        startActivity(intent);
        finish();
    }
    public void newAge (View view){

        String title = "The New Age";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://newagebd.net");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 2);
        startActivity(intent);
        finish();
    }

    public void newsToday (View view){

        String title = "The News Today";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.newstoday.com.bd");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 2);
        startActivity(intent);
        finish();
    }

    public void independent (View view){

        String title = "The Independent";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.theindependentbd.com");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 2);
        startActivity(intent);
        finish();
    }

    public void newNation (View view){

        String title = "The New Nation";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.thedailynewnation.com");
        intent.putExtra("Integer", 2);
        intent.putExtra("titleText", title);
        startActivity(intent);
        finish();
    }

    public void observer(View view){

        String title = "The Observer";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.observerbd.com");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 2);
        startActivity(intent);
        finish();
    }



    public void DhakaTribune(View view){


        String title = "Dhaka Tribune";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.dhakatribune.com");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 2);
        startActivity(intent);
        finish();
    }

    public void asianAge (View view){

        String title = "Daily Asian Age";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.dailyasianage.com/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 2);
        startActivity(intent);
        finish();
    }

    public void bdnews24en (View view){

        String title = "BD News 24";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://bdnews24.com/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 2);
        startActivity(intent);
        finish();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_news);

        final NativeExpressAdView adView1 = (NativeExpressAdView)findViewById(R.id.ads1);
        final NativeExpressAdView adView2 = (NativeExpressAdView)findViewById(R.id.ads2);
        final NativeExpressAdView adView3 = (NativeExpressAdView)findViewById(R.id.ads3);

        AdRequest request = new AdRequest.Builder().build();
        adView1.loadAd(request);
        adView2.loadAd(request);
        adView3.loadAd(request);


        adView1.setAdListener(new AdListener() {
            @Override public void onAdFailedToLoad(int error) {adView1.setVisibility(View.GONE);}
            @Override public void onAdLoaded() {adView1.setVisibility(View.VISIBLE);}
        });

        adView2.setAdListener(new AdListener() {
            @Override public void onAdFailedToLoad(int error) {adView2.setVisibility(View.GONE);}
            @Override public void onAdLoaded() {adView2.setVisibility(View.VISIBLE);}
        });

        adView3.setAdListener(new AdListener() {
            @Override public void onAdFailedToLoad(int error) {adView3.setVisibility(View.GONE);}
            @Override public void onAdLoaded() {adView3.setVisibility(View.VISIBLE);}
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
