package com.example.asus.madproject;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import javax.net.ssl.SNIMatcher;

public class ClassMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_main);


        Button Add;
        Add = findViewById(R.id.button2);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClassMain.this,Add_New_Class.class);
                startActivity(i);
            }
        });

        Button update;
        update = findViewById(R.id.button3);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClassMain.this,Class_Details.class);
                startActivity(i);
            }
        });

        Button remove;
        remove = findViewById(R.id.button4);
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClassMain.this,Class_Details.class);
                startActivity(i);
            }
        });

        Button list;
        list = findViewById(R.id.button12);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClassMain.this,Class_List.class);
                startActivity(i);
            }
        });



    }


}
