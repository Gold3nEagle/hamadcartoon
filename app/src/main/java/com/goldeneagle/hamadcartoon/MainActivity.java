package com.goldeneagle.hamadcartoon;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button browseBookbtn, aboutArtistbtn, rateAppbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        browseBookbtn = findViewById(R.id.Browse_Book);
        aboutArtistbtn = findViewById(R.id.About_Artist);
        rateAppbtn = findViewById(R.id.Rate_App);

    }

    public void BrowseBook(View view) {
        browseBookbtn.setBackgroundColor(getResources().getColor(R.color.colorButtonPressed));

        Intent intent = new Intent(this, LibActivity.class);
        startActivity(intent);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                browseBookbtn.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            }
        }, 100);

        //Intent viewPDF = new Intent(Intent.ACTION_VIEW);
       // viewPDF.setDataAndType(Uri.parse("https://drive.google.com/open?id=0Byio6GQV9piwTlRkNDctS19Dd0h6QzMtaVQtS0hrRzU2Sktn"), "text/html");
       // startActivity(viewPDF);
    }


    public void AboutArtist(View view) {
        aboutArtistbtn.setBackgroundColor(getResources().getColor(R.color.colorButtonPressed));
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                aboutArtistbtn.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            }
        }, 100);

    }

    public void RateApp(View view) {
        rateAppbtn.setBackgroundColor(getResources().getColor(R.color.colorButtonPressed));

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                rateAppbtn.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            }
        }, 100);


        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.goldeneagle.hamadcartoon")));
    }

}
