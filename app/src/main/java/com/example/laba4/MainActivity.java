package com.example.laba4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final int NOTIFICATION_ID=101;
    private static final String CHANNEL_ID="123";

    private  NotificationManager notificationManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("MissingPermission")
    public void moorning_click(View view) {
           Intent intent = new Intent(MainActivity.this, moorning.class);
//           intent.putExtra("FROM", "Я пришел из мэйн активити");
           startActivity(intent);

    }

    public void day_click(View view) {
        Intent intent1 = new Intent(MainActivity.this, day.class);
//           intent.putExtra("FROM", "Я пришел из мэйн активити");
        startActivity(intent1);

    }

    public void evening_click(View view) {
        Intent intent = new Intent(MainActivity.this, evening.class);
        startActivity(intent);
    }

    public void night_click(View view) {
        Intent intent = new Intent(MainActivity.this, Night.class);
        startActivity(intent);
    }
}