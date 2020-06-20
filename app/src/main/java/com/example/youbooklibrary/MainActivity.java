package com.example.youbooklibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    RecyclerView view;
    FloatingActionButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        view = findViewById(R.id.recyclerView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // MyDatabaseHelper myDatabaseHelper =new MyDatabaseHelper(this);
                //SQLiteDatabase sqLiteDatabase = myDatabaseHelper.getWritableDatabase();

                Intent intent= new Intent(MainActivity.this,addActivity.class);
                startActivity(intent);



        }
        });









    }
}
