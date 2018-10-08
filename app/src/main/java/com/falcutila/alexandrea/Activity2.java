package com.falcutila.alexandrea;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_2);
        Log.d("4ITF ", "onCreate has executed.... ");
    }

    public void display2(View v){
        Intent i = new Intent(this, Activity1.class);
        startActivity(i);
    }

    public void process(View v){
        Intent i = null, chooser = null;
        if(v.getId() == R.id.button4){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5869371,120.9790588"));
            chooser = Intent.createChooser(i,"Select your map app");
            startActivity(chooser);

        }
    }
}
