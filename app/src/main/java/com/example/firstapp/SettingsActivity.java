package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Intent i = getIntent();
        String theMessage = i.getStringExtra("MESSAGE");
        TextView theText = findViewById(R.id.gantiText);
        theText.setText(theMessage);
    }
    public void backbutton(View v){
        Button back = findViewById(R.id.backButton);
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}