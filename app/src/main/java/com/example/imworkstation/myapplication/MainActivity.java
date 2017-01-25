package com.example.imworkstation.myapplication;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;



public class MainActivity extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton ibt1 = (ImageButton) findViewById(R.id.ib1);
        ibt1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent int1= new Intent(MainActivity.this,yardimActivity.class);
                startActivity(int1);
            }
        });

    }

};


