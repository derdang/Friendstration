package com.hipplo.mypc.friendstration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class Friends extends AppCompatActivity{

    //private GoogleApiClient mGoogleApiClient;
    //GoogleApiClient.OnConnectionFailedListener
    EditText txtName, txtNum, txtMail;
    List<Contacts> ContactList = new ArrayList<Contacts>();
    ListView contactListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);
        setupButton();

        txtName = (EditText) findViewById(R.id.Name);
        txtNum = (EditText) findViewById(R.id.Phone);
        txtMail = (EditText) findViewById(R.id.Email);
      //  contactListView = (ListView) findViewById(R.id.listView);
        final Button button2 = (Button) findViewById(R.id.ok_button);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                addContacts(txtName.getText().toString(),txtNum.getText().toString(),txtMail.getText().toString());
                Toast.makeText(getApplicationContext(),txtName.getText().toString() + " has been added to your Friends List!",Toast.LENGTH_SHORT);
            }
        });
        txtName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                button2.setEnabled(!txtName.getText().toString().trim().isEmpty());
            }

            @Override

            public void afterTextChanged(Editable s) {

            }
        });
    }
    private void populateContacts(){
       // ArrayAdapter<Contacts>adapter = new ContactListAdapter();
      //  contactListView.setAdapter(adapter);
    }
    private void addContacts(String name,String phone,String email){
        ContactList.add(new Contacts(name,phone, email));
    }

    private class ContactListAdapter extends ArrayList<Contacts>{
        public ContactListAdapter(){
          //  super(Friends.this,R.layout.listview_item, ContactList);
        }

        public View getView(int position, View view, ViewGroup parent){
            if(view == null){
                view = getLayoutInflater().inflate(R.layout.listview_item,parent,false);
            }
            Contacts currentContacts = ContactList.get(position);
            TextView name = (TextView) view.findViewById(R.id.Name);
            name.setText(currentContacts.getName());
            TextView phoneNumber = (TextView) view.findViewById(R.id.Phone);
            phoneNumber.setText(currentContacts.getName());
            TextView email = (TextView) view.findViewById(R.id.Email);
            email.setText(currentContacts.getName());
            return view;
        }
    }

    private void setupButton() {
        //Image Buttons on Main Screen
        Button button1 = (Button) findViewById(R.id.Back);
        Button button2 = (Button) findViewById(R.id.ok_button);

        //Function of Buttons
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Friends.this, Main_Page.class));
            }
        });

    }
}
