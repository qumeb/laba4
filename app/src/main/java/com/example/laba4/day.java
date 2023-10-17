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

public class day extends AppCompatActivity {
    private static String CHANNEL_ID="ch2";
    private NotificationManagerCompat notificationManagerCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);

        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID,
                    "channel 2",
                    NotificationManager.IMPORTANCE_DEFAULT);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
        notificationManagerCompat=NotificationManagerCompat.from(this);
    }

    @SuppressLint("MissingPermission")
    public void btn_next(View view) {
        NotificationCompat.Builder builder=
                new NotificationCompat.Builder(day.this, CHANNEL_ID)
                        .setSmallIcon(R.drawable.ic_launcher_foreground)
                        .setContentTitle("Уведомление")
                        .setContentText("Скоро спать!")
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT);
        notificationManagerCompat.notify(2,builder.build());

        Intent intent = new Intent(day.this, evening.class);
        startActivity(intent);
    }

    public void btn_back(View view) {
        Intent intent2 = new Intent(day.this, moorning.class);
        startActivity(intent2);
    }
}