package com.example.maciejniedzielski.chinskiewrozby;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ort extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ort);
    }

    public void wroc(View view) {
        Intent nie= new Intent(ort.this,polski.class);
        startActivity(nie);
        finish();
    }
}
