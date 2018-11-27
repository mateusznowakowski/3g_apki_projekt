package com.example.maciejniedzielski.chinskiewrozby;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int oczekiwanie = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                Intent abcd = new Intent (MainActivity.this,Menu.class);
                startActivity(abcd);
                finish();

            }
        },oczekiwanie);
    }

}
