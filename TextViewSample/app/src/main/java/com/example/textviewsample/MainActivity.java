package com.example.textviewsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtOurText;

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtOurText = (TextView) findViewById(R.id.ourText);
        txtOurText.setText("Text Changed");
        txtOurText.setTextSize(40);
        txtOurText.setTextColor("red");
    }
}