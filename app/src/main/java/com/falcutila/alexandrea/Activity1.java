package com.falcutila.alexandrea;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_1);
        Log.d("4ITF ", "onCreate has executed.... ");

        Intent i =  new Intent(this, MyService.class);
        startService(i);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITF ", "onStart has executed.... ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITF ", "onResume has executed.... ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITF ", "onPause has executed.... ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITF ", "onPause has executed.... ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITF ", "onRestart has executed.... ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITF ", "object is destroyed ");
    }

    public void display1(View v){
        Intent i = new Intent(this, Activity2.class);
        startActivity(i);
    }

    public void process(View v){
        Intent i = null, chooser = null;
        if(v.getId() == R.id.button2){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.4949966,120.6965191"));
            chooser = Intent.createChooser(i,"Select your map map");
            startActivity(chooser);

        }
    }

    }
