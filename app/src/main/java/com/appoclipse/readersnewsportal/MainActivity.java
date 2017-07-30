package com.appoclipse.readersnewsportal;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    boolean exit = false;

    public void banglaNews(View view){
        Intent i = new Intent(this, BanglaNews.class);
        startActivity(i);
    }

    public void enNews(View view){
        Intent i = new Intent(this, EnglishNews.class);
        startActivity(i);
    }

    public void about(View view){
        Intent myIntent = new Intent(MainActivity.this,
                about.class);
        startActivity(myIntent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }


    @Override
    public void onBackPressed() {
        if (exit) {
            finishAffinity();
            System.exit(0);
            return;
        }
        this.exit = true;
        Toast.makeText(this, "Press again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                exit=false;
            }
        }, 2000);
    }
}




