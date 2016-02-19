package com.hipplo.mypc.friendstration_version02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Info_Section extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info__section);
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
                startActivity(new Intent(Info_Section.this, MainPage.class));

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Info_Section.this, "Current Page", Toast.LENGTH_LONG).show();
            }
        });
    }
}
