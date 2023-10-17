package com.example.laba4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class evening extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evening);
    }

    public void btn_push(View view) {
        Intent intent = new Intent(evening.this, Night.class);
        startActivity(intent);
    }

    public void btn_back(View view) {
        Intent intent2 = new Intent(evening.this, day.class);
        startActivity(intent2);
    }
}