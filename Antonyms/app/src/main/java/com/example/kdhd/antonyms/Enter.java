package com.example.kdhd.antonyms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Enter extends AppCompatActivity {

    DBHelp helper = new DBHelp(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
    }

    public void SubmitEClick(View v)
    {
        if (v. getId() == R.id.SubEButton)
        {
            //read input
            EditText word = (EditText)findViewById(R.id.InputWord);
            EditText antonym = (EditText)findViewById(R.id.InputAntn);

            String wordstr = word.getText().toString();
            String antonymstr = antonym.getText().toString();

            //insert into db
            Thesarus t = new Thesarus();
            t.setWord(wordstr);
            t.setAntn(antonymstr);

            helper.newEntry(t);

            //return to home screen
            Intent j = new Intent(this, Hello.class);
            startActivity(j);
        }
    }
}
