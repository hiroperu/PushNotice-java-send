package com.example.pushnotice;

import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.auth.oauth2.GoogleCredentials;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.io.FileInputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // This registration token comes from the client FCM SDKs.
        FirebaseMessagingSnippets MessageSnipets = new FirebaseMessagingSnippets();
        // String registrationToken = "er36evf84JDgJcsfXDTVX5:APA91bF3YDx1Hx8k44KzWAuEjFF7xqkHSR-_M7flVZWNOHQElnrTr-CPYqvaJXqgtgs_m-6d5BWbLhV5C07mDxHlRQcQ3GTZw1MKYDSYEH5CqhqFzRfBi5ESJ-cUUTZHStlyq0soVbKP";
        try {
            FileInputStream serviceAccount =
            new FileInputStream("C:\\Users\\hirok\\Projects\\Firebase-Project\\pushnotice-d03d0-firebase-adminsdk-p0if0-a1d14d765c.json");

            FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://pushnotice-d03d0.firebaseio.com")
                .build();

            FirebaseApp.initializeApp(options);
            System.out.println( "#####SEND START#####" );
            MessageSnipets.sendToToken();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
