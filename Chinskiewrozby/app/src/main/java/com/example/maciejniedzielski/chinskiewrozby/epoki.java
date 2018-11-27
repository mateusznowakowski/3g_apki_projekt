package com.example.maciejniedzielski.chinskiewrozby;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class epoki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epoki);
    }

    public void b1(View view) {
    }

    public void b2(View view) {
    }

    public void b3(View view) {
    }

    public void b4(View view) {
    }

    public void b5(View view) {
    }

    public void b6(View view) {
    }

    public void b7(View view) {
    }

    public void b8(View view) {
    }

    public void b9(View view) {
    }

    public void b10(View view) {
    }

    public void b11(View view) {
        Intent tak=new Intent(epoki.this,polski.class);
        startActivity(tak);
        finish();
    }
}
