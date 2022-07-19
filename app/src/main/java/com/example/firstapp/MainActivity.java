package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.example.webviewlib.TestLib;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    };
    int i = 0;
    public void changeColor(View v){
        TextView topText = findViewById(R.id.texthello);
        Button button = findViewById(R.id.button1);
        Object currentText = topText.getText();
        this.i++;
        topText.setText("ini sudah dirubah " + i + " kali");
        Log.d("nope", (String) currentText);
    };
    public void changeOutput(View v){
        this.i = 0;
        TextView inputText = findViewById(R.id.input);
        TextView outputText = findViewById(R.id.texthello);
        String textValue = inputText.getText().toString();
        outputText.setText(textValue);
    }
    public void launchSetting(View v){
        Intent i = new Intent(this, SettingsActivity.class);
        TextView textView = findViewById(R.id.texthello);
        String theText = (String) textView.getText();
        i.putExtra("MESSAGE",theText);
        startActivity(i);
    }
    public void launchWebView(View v){
        Intent i = new Intent(this, com.example.webviewlib.FromLib.class);
//        TextView textView = findViewById(R.id.texthello);
//        String theText = (String) textView.getText();
//        i.putExtra("MESSAGE",theText);
        startActivity(i);
    }
}