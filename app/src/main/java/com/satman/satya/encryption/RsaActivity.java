package com.satman.satya.encryption;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.satman.satya.encryption.help.RSA;

import java.io.DataInputStream;

public class RsaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rsa);



        RSA rsa = new RSA();
      //  DataInputStream in = new DataInputStream(System.in);
        String teststring="satyanarayana";
        Log.d("String_original :",teststring);
      /*  System.out.println("Enter the plain text:");
        teststring = in.readLine();*/
        System.out.println("Encrypting String: " + teststring);
    //    System.out.println("String in Bytes: " + bytesToString(teststring.getBytes()));
        // encrypt
        byte[] encrypted = rsa.encrypt(teststring.getBytes());
        Log.d("String_encrypted :",encrypted.toString());
        // decrypt
        byte[] decrypted = rsa.decrypt(encrypted);
        Log.d("String_decrypted :",decrypted.toString());
     //   System.out.println("Decrypting Bytes: " + bytesToString(decrypted));
        System.out.println("Decrypted String: " + new String(decrypted));



    }



}
