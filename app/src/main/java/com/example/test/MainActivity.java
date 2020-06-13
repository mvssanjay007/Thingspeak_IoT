package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button lonb = findViewById(R.id.LON);
        lonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OkHttpClient client = new OkHttpClient();
                 String url = "https://api.thingspeak.com/update.json?api_key=18RMYZHYS6PNBCQA&field2=1";
                Request request = new Request.Builder().url(url).build();
                client.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        System.out.println("failed");
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        System.out.println("done");

                    }
                });

            }
        });
        Button loffb = findViewById(R.id.LOFF);
        loffb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OkHttpClient client = new OkHttpClient();
                String url = "https://api.thingspeak.com/update.json?api_key=18RMYZHYS6PNBCQA&field2=1";
                Request request = new Request.Builder().url(url).build();
                client.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        System.out.println("failed");
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        System.out.println("done");

                    }
                });
            }
        });
        Button came = findViewById(R.id.CAM);
        came.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3= new Intent(MainActivity.this, caM.class);
                startActivity(i3);
            }
        });
        Button fon = findViewById(R.id.FON);
        fon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OkHttpClient client = new OkHttpClient();
                String url = "https://api.thingspeak.com/update.json?api_key=18RMYZHYS6PNBCQA&field2=1";
                Request request = new Request.Builder().url(url).build();
                client.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        System.out.println("failed");
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        System.out.println("done");

                    }
                });

            }
        });
        Button foffb = findViewById(R.id.FOFF);
        foffb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OkHttpClient client = new OkHttpClient();
                String url = "https://api.thingspeak.com/update.json?api_key=18RMYZHYS6PNBCQA&field2=1";
                Request request = new Request.Builder().url(url).build();
                client.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        System.out.println("failed");
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        System.out.println("done");

                    }
                });

            }
        });
    }
}
