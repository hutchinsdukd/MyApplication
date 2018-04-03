package com.example.kdhd.antonyms;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class Hello extends AppCompatActivity {

    DBHelp helper = new DBHelp(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello);
    }

    public void EButtonClick(View v)
    {
        if (v. getId() == R.id.Ebutton)
        {
            Intent i = new Intent(this, Enter.class);
            startActivity(i);
        }
    }

    public void FindAClick(View v)
    {
        if (v. getId() == R.id.Fbutton)
        {
            //read in word
            EditText word = (EditText)findViewById(R.id.find_word);
            String wordstr = word.getText().toString();

            String out = helper.findEntry(wordstr);

            //move to results page
            Intent j = new Intent(this, Result.class);
            j.putExtra("Word", wordstr);
            j.putExtra("Antonym", out);
            startActivity(j);
        }
    }
}

