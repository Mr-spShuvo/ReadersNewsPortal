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

        String title = "Daily Star";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.thedailystar.net");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 2);
        startActivity(intent);
        finish();

    }

    public void dailySun(View view){


        String title = "Daily Sun";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.daily-sun.com");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 2);
        startActivity(intent);
        finish();
    }

    public void bdToday(View view){

        String title = "BD Today";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://thebangladeshtoday.com");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 2);
        startActivity(intent);
        finish();
    }
    public void newAge (View view){

        String title = "New Age";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://newagebd.net");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 2);
        startActivity(intent);
        finish();
    }

    public void newsToday (View view){

        String title = "News Today";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.newstoday.com.bd");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 2);
        startActivity(intent);
        finish();
    }

    public void independent (View view){

        String title = "Independent";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.theindependentbd.com");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 2);
        startActivity(intent);
        finish();
    }

    public void newNation (View view){

        String title = "New Nation";
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

        String title = "Asian Age";
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



    public void nytimes (View view){

        String title = "NY Times";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "https://nytimes.com/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 2);
        startActivity(intent);
        finish();
    }

    public void guardian (View view){

        String title = "The Guardian";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "https://theguardian.com");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 2);
        startActivity(intent);
        finish();
    }

    public void huffington (View view){

        String title = "Huffington Post";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://huffingtonpost.com/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 2);
        startActivity(intent);
        finish();
    }

    public void washington (View view){

        String title = "Washington Post";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "https://washingtonpost.com/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 2);
        startActivity(intent);
        finish();
    }


    public void usatoday (View view){

        String title = "USA Today";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://usatoday.com/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 2);
        startActivity(intent);
        finish();
    }


    public void bloomberg (View view){

        String title = "Bloomberg";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "https://bloomberg.com/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 2);
        startActivity(intent);
        finish();
    }


    public void nypost(View view){

        String title = "NY Post";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://nypost.com/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 2);
        startActivity(intent);
        finish();
    }

    public void hindutimes (View view){

        String title = "HT";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://hindustantimes.com/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 2);
        startActivity(intent);
        finish();
    }

    public void indianexpress(View view){

        String title = "Indian Express";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://indianexpress.com/");
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
        final NativeExpressAdView adView4 = (NativeExpressAdView)findViewById(R.id.ads4);
        final NativeExpressAdView adView5 = (NativeExpressAdView)findViewById(R.id.ads5);
        final NativeExpressAdView adView6 = (NativeExpressAdView)findViewById(R.id.ads6);

        AdRequest request = new AdRequest.Builder().build();
        adView1.loadAd(request);
        adView2.loadAd(request);
        adView3.loadAd(request);
        adView4.loadAd(request);
        adView5.loadAd(request);
        adView6.loadAd(request);


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

        adView4.setAdListener(new AdListener() {
            @Override public void onAdFailedToLoad(int error) {adView4.setVisibility(View.GONE);}
            @Override public void onAdLoaded() {adView4.setVisibility(View.VISIBLE);}
        });

        adView5.setAdListener(new AdListener() {
            @Override public void onAdFailedToLoad(int error) {adView5.setVisibility(View.GONE);}
            @Override public void onAdLoaded() {adView5.setVisibility(View.VISIBLE);}
        });

        adView6.setAdListener(new AdListener() {
            @Override public void onAdFailedToLoad(int error) {adView6.setVisibility(View.INVISIBLE);}
            @Override public void onAdLoaded() {adView6.setVisibility(View.VISIBLE);}
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
