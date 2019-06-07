package com.example.asus.madproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button profile;
        profile = findViewById(R.id.button15);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(dashboard.this,ProfileMain.class);
                startActivity(i);


            }
        });

        Button cls;
        cls = findViewById(R.id.button16);
        cls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(dashboard.this,ClassMain.class);
                startActivity(i);


            }
        });

        Button stu;
        stu = findViewById(R.id.button17);
        stu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(dashboard.this,Student.class);
                startActivity(i);


            }
        });

        Button result;
        result = findViewById(R.id.button18);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(dashboard.this,Results.class);
                startActivity(i);


            }
        });

        Button tute;
        tute = findViewById(R.id.button19);
        tute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(dashboard.this,Tutes.class);
                startActivity(i);


            }
        });

        Button report;
        report = findViewById(R.id.button20);
        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(dashboard.this,dashboard.class);
                startActivity(i);


            }
        });

    }
}
