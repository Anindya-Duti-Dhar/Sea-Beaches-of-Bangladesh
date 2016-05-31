package com.creation.anindya.seabeachesofbd;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class b1 extends Activity {

	Typeface font1;
	Typeface font2;
	TextView txtv1;
	TextView txtv2;
	final Context context = this;
	private Button BtnCall;
	protected void onCreate(Bundle savedInstanceState)

	{

		super.onCreate(savedInstanceState);
		setContentView(R.layout.b1);

		this.txtv1 = ((TextView) findViewById(R.id.riitem1));
		this.font1 = Typeface.createFromAsset(getAssets(), "android2.ttf");
		this.txtv1.setTypeface(this.font1);
		this.txtv1 = ((TextView) findViewById(R.id.rice1_1));
		this.font1 = Typeface.createFromAsset(getAssets(), "android2.ttf");
		this.txtv1.setTypeface(this.font1);
		this.txtv1 = ((TextView) findViewById(R.id.rice1_2));
		this.font1 = Typeface.createFromAsset(getAssets(), "android2.ttf");
		this.txtv1.setTypeface(this.font1);
		this.txtv1 = ((TextView) findViewById(R.id.rice1_3));
		this.font1 = Typeface.createFromAsset(getAssets(), "android2.ttf");
		this.txtv1.setTypeface(this.font1);
		this.txtv1 = ((TextView) findViewById(R.id.rice1_4));
		this.font1 = Typeface.createFromAsset(getAssets(), "android2.ttf");
		this.txtv1.setTypeface(this.font1);
		

		this.txtv2 = ((TextView) findViewById(R.id.dec2));

		this.txtv2
				.setText("কক্সবাজার সমুদ্র সৈকতটি পৃথিবীর দীর্ঘতম অখন্ডিত সমুদ্র সৈকত। ১২০ কিঃমিঃ দৈর্ঘ্য বিশিষ্ট এ সমুদ্র সৈকতে বৈশিষ্ট হলো পুরো সমুদ্র সৈকতটি বালুকাময়, কাদা অস্তিত্ব পাওয়া যায় না। বালিয়াড়ি সৈকত সংলগ্ন শামুক ঝিনুক নানা প্রজাতির প্রবাল সমৃদ্ধ বিপণি বিতান, অত্যাধুনিক হোটেল মোটেল কটেজ, নিত্য নব সাজে সজ্জিত বার্মিজ মার্কেট সমূহে পর্যটকদের বিচরণে কক্সবাজার শহর পর্যটন মৌসুমে প্রাণচাঞ্চল্য থাকে। কক্সবাজার সমুদ্র সৈকত একটি মায়াবী ও রূপময়ী সমুদ্র সৈকত। প্রতিদিন প্রতিক্ষণ এর রূপ পরিবর্তন করে। শীত-বর্ষা-বসন্ত-গ্রীস্ম এমন কোন সীজন নেই সমুদ্র সৈকতের চেহারা মিল খুঁজে পাওয়া যায়। প্রত্যুষে এক রকম তো মধ্যাহ্নে এর রূপ অন্য রকম। গোধুলি বেলার বীচের হাওয়া-অবস্থা আর রাতের বেলার আবহাওয়া-অবস্থার মধ্যে বিস্তর ফারাক। তাই তো দেশি-বিদেশি পর্যটকদের জন্য ক্যাপ্টেন কক্স এর সমুদ্র সৈকত এত কদরের, এত পছন্দের। ");

		this.font2 = Typeface.createFromAsset(getAssets(), "android.ttf");
		this.txtv2.setTypeface(this.font2);
		this.txtv2 = ((TextView) findViewById(R.id.dec3));

		this.txtv2
				.setText("বাংলাদেশের যে কোনও স্থান থেকে কক্সবাজার সমুদ্র সৈকতে যাওয়ার জন্য আপনাকে প্রথমে যেতে হবে কক্সবাজার। প্রতিদিন ঢাকা থেকে সরাসরি কক্সবাজারের উদ্দেশে ছেড়ে যায় দূরপাল্লার বেশ কিছু গাড়ি। বাসে ভাড়া লাগবে এসি ১২০০-১৪০০ এবং নন-এসি ৮০০-৯০০ টাকা। ");

		this.font2 = Typeface.createFromAsset(getAssets(), "android.ttf");
		this.txtv2.setTypeface(this.font2);
		this.txtv2 = ((TextView) findViewById(R.id.dec4));

		this.txtv2
				.setText("বাংলাদেশ পর্যটন কর্পোরেশন কর্তৃক পরিচালিত মোটেল শৈবাল, মোটেল লাবনী, মোটেল প্রবাল, মোটেল উপল উল্লেখযোগ্য। মোটেল শৈবাল এর সাথে ০৩৪১-৬৩২৭৪ এই নম্বরে যোগাযোগ করতে কল করুন নিচের বাটনে ক্লিক করে।");

		this.font2 = Typeface.createFromAsset(getAssets(), "android.ttf");
		this.txtv2.setTypeface(this.font2);

	
		//dial call
				BtnCall = (Button) findViewById(R.id.BtnCall);
				// add PhoneStateListener
				PhoneCallListener phoneListener = new PhoneCallListener();
				TelephonyManager telephonyManager = (TelephonyManager) this
						.getSystemService(Context.TELEPHONY_SERVICE);
				telephonyManager.listen(phoneListener,
						PhoneStateListener.LISTEN_CALL_STATE);

				// add button listener
				BtnCall.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(b1.this);
					      alertDialogBuilder.setMessage(R.string.decision);
					      alertDialogBuilder.setPositiveButton(R.string.positive_button, 
					      new DialogInterface.OnClickListener() {
							
					         @Override
					         public void onClick(DialogInterface arg0, int arg1) {
					        	 Intent callIntent = new Intent(Intent.ACTION_CALL);
									callIntent.setData(Uri.parse("tel:+88034163274"));
									startActivity(callIntent);
								
					         }
					      });
					      alertDialogBuilder.setNegativeButton(R.string.negative_button, 
					      new DialogInterface.OnClickListener() {
								
					         @Override
					         public void onClick(DialogInterface dialog, int which) {
					        	 dialog.cancel();
							 }
					      });
						    
					      AlertDialog alertDialog = alertDialogBuilder.create();
					      alertDialog.show();
						    }

				});

			}

		
	private class PhoneCallListener extends PhoneStateListener {

		private boolean isPhoneCalling = false;

		String LOG_TAG = "LOGGING 123";

		@Override
		public void onCallStateChanged(int state, String incomingNumber) {

			if (TelephonyManager.CALL_STATE_RINGING == state) {
				// phone ringing
				Log.i(LOG_TAG, "RINGING, number: " + incomingNumber);
			}

			if (TelephonyManager.CALL_STATE_OFFHOOK == state) {
				// active
				Log.i(LOG_TAG, "OFFHOOK");

				isPhoneCalling = true;
			}

			if (TelephonyManager.CALL_STATE_IDLE == state) {
				// run when class initial and phone call ended, need detect flag
				// from CALL_STATE_OFFHOOK
				Log.i(LOG_TAG, "IDLE");

				if (isPhoneCalling) {

					Log.i(LOG_TAG, "restart app");

					// restart app
					Intent i = getBaseContext().getPackageManager()
							.getLaunchIntentForPackage(
									getBaseContext().getPackageName());
					i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(i);

					isPhoneCalling = false;
				}

			}
		}
		
		
	}
	

	public void onDestroy() {

		super.onDestroy();
	}

}