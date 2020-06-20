package com.example.youbooklibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class addActivity extends AppCompatActivity {

    EditText authorName;
    EditText pageNumber;
    EditText bookTitle;

    Button addbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        authorName=findViewById(R.id.author_input);
        pageNumber=findViewById(R.id.pages_input);
        bookTitle=findViewById(R.id.tilte_input);

        addbtn=findViewById(R.id.add_btn);

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MyDatabaseHelper myDatabaseHelper=new MyDatabaseHelper(addActivity.this);

                myDatabaseHelper.add();


            }
        });



    }
}
