package com.example.maciejniedzielski.chinskiewrozby;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class clicker extends AppCompatActivity {
long a=0;
String c="+10";
String c1="+100";
String c2="+1000";
String c3="+50000";
String c4="*2";

    Button b;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicker);
    }


    public void jeden(View view) {
        b=(Button) findViewById(R.id.button8);
        b1=(Button) findViewById(R.id.button7);
        b2=(Button) findViewById(R.id.button9);
        b3=(Button) findViewById(R.id.button10);
        b4=(Button) findViewById(R.id.button11);
        if(a>=9) b.setText(c);
        if(a>=99) b1.setText(c1);
        if(a>=999) b2.setText(c2);
        if(a>=49999) b3.setText(c3);
        if(a>=1499999) b4.setText(c4);
        TextView tv =(TextView) findViewById(R.id.textView3);
        a+=1;
        tv.setText(String.valueOf(a));

    }

    public void sto(View view) {
        b2=(Button) findViewById(R.id.button9);
        b3=(Button) findViewById(R.id.button10);
        b4=(Button) findViewById(R.id.button11);
        if(a>=900) b2.setText(c2);
        if(a>=49900) b3.setText(c3);
        if(a>=1499900) b4.setText(c4);
        TextView tv =(TextView) findViewById(R.id.textView3);
        if(a>=100) {
            a += 100;
            tv.setText(String.valueOf(a));

        }
    }

    public void ten(View view) {
        b=(Button) findViewById(R.id.button8);
        b2=(Button) findViewById(R.id.button9);
        b3=(Button) findViewById(R.id.button10);
        b4=(Button) findViewById(R.id.button11);
        if(a>=90) b1.setText(c1);
        if(a>=990) b2.setText(c2);
        if(a>=49990) b3.setText(c3);
        if(a>=1499990) b4.setText(c4);

        TextView tv =(TextView) findViewById(R.id.textView3);
        if(a>=10) {
            a += 10;
            tv.setText(String.valueOf(a));
        }
    }

    public void tys(View view) {
        b3=(Button) findViewById(R.id.button10);
        b4=(Button) findViewById(R.id.button11);
        if(a>=49000) b3.setText(c3);
        if(a>=1499000) b4.setText(c4);
        TextView tv =(TextView) findViewById(R.id.textView3);
        if(a>=1000) {
            a += 1000;
            tv.setText(String.valueOf(a));
        }
    }

    public void mil(View view) {
        b4=(Button) findViewById(R.id.button11);
        if(a>=950000) b4.setText(c4);
        TextView tv =(TextView) findViewById(R.id.textView3);
        if(a>=50000) {
            a += 50000;
            tv.setText(String.valueOf(a));
        }
    }

    public void dwa(View view) {
        TextView tv =(TextView) findViewById(R.id.textView3);
        if(a>=1000000) {
            a *= 2;
            tv.setText(String.valueOf(a));
        }
    }

    public void back(View view) {
        Intent nie = new Intent(clicker.this,Menu.class);
        startActivity(nie);
        finish();
    }
}
