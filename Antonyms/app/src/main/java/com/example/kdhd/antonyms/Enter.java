package com.example.kdhd.antonyms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Enter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
    }

    public void SubmitEClick(View v)
    {
        if (v. getId() == R.id.SubEButton)
        {
            Intent j = new Intent(this, Hello.class);
            startActivity(j);
        }
    }
}
