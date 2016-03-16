package friendstration.mypc.hipplo.com.friendstration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Packages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_packages);
        setupButton();
    }
    private void setupButton() {
        //Image Buttons on Main Screen
        Button button1 = (Button) findViewById(R.id.Back);

        //Function of Buttons
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Packages.this, Main_Page.class));
            }
        });
    }
}
