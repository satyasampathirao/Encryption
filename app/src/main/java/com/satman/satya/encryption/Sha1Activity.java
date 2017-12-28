package com.satman.satya.encryption;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.apache.commons.codec.binary.Hex;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sha1);


        //this is for sha1 encryption

        String password= "satyanarayana";
        System.out.println("original password : "+password);

        //encryption
        String encpassword= encryptPassword(password);
        System.out.println("encrypted password : "+encpassword);




        //note: u can decrypt sha1 directly



    }



    public static String encryptPassword(String password)
    {
        String sha1 = "";
        try
        {
            MessageDigest crypt = MessageDigest.getInstance("SHA-1");
            crypt.reset();
            crypt.update(password.getBytes("UTF-8"));
            // sha1 = byteToHex(crypt.digest());

            byte[] b= sha1.getBytes();
            sha1=  Hex.encodeHexString( b );

        }
        catch(NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        catch(UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
        return sha1;
    }


}
