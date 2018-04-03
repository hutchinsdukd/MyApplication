package com.example.kdhd.antonyms;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

public class DBHelp extends SQLiteOpenHelper {

    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "dictionary.db";
    private static final String TABLE_NAME = "thesaurus";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_WORD = "word";
    private static final String COLUMN_ANTN = "antonym";
    SQLiteDatabase db;
    private static final String TABLE_CREATE = "create table thesaurus " +
            "(id integer primary key not null, word text not null, antonym text not null);";

    public DBHelp(Context context){
        super(context, DB_NAME, null, DB_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(TABLE_CREATE);
        this.db = db;
    }

    public void newEntry(Thesarus t){
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query2 = "select * from thesaurus";
        Cursor cursor = db.rawQuery(query2, null);
        int count = cursor.getCount();

        values.put(COLUMN_ID, count);
        values.put(COLUMN_WORD, t.getWord());
        values.put(COLUMN_ANTN, t.getAntn());

        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    public String findEntry(String inputW){
        db = this.getReadableDatabase();

        String query1 = "select * from " +TABLE_NAME;
        Cursor cursor = db.rawQuery(query1, null);

        String a, b;
        b = "not found";

        if (cursor.moveToFirst()){
            do {
                a = cursor.getString(0);

                if(a.equals(inputW)){
                    b = cursor.getString(1);
                    break;
                }
            }
            while(cursor.moveToNext());
        }
        return b;

        //db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        String query = "DROP TABLE IF EXISTS " +TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);

    }
}
