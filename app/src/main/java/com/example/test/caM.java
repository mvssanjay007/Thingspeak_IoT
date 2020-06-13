package com.example.test;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class caM extends AppCompatActivity {
WebView caM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ca_m);
        caM = (WebView) findViewById(R.id.caM);
        CharSequence text = "Wait for camera!!!!!";
        int duration = Toast.LENGTH_SHORT;
        Toast toastcam = Toast.makeText(getApplicationContext(), text, duration);
        toastcam.show();
        caM.loadUrl("https://thickening-puffin-7549.dataplicity.io/javascript_simple.html");
    }
}
