package com.satman.satya.encryption;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void satbase64(View view) {

        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    public void satsha1(View view) {

        startActivity(new Intent(getApplicationContext(), Sha1Activity.class));
    }


    public void satrsa(View view) {

        startActivity(new Intent(getApplicationContext(), RsaActivity.class));

    }

    public void satmd5(View view) {

        startActivity(new Intent(getApplicationContext(), MD5Activity.class));

    }
}
