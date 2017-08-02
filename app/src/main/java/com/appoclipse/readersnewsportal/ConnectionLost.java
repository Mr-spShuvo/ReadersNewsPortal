package com.appoclipse.readersnewsportal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ConnectionLost extends AppCompatActivity {

    String titleBar;
    TextView title;
    public void refreshBtn(View view){


        title.setText(titleBar);

        String webURL = getIntent().getExtras().getString("urlString");

        Intent i = new Intent(this, WebViewClass.class);
        i.putExtra("urlString", webURL);
        i.putExtra("titleText", titleBar);

        startActivity(i);
        finish();
    }

    public void backBtn(View view){
        Intent i = new Intent(this, BanglaNews.class);
        startActivity(i);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection_lost);

        title = (TextView) findViewById(R.id.titletext);
        titleBar = getIntent().getExtras().getString("titleText");

        title.setText(titleBar);

    }

    @Override
    public void onBackPressed() {
        finish();
    }

}
