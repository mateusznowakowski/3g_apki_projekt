package com.example.maciejniedzielski.chinskiewrozby;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void klik(View view) {
        Intent tak = new Intent (Menu.this,Aktywnosc.class);
        startActivity(tak);
        finish();
    }

    public void wyjscie(View view) {
        finish();
    }

    public void gra(View view) {
        Intent nie = new Intent (Menu.this,clicker.class);
        startActivity(nie);
        finish();
    }

    public void kliq(View view) {
        Intent tak=new Intent(Menu.this,polski.class);
        startActivity(tak);
        finish();
    }
}
