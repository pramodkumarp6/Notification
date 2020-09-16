package com.pramod.notification.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.pramod.notification.MainActivity;
import com.pramod.notification.R;

public class MessagingService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        showNotification(remoteMessage.getNotification().getTitle(),remoteMessage.getNotification().getBody());
    }

    private void showNotification(String title, String message) {

       // PendingIntent pi = PendingIntent.getActivity(this,0,new Intent(this, MainActivity.class),0);

     NotificationCompat.Builder builder = new NotificationCompat.Builder(this,"mynotification")

                                    .setContentTitle(title)
                                    .setSmallIcon(R.drawable.ic_stat_name)
                                     .setAutoCancel(true)
                                      .setContentText(message);

        NotificationManagerCompat manager = NotificationManagerCompat.from(this);
        manager.notify(555,builder.build());



    /*    NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(0, notification);*/
    }
}
