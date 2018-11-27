package com.example.maciejniedzielski.chinskiewrozby;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class polski extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polski);
    }

    public void klick(View view) {
        Intent tak = new Intent(polski.this,epoki.class);
        startActivity(tak);
        finish();
    }

    public void wroc(View view) {
        Intent tak = new Intent(polski.this,Menu.class);
        startActivity(tak);
        finish();
    }

    public void motyw(View view) {
        Intent tak=new Intent(polski.this,motywy.class);
        startActivity(tak);
        finish();
    }

    public void ort(View view) {
        Intent tak=new Intent(polski.this,ort.class);
        startActivity(tak);
        finish();
    }
}
