package com.satman.satya.encryption;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // base 64 encryption
        String s1= "sathyanarayana";
        byte[] a = s1.getBytes();
        byte[] b = Base64.encodeBase64(a);
        String s2= new String(b);
        Log.d("login1",s2);


        //base64 decryption
        byte[] c= s2.getBytes();
        byte[] d= Base64.decodeBase64(c);
        String s3= new String(d);
        Log.d("login2",s3);




    }








}
