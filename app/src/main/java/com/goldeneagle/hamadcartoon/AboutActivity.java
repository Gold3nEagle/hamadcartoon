package com.goldeneagle.hamadcartoon;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AboutActivity extends Activity {

    TextView aboutnametxt, aboutlisttxt, workslisttxt, achievementlisttxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        aboutnametxt = findViewById(R.id.About_Name);
        aboutlisttxt = findViewById(R.id.About_List);
        workslisttxt = findViewById(R.id.Works_List);
        achievementlisttxt = findViewById(R.id.Achievement_List);

    }

    public void AccessFacebook(View view){

        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/hamad.algayeb")));

    }

    public void AccessInstagram(View view){

        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/hamadcartoon")));

    }

    public void AccessTwitter(View view){

        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/hamadalgayeb")));

    }

}


