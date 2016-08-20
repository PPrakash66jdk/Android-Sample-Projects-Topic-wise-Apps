package com.prakash.emailsending;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startBtn = (Button) findViewById(R.id.sendEmail);
        startBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

             //  sendEmail();


            }

        });
    }

/*
   // protected void sendEmail(String senderNumber, String number) {
   protected void sendEmail() {

        count++;

        SMSData smsData = new SMSData();
       IncomingSms incomingSms = new IncomingSms();

        Log.i("Send email", "");
        String[] TO = {"pprakash66cool@gmail.com"};
        String[] CC = {""};
        String email_subject = "Email sent from SPARK Android App";
      //  String email_body = "Message sender Number = " +smsData.getSenderNum()+ "\nMessage Body/Content = "+smsData.getMessage() + "\nCount = " +count;// String email_body = "Message sender Number = " +smsData.getSenderNum()+ "\nMessage Body/Content = "+smsData.getMessage() + "\nCount = " +count;
       //  String email_body = "Message sender Number = " + senderNumber+ "\nMessage Body/Content = "+ number + "\nCount = " +count;
       String email_body = "Message sender Number = " + incomingSms.senderNum+ "\nMessage Body/Content = "+ incomingSms.senderNum + "\nCount = " +count;

       Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO );
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, email_subject);
        emailIntent.putExtra(Intent.EXTRA_TEXT, email_body);

        try {
           // startActivity(Intent.createChooser(emailIntent, "Send mail SELECT**..."));
             startActivity(emailIntent);

            finish();
            Log.i("Finished sending email", "");
        }
        catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(MainActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }

    }
    */


}