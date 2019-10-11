package com.goldeneagle.hamadcartoon;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LibActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib);
    }

    public void ViewBook1(View view){

        Intent viewPDF = new Intent(Intent.ACTION_VIEW);
        viewPDF.setDataAndType(Uri.parse("https://drive.google.com/open?id=1JD3V3cWm1weIb72ojRh0CBXgTK2jUcHD"), "text/html");
        startActivity(viewPDF);
    }

    public void ViewBook2(View view){
        Intent viewPDF = new Intent(Intent.ACTION_VIEW);
        viewPDF.setDataAndType(Uri.parse("https://drive.google.com/open?id=1P-cmOl47yQgZrmaPOxCoVpY_dMmYQtUU"), "text/html");
        startActivity(viewPDF);
    }

    public void ViewBook3(View view){
        Intent viewPDF = new Intent(Intent.ACTION_VIEW);
        viewPDF.setDataAndType(Uri.parse("https://drive.google.com/open?id=1fIwqMdNobVE0d6XLTXJpX57NhNYDPd3_"), "text/html");
        startActivity(viewPDF);
    }

    public void ViewBook4(View view){
        Intent viewPDF = new Intent(Intent.ACTION_VIEW);
        viewPDF.setDataAndType(Uri.parse("https://drive.google.com/open?id=1e1fJmZt_Mpmb1qtKMK4rLr3cmogtUwLf"), "text/html");
        startActivity(viewPDF);
    }

    public void ViewBook5(View view){
        Intent viewPDF = new Intent(Intent.ACTION_VIEW);
        viewPDF.setDataAndType(Uri.parse("https://drive.google.com/open?id=0Byio6GQV9piwTlRkNDctS19Dd0h6QzMtaVQtS0hrRzU2Sktn"), "text/html");
        startActivity(viewPDF);
    }

}
