package com.appoclipse.readersnewsportal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.NativeExpressAdView;

public class BanglaNews extends AppCompatActivity {


    public void back(View view ){
        Intent i =  new Intent(this, MainActivity.class);
        startActivity(i);

    }

    public void prothomalo(View view){

        String title = "প্রথম আলো";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://prothom-alo.com");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 1);
        startActivity(intent);
        finish();

    }

    public void kalerkantho(View view){

        String title = "কালেরকণ্ঠ";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.kalerkantho.com/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 1);
        startActivity(intent);
        finish();
    }

    public void ittefaq(View view){

        String title = "ইত্তেফাক";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.ittefaq.com.bd/");
        intent.putExtra("Integer", 1);
        intent.putExtra("titleText", title);
        startActivity(intent);

        finish();
    }
    public void nayadiganta (View view){

        String title = "নয়া দিগন্ত";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.dailynayadiganta.com/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 1);
        startActivity(intent);
        finish();
    }

    public void vorerKagoj (View view){

        String title = "ভোরের কাগজ";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.bhorerkagoj.net/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 1);
        startActivity(intent);
        finish();
    }

    public void jugantor (View view){

        String title = "যুগান্তর";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.jugantor.com/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 1);
        startActivity(intent);
        finish();
    }

    public void janakantha (View view){

        String title = "জনকণ্ঠ";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.dailyjanakantha.com/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 1);
        startActivity(intent);
        finish();
    }

    public void manobZamin(View view){

        String title = "মানবজমিন";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.mzamin.com/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 1);
        startActivity(intent);
        finish();
    }

    public void bdProtidin (View view){

        String title = "বাংলাদেশ প্রতিদিন";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.bd-pratidin.com/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 1);
        startActivity(intent);
        finish();
    }

    public void inQilab(View view){

        String title = "ইনকিলাব";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "https://www.dailyinqilab.com/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 1);
        startActivity(intent);
        finish();
    }

    public void somokal (View view){

        String title = "সমকাল";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://bangla.samakal.net/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 1);
        startActivity(intent);
        finish();
    }

    public void jayjayDin (View view){

        String title = "যায় যায় দিন";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.jaijaidinbd.com/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 1);
        startActivity(intent);
        finish();
    }

    public void vorerDak (View view){

        String title = "ভোরের ডাক";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://bhorer-dak.com/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 1);
        startActivity(intent);
        finish();
    }


    public void bdNews24 (View view){

        String title = "বিডি নিউজ ২৪";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://bangla.bdnews24.com/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 1);
        startActivity(intent);
        finish();
    }

    public void sangram (View view){

        String title = "সংগ্রাম";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.dailysangram.com/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 1);
        startActivity(intent);
        finish();
    }


    public void sangbad (View view){

        String title = "সংবাদ";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.thedailysangbad.com/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 1);
        startActivity(intent);
        finish();
    }

    public void bortoman (View view){

        String title = "বর্তমান";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.dailybartoman.com/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 1);
        startActivity(intent);
        finish();
    }

    public void sokalerKhobor (View view){

        String title ="সকালের খবর";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://www.shokalerkhobor24.com/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 1);
        startActivity(intent);
        finish();
    }

    public void bonikBarta (View view){

        String title = "বণিক বার্তা";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "http://bonikbarta.net/bangla/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 1);
        startActivity(intent);
        finish();
    }

    public void manobkontho (View view){

        String title = "মানবকণ্ঠ";
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("urlString", "https://www.manobkantha.com/");
        intent.putExtra("titleText", title);
        intent.putExtra("Integer", 1);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_news);

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
