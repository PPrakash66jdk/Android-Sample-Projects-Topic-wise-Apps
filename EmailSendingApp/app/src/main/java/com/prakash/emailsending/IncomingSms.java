package com.prakash.emailsending;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import android.util.Log;
import android.widget.Toast;


public class IncomingSms extends BroadcastReceiver
{
	SMSData smsData_obj = new SMSData();
	MainActivity mainActivity = new MainActivity();

	String senderNum = "222";
	String message = "222";

	int count = 0;

	
	// Get the object of SmsManager
	final SmsManager sms = SmsManager.getDefault();


	private void sendEmail() {
		//Getting content for email
//		String email = "pprakash66jdk@gmail.com";
//		String subject = "Test Email";
//		String message = "Test email";

		String email = "pprakash66jdk@gmail.com";
		String subject = "Test Email modified...!!!";
		String message = "Test email is modified yesterday by me...!!! :)";


		//Creating SendMail object
		SendMail sm = new SendMail(email, subject, message);

		//Executing sendmail to send email
		sm.execute();
	}
	
	public void onReceive(Context context, Intent intent)
    {
	
		// Retrieves a map of extended data from the intent.
		final Bundle bundle = intent.getExtras();

		try {
			
			if (bundle != null) {
				
				final Object[] pdusObj = (Object[]) bundle.get("pdus");
				
				for (int i = 0; i < pdusObj.length; i++)
				{
					count++;

					SmsMessage currentMessage = SmsMessage.createFromPdu((byte[]) pdusObj[i]);

//					senderNum = currentMessage.getDisplayOriginatingAddress();
//					message = currentMessage.getDisplayMessageBody();
//
//					smsData_obj.setSenderNum(senderNum);
//					smsData_obj.setMessage(message);

					String sender_Number = currentMessage.getDisplayOriginatingAddress();


					String sender_message = currentMessage.getDisplayMessageBody();


			        Log.i("SmsReceiver", "senderNum: "+ senderNum + "; message: " + message);

					int duration = Toast.LENGTH_LONG;
					Toast toast = Toast.makeText(context, "sender_Number: "+ sender_Number + ", sender_message: " + sender_message + "\nCount = " + count  ,duration);
				//	Toast toast = Toast.makeText(context, "number=== " + smsData_obj.getSenderNum(),duration);
					toast.show();

					///// Calling the MainActivity and running the sendEmail() function...



				//	mainActivity.sendEmail(senderNum,message );
					//mainActivity.sendEmail();

					sendEmail();
					
				} // end for loop
              } // bundle is null


		} catch (Exception e) {
			Log.e("SmsReceiver", "Exception smsReceiver" +e);
			
		}

	}



}