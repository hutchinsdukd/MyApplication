package com.example.kdhd.antonyms;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

public class Hello extends AppCompatActivity {

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
            Intent j = new Intent(this, Result.class);
            startActivity(j);
        }
    }
}

