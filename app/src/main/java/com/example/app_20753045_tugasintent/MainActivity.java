package com.example.app_20753045_tugasintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.example.app_20753045_tugasintent.BelajarIntent;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void message(View view) {
        String nomor = "080000000000" ;
        Intent messsage = new Intent(Intent. ACTION_VIEW);
        messsage.setData(Uri. fromParts("sms",nomor,null));
        startActivity(messsage);
    }
    public void buka(View view) {
        String url = "https://web.whatsapp.com/" ;
        Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }
    public void mengenai (View view) {
        Intent mengenai = new Intent(MainActivity.this, BelajarIntent.class);
        startActivity(mengenai);
    }
}