package com.merin.clickevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public void buttonClicked(View view){
        if (view == findViewById(R.id.button1)) {
            Log.i("merin", "buttonClicked: 1");
        }
        else if (view == findViewById(R.id.button2)) {
            Log.i("merin", "buttonClicked: 2");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}