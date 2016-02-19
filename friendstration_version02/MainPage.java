package com.hipplo.mypc.friendstration_version02;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        setupButton();
    }

    private void setupButton() {
        //Image Buttons on Main Screen
        ImageButton button1 = (ImageButton) findViewById(R.id.Home);
        ImageButton button2 = (ImageButton) findViewById(R.id.Friends);
        ImageButton button3 = (ImageButton) findViewById(R.id.Package);
        ImageButton button4 = (ImageButton) findViewById(R.id.Info);
        ImageButton button5 = (ImageButton) findViewById(R.id.Notification);

        //Function of Buttons
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainPage.this, "Already Home", Toast.LENGTH_LONG).show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPage.this,Info_Section.class));
            }
        });
    }
}
