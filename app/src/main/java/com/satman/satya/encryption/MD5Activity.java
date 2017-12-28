package com.satman.satya.encryption;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.satman.satya.encryption.help.MD5;

public class MD5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_md5);


        //MD5 encryption
        System.out.println("---MD5---");
        System.out.println("input string to MD5: satyanarayana");
        System.out.println("output of MD5"+ MD5.getMD5("satyanarayana"));


        //note: MD5 (Message-Digest algorithm 5) is a widely used cryptographic hash function with a 128-bit hash value, specified in RFC 1321




    }
}
