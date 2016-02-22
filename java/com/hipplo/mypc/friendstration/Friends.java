package com.hipplo.mypc.friendstration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Friends extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);
        setupButton();
    }

    private void setupButton() {
        //Image Buttons on Main Screen
        Button button1 = (Button) findViewById(R.id.Back);

        //Function of Buttons
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Friends.this,Main_Page.class));
            }
        });
    }
}
