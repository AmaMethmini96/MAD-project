package com.example.asus.madproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RemoveProfile extends AppCompatActivity {

    protected Button mybutton;
    String mystring = "Profile Removed.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove_profile);

        mybutton = (Button)findViewById(R.id.button26);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),mystring,Toast.LENGTH_LONG).show();
            }
        });
    }
}
