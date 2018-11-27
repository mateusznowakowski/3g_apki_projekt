package com.example.maciejniedzielski.chinskiewrozby;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Aktywnosc extends AppCompatActivity {
    private static int czekaj = 2137;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktywnosc);



    }

    public void klik(View view) {
        Random generator = new Random();
        int a=generator.nextInt(129);
        Resources res = getResources();
        TextView tv = (TextView) findViewById(R.id.textView2);
        Button b = (Button) findViewById(R.id.button);
        ImageView iv = (ImageView) findViewById(R.id.imageView);

        if(a==1){
        String t = res.getString(R.string.a0);
        tv.setText(t);
        }
        else if(a==2){
            String t = res.getString(R.string.a1);
            tv.setText(t);
        }
        else if(a==3){
            String t = res.getString(R.string.a2);
            tv.setText(t);
        }
        else if(a==4){
            String t = res.getString(R.string.a3);
            tv.setText(t);
        }
        else if(a==5){
            String t = res.getString(R.string.a4);
            tv.setText(t);
        }
        else if(a==6){
            String t = res.getString(R.string.a5);
            tv.setText(t);
        }
        else if(a==7){
            String t = res.getString(R.string.a6);
            tv.setText(t);
        }
        else if(a==8){
            String t = res.getString(R.string.a7);
            tv.setText(t);
        }
        else if(a==9){
            String t = res.getString(R.string.a8);
            tv.setText(t);
        }
        else if(a==10){
            String t = res.getString(R.string.a9);
            tv.setText(t);
        }
        else if(a==11){
            String t = res.getString(R.string.a10);
            tv.setText(t);
        }
        else if(a==12){
            String t = res.getString(R.string.a11);
            tv.setText(t);
        }
        else if(a==13){
            String t = res.getString(R.string.a12);
            tv.setText(t);
        }
        else if(a==14){
            String t = res.getString(R.string.a13);
            tv.setText(t);
        }
        else if(a==15){
            String t = res.getString(R.string.a14);
            tv.setText(t);
        }
        else if(a==16){
            String t = res.getString(R.string.a15);
            tv.setText(t);
        }
        else if(a==17){
            String t = res.getString(R.string.a16);
            tv.setText(t);
        }
        else if(a==18){
            String t = res.getString(R.string.a17);
            tv.setText(t);
        }
        else if(a==19){
            String t = res.getString(R.string.a18);
            tv.setText(t);
        }
        else if(a==20){
            String t = res.getString(R.string.a19);
            tv.setText(t);
        }
        else if(a==21){
            String t = res.getString(R.string.a20);
            tv.setText(t);
        }
        else if(a==22){
            String t = res.getString(R.string.a21);
            tv.setText(t);
        }
        else if(a==23){
            String t = res.getString(R.string.a22);
            tv.setText(t);
        }
        else if(a==24){
            String t = res.getString(R.string.a23);
            tv.setText(t);
        }
        else if(a==25){
            String t = res.getString(R.string.a24);
            tv.setText(t);
        }
        else if(a==26){
            String t = res.getString(R.string.a25);
            tv.setText(t);
        }
        else if(a==27){
            String t = res.getString(R.string.a26);
            tv.setText(t);
        }
        else if(a==28){
            String t = res.getString(R.string.a27);
            tv.setText(t);
        }
        else if(a==29){
            String t = res.getString(R.string.a28);
            tv.setText(t);
        }
        else if(a==30){
            String t = res.getString(R.string.a29);
            tv.setText(t);
        }

        else if(a==31){
            String t = res.getString(R.string.a30);
            tv.setText(t);
        }
        else if(a==32){
            String t = res.getString(R.string.a31);
            tv.setText(t);
        }
        else if(a==33){
            String t = res.getString(R.string.a32);
            tv.setText(t);
        }
        else if(a==34){
            String t = res.getString(R.string.a33);
            tv.setText(t);
        }
        else if(a==35){
            String t = res.getString(R.string.a34);
            tv.setText(t);
        }
        else if(a==36){
            String t = res.getString(R.string.a35);
            tv.setText(t);
        }
        else if(a==37){
            String t = res.getString(R.string.a36);
            tv.setText(t);
        }
        else if(a==38){
            String t = res.getString(R.string.a37);
            tv.setText(t);
        }
        else if(a==39){
            String t = res.getString(R.string.a38);
            tv.setText(t);
        }
        else if(a==40){
            String t = res.getString(R.string.a39);
            tv.setText(t);
        }
        else if(a==41){
            String t = res.getString(R.string.a40);
            tv.setText(t);
        }
        else if(a==42){
            String t = res.getString(R.string.a41);
            tv.setText(t);
        }
        else if(a==43){
            String t = res.getString(R.string.a42);
            tv.setText(t);
        }
        else if(a==44){
            String t = res.getString(R.string.a43);
            tv.setText(t);
        }
        else if(a==45){
            String t = res.getString(R.string.a44);
            tv.setText(t);
        }
        else if(a==46){
            String t = res.getString(R.string.a45);
            tv.setText(t);
        }
        else if(a==47){
            String t = res.getString(R.string.a46);
            tv.setText(t);
        }
        else if(a==48){
            String t = res.getString(R.string.a47);
            tv.setText(t);
        }
        else if(a==49){
            String t = res.getString(R.string.a48);
            tv.setText(t);
        }
        else if(a==50){
            String t = res.getString(R.string.a49);
            tv.setText(t);
        }
        else if(a==51){
            String t = res.getString(R.string.a50);
            tv.setText(t);
        }
        else if(a==52){
            String t = res.getString(R.string.a51);
            tv.setText(t);
        }
        else if(a==53){
            String t = res.getString(R.string.a52);
            tv.setText(t);
        }
        else if(a==54){
            String t = res.getString(R.string.a53);
            tv.setText(t);
        }
        else if(a==55){
            String t = res.getString(R.string.a54);
            tv.setText(t);
        }
        else if(a==56){
            String t = res.getString(R.string.a55);
            tv.setText(t);
        }
        else if(a==57){
            String t = res.getString(R.string.a56);
            tv.setText(t);
        }
        else if(a==58){
            String t = res.getString(R.string.a57);
            tv.setText(t);
        }
        else if(a==59){
            String t = res.getString(R.string.a58);
            tv.setText(t);
        }
        else if(a==60){
            String t = res.getString(R.string.a59);
            tv.setText(t);
        }
        else if(a==61){
            String t = res.getString(R.string.a60);
            tv.setText(t);
        }
        else if(a==62){
            String t = res.getString(R.string.a61);
            tv.setText(t);
        }
        else if(a==64){
            String t = res.getString(R.string.a63);
            tv.setText(t);
        }
        else if(a==65){
            String t = res.getString(R.string.a64);
            tv.setText(t);
        }
        else if(a==66){
            String t = res.getString(R.string.a65);
            tv.setText(t);
        }
        else if(a==67){
            String t = res.getString(R.string.a66);
            tv.setText(t);
        }
        else if(a==68){
            String t = res.getString(R.string.a67);
            tv.setText(t);
        }
        else if(a==69){
            String t = res.getString(R.string.a68);
            tv.setText(t);
        }
        else if(a==70){
            String t = res.getString(R.string.a69);
            tv.setText(t);
        }
        else if(a==71){
            String t = res.getString(R.string.a70);
            tv.setText(t);
        }
        else if(a==72){
            String t = res.getString(R.string.a71);
            tv.setText(t);
        }
        else if(a==73){
            String t = res.getString(R.string.a72);
            tv.setText(t);
        }
        else if(a==74){
            String t = res.getString(R.string.a73);
            tv.setText(t);
        }
        else if(a==75){
            String t = res.getString(R.string.a74);
            tv.setText(t);
        }
        else if(a==76){
            String t = res.getString(R.string.a75);
            tv.setText(t);
        }
        else if(a==77){
            String t = res.getString(R.string.a76);
            tv.setText(t);
        }
        else if(a==78){
            String t = res.getString(R.string.a77);
            tv.setText(t);
        }
        else if(a==79){
            String t = res.getString(R.string.a78);
            tv.setText(t);
        }
        else if(a==80){
            String t = res.getString(R.string.a79);
            tv.setText(t);
        }
        else if(a==81){
            String t = res.getString(R.string.a80);
            tv.setText(t);
        }
        else if(a==82){
            String t = res.getString(R.string.a81);
            tv.setText(t);
        }
                else if(a==83){
            String t = res.getString(R.string.a82);
            tv.setText(t);
        }
        else if(a==84){
            String t = res.getString(R.string.a83);
            tv.setText(t);
        }
        else if(a==85){
            String t = res.getString(R.string.a84);
            tv.setText(t);
        }
        else if(a==86){
            String t = res.getString(R.string.a85);
            tv.setText(t);
        }
        else if(a==87){
            String t = res.getString(R.string.a86);
            tv.setText(t);
        }
        else if(a==88){
            String t = res.getString(R.string.a87);
            tv.setText(t);
        }
        else if(a==89){
            String t = res.getString(R.string.a88);
            tv.setText(t);
        }
        else if(a==90){
            String t = res.getString(R.string.a89);
            tv.setText(t);
        }
        else if(a==91){
            String t = res.getString(R.string.a90);
            tv.setText(t);
        }
        else if(a==92){
            String t = res.getString(R.string.a91);
            tv.setText(t);
        }
        else if(a==93){
            String t = res.getString(R.string.a92);
            tv.setText(t);
        }
        else if(a==94){
            String t = res.getString(R.string.a93);
            tv.setText(t);
        }
        else if(a==95){
            String t = res.getString(R.string.a94);
            tv.setText(t);
        }
        else if(a==96){
            String t = res.getString(R.string.a95);
            tv.setText(t);
        }
        else if(a==97){
            String t = res.getString(R.string.a96);
            tv.setText(t);
        }
        else if(a==98){
            String t = res.getString(R.string.a97);
            tv.setText(t);
        }
        else if(a==99){
            String t = res.getString(R.string.a98);
            tv.setText(t);
        }
        else if(a==100){
            String t = res.getString(R.string.a99);
            tv.setText(t);
        }
        else if(a==101){
            String t = res.getString(R.string.a100);
            tv.setText(t);
        }
        else if(a==102){
            String t = res.getString(R.string.a101);
            tv.setText(t);
        }
        else if(a==103){
            String t = res.getString(R.string.a102);
            tv.setText(t);
        }
        else if(a==104){
            String t = res.getString(R.string.a103);
            tv.setText(t);
        }
        else if(a==105){
            String t = res.getString(R.string.a104);
            tv.setText(t);
        }
        else if(a==106){
            String t = res.getString(R.string.a105);
            tv.setText(t);
        }
        else if(a==107){
            String t = res.getString(R.string.a106);
            tv.setText(t);
        }
        else if(a==108){
            String t = res.getString(R.string.a107);
            tv.setText(t);
        }
        else if(a==109){
            String t = res.getString(R.string.a108);
            tv.setText(t);
        }
        else if(a==110){
            String t = res.getString(R.string.a109);
            tv.setText(t);
        }
        else if(a==111){
            String t = res.getString(R.string.a110);
            tv.setText(t);
        }
        else if(a==112){
            String t = res.getString(R.string.a111);
            tv.setText(t);
        }
        else if(a==113){
            String t = res.getString(R.string.a112);
            tv.setText(t);
        }
        else if(a==114){
            String t = res.getString(R.string.a113);
            tv.setText(t);
        }
        else if(a==115){
            String t = res.getString(R.string.a114);
            tv.setText(t);
        }
        else if(a==116){
            String t = res.getString(R.string.a115);
            tv.setText(t);
        }
        else if(a==117){
            String t = res.getString(R.string.a116);
            tv.setText(t);
        }
        else if(a==118){
            String t = res.getString(R.string.a117);
            tv.setText(t);
        }
        else if(a==119){
            String t = res.getString(R.string.a118);
            tv.setText(t);
        }
        else if(a==120){
            String t = res.getString(R.string.a119);
            tv.setText(t);
        }
        else if(a==121){
            String t = res.getString(R.string.a120);
            tv.setText(t);
        }
        else if(a==122){
            String t = res.getString(R.string.a121);
            tv.setText(t);
        }
        else if(a==123){
            String t = res.getString(R.string.a122);
            tv.setText(t);
        }
        else if(a==124){
            String t = res.getString(R.string.a123);
            tv.setText(t);
        }
        else if(a==125){
            String t = res.getString(R.string.a124);
            tv.setText(t);
        }
        else if(a==126){
            String t = res.getString(R.string.a125);
            tv.setText(t);
        }
        else if(a==127){
            String t = res.getString(R.string.a126);
            tv.setText(t);
        }
        else if(a==128){
            String t = res.getString(R.string.a127);
            tv.setText(t);
        }




        iv.setImageResource(R.drawable.ciacho2);
        new Handler().postDelayed(new Runnable() {
            public void run(){
            ImageView iv = (ImageView) findViewById(R.id.imageView);
            TextView tv = (TextView) findViewById(R.id.textView2);
            iv.setImageResource(R.drawable.ciacho);
            tv.setText("");}
        },czekaj);

    }

    public void menu(View view) {
        Intent tak = new Intent (Aktywnosc.this,Menu.class);
        startActivity(tak);
        finish();
    }
}
