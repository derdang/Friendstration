package com.hipplo.mypc.friendstration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Packages extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_packages);
        setupButton();
    }
    private void setupButton() {
        //Image Buttons on Main Screen
        Button button1 = (Button) findViewById(R.id.Back);
        Button button2 = (Button) findViewById(R.id.purchase);
        Button button3 = (Button) findViewById(R.id.button);
        Button button4 = (Button) findViewById(R.id.button2);
        Button button5 = (Button) findViewById(R.id.button3);

        //Function of Buttons
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Packages.this, Main_Page.class));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Packages.this, "Feature Locked Right now~~", Toast.LENGTH_LONG);
            }
        });
    }
}
