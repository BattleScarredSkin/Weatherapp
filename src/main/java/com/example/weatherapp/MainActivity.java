package com.example.weatherapp;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    public void search(View view) {
    }

    abstract class Weather extends AsyncTask{


        protected String doInBackground(String... address) {
            try {
                URL url = new URL(address[0]);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.connect();
                InputStream is = connection.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                int data = isr.read();
                String content = "";
                char ch;
                while (data > 0){
                    ch = (char) data;
                    content = content + ch;
                    data = isr.read();
                }
                Log.i("Content",content);
                return content;

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Activities","Success");

        String content;
        Weather weather = new Weather() {
            @Override
            protected Object doInBackground(Object[] objects) {
                return null;
            }
        };
        try {
            content = (String) weather.execute("https://openweathermap.org/data/2.5/weather?q=Asuncion&appid=API_KEY").get();
            Log.i("contentData",content);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}