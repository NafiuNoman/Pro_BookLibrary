package com.example.youbooklibrary;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyDatabaseHelper extends SQLiteOpenHelper {

    Context context;


    private static final String DATABASE_NAME = "BookLibrary.db";
    private static final int DATABASE_Version = 2;


    private static final String Table_Name = "my_library";
    private static final String Column_Id = "_id";
    private static final String Column_Title = "book_title";
    private static final String Column_Author = "book_author";
    private static final String Column_Pages = "book_pages";

    public MyDatabaseHelper(@Nullable Context context)
    {

        super(context, DATABASE_NAME, null, DATABASE_Version);
        this.context=context;

    }

    @Override
    public void onCreate(SQLiteDatabase db) {


        //Toast.makeText(context, "from the On creat", Toast.LENGTH_LONG).show();

        db.execSQL("CREATE TABLE my_library (_id INTEGER PRIMARY KEY AUTOINCREMENT, book_title TEXT, book_author TEXT, book_pages INTEGER)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS my_library");
        onCreate(db);

    }

    public void add()

    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        //not working beacuse i was put this line of code it will set row =-1  beacuse its autoincrement and we dont need to gives its value
        // contentValues.put("-id",1);

        contentValues.put("book_title","harry potter");
        contentValues.put("book_author","koana");
        contentValues.put("book_pages",400);

        Long row= database.insert("my_library",null,contentValues);
        
        if(row==-1)
        {
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show();
            
        }else
        {
            Toast.makeText(context, "Added successfully", Toast.LENGTH_SHORT).show();
        }


    }



}
