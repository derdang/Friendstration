package com.example.costco1.friendspage;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import android.content.Intent;

public class FriendsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_page);
        setupButton();
    }

    private void setupButton() {
        //Image Buttons on Main Screen
        Button button1 = (Button) findViewById(R.id.Back);
        ImageButton button2 = (ImageButton) findViewById(R.id.my_space);
        final QuickContactBadge icon1 = (QuickContactBadge) findViewById(R.id.person);
        final TextView text1 = (TextView) findViewById(R.id.name);
        final TextView text6 = (TextView) findViewById(R.id.textView);
        final TextView text2 = (TextView) findViewById(R.id.textView2);
        final TextView text3 = (TextView) findViewById(R.id.textView3);
        final TextView text4 = (TextView) findViewById(R.id.textView4);
        final TextView text5 = (TextView) findViewById(R.id.textView5);
        final TextView text7 = (TextView) findViewById(R.id.textView6);
        final QuickContactBadge icon2 = (QuickContactBadge) findViewById(R.id.person2);
        final QuickContactBadge icon3 = (QuickContactBadge) findViewById(R.id.person3);
        final QuickContactBadge icon4 = (QuickContactBadge) findViewById(R.id.person4);
        final QuickContactBadge icon5 = (QuickContactBadge) findViewById(R.id.person5);
        final QuickContactBadge icon6 = (QuickContactBadge) findViewById(R.id.person6);
        final QuickContactBadge icon7 = (QuickContactBadge) findViewById(R.id.person7);

        //Function of Buttons
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FriendsPage.this, Main_Page.class));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FriendsPage.this, "Opening Friends list on this Site", Toast.LENGTH_LONG);
                icon1.setVisibility(View.VISIBLE);
                icon2.setVisibility(View.VISIBLE);
                icon3.setVisibility(View.VISIBLE);
                icon4.setVisibility(View.VISIBLE);
                text1.setVisibility(View.VISIBLE);
                text2.setVisibility(View.VISIBLE);
                text3.setVisibility(View.VISIBLE);
                text4.setVisibility(View.VISIBLE);
                text5.setVisibility(View.VISIBLE);
                text6.setVisibility(View.VISIBLE);
                text7.setVisibility(View.VISIBLE);


            }
        });

        icon1.assignContactFromEmail("any@gmail.com", true);
        icon1.setMode(ContactsContract.QuickContact.MODE_SMALL);

        icon2.assignContactFromEmail("any@gmail.com", true);
        icon2.setMode(ContactsContract.QuickContact.MODE_SMALL);

        icon3.assignContactFromEmail("any@gmail.com", true);
        icon3.setMode(ContactsContract.QuickContact.MODE_SMALL);

        icon4.assignContactFromEmail("any@gmail.com", true);
        icon4.setMode(ContactsContract.QuickContact.MODE_SMALL);

        icon5.assignContactFromEmail("any@gmail.com", true);
        icon5.setMode(ContactsContract.QuickContact.MODE_SMALL);

        icon6.assignContactFromEmail("any@gmail.com", true);
        icon6.setMode(ContactsContract.QuickContact.MODE_SMALL);

        icon7.assignContactFromEmail("any@gmail.com", true);
        icon7.setMode(ContactsContract.QuickContact.MODE_SMALL);



    }
}


