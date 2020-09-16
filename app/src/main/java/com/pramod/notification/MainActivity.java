package com.pramod.notification;

import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;

import com.google.firebase.messaging.RemoteMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.R){
           NotificationChannel notificationChannel = new NotificationChannel("myNotification","myNotification", NotificationManager.IMPORTANCE_DEFAULT);

           NotificationManager notificationManager = getSystemService(NotificationManager.class);
           notificationManager.createNotificationChannel(notificationChannel);


        }

    }
}