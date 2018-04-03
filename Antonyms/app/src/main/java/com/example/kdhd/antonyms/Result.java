package com.example.kdhd.antonyms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String input = getIntent().getStringExtra("Word");
        String output = getIntent().getStringExtra("Antonym");

        TextView a = (TextView)findViewById(R.id.wordIn);
        TextView b = (TextView)findViewById(R.id.wordOut);
        a.setText(input);
        b.setText(output);
    }

    public void BackClick(View v)
    {
        if (v. getId() == R.id.BackButton)
        {
            Intent j = new Intent(this, Hello.class);
            startActivity(j);
        }
    }
}
