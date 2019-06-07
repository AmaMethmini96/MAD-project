package com.example.asus.madproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_main);

        Button view;
        view = findViewById(R.id.button24);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ProfileMain.this,Profile.class);
                startActivity(i);


            }
        });

        Button update;
        update = findViewById(R.id.button22);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ProfileMain.this,UpdateProfile.class);
                startActivity(i);


            }
        });

        Button remove;
        remove = findViewById(R.id.button23);
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ProfileMain.this,RemoveProfile.class);
                startActivity(i);


            }
        });
    }
}
