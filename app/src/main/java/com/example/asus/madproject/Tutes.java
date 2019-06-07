package com.example.asus.madproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tutes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutes);

        Button add;
        add = findViewById(R.id.button2);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tutes.this,Add_Exams.class);
                startActivity(i);
            }
        });


        Button update;
        update = findViewById(R.id.button3);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tutes.this,Exam_Details.class);
                startActivity(i);
            }
        });

        Button delete;
        delete = findViewById(R.id.button4);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tutes.this,Exam_Details.class);
                startActivity(i);
            }
        });

        Button list;
        list = findViewById(R.id.button12);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tutes.this,Exam_List.class);
                startActivity(i);
            }
        });
    }
}
