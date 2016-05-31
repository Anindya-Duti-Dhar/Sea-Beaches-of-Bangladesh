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

public class b7 extends Activity {

	Typeface font1;
	Typeface font2;
	TextView txtv1;
	TextView txtv2;
	final Context context = this;
	private Button BtnCall;
	protected void onCreate(Bundle savedInstanceState)

	{

		super.onCreate(savedInstanceState);
		setContentView(R.layout.b7);

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
				.setText("বাংলাদেশের কক্সবাজার জেলার অন্তর্গত একটি উপজেলা। এটি বাংলাদেশের সর্বদক্ষিণ-পূর্ব কোনায় অবস্থিত। কক্সবাজার জেলাসদর থেকে এর দূরত্ব ৮৬ কিলোমিটার। টেকনাফ উপজেলার পূর্ব প্রান্ত দিয়ে বয়ে গেছে নাফ নদ; এই নাফ নদের থেকেই এই অঞ্চলটির নামকরণ হয়েছে। টেকনাফের বহু পর্যটক আকর্ষনীয় স্থান রয়েছে। এর মধ্যে রয়েছে টেকনাফের সমুদ্র সৈকত, নে-টং বা দেবতার পাহাড়, মাথিনের কূপ, দ্বিতীয় বিশ্বযুদ্ধের সময় বৃটিশ সৈন্যদের তৈরী করা বাংকার ইত্যাদি। কক্সবাজার সমুদ্র সৈকতের তুলনায় টেকনাফ সমুদ্র সৈকতের পানি অধিক পরিষ্কার। টেকনাফ উপজেলায় ভ্রমণ করতে গেলে পর্যটকগণ মাথিনের কূপ দর্শন করতে কখনই ভুল করেন না। মাথিনের কুপ টেকনাফ থানার সম্মুখে অবস্থিত। ");

		this.font2 = Typeface.createFromAsset(getAssets(), "android.ttf");
		this.txtv2.setTypeface(this.font2);
		this.txtv2 = ((TextView) findViewById(R.id.dec3));

		this.txtv2
				.setText("বাংলাদেশের যে কোনও স্থান থেকে টেকনাফ যাওয়ার জন্য আপনাকে প্রথমে যেতে হবে কক্সবাজার। প্রতিদিন ঢাকা থেকে সরাসরি কক্সবাজারের উদ্দেশে ছেড়ে যায় দূরপাল্লার বেশ কিছু গাড়ি। বাসে ভাড়া লাগবে এসি ১২০০-১৪০০ এবং নন-এসি ৮০০-৯০০ টাকা। কক্সবাজার থেকে প্রথমে জিপে চড়ে টেকনাফ অথবা কক্সবাজার হতে সরাসরি বাস যো্গে টেকনাফ বাস স্ট্যান্ড। টেকনাফ বাস স্ট্যান্ড হতে রিক্সা অথবা অটোরিক্সা যোগে টেকনাফ সী বীচ যাওয়া যাবে।");

		this.font2 = Typeface.createFromAsset(getAssets(), "android.ttf");
		this.txtv2.setTypeface(this.font2);
		this.txtv2 = ((TextView) findViewById(R.id.dec4));

		this.txtv2
				.setText("বাংলাদেশ পর্যটন কর্পোরেশন কর্তৃক পরিচালিত হোটেল নে টং, টেকনাফ উল্লেখযোগ্য। হোটেল নে টং, এর সাথে ০১৭১২৪৪৯৫৫৩ এই নম্বরে যোগাযোগ করতে কল করুন নিচের বাটনে ক্লিক করে।");

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
						AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(b7.this);
					      alertDialogBuilder.setMessage(R.string.decision);
					      alertDialogBuilder.setPositiveButton(R.string.positive_button, 
					      new DialogInterface.OnClickListener() {
							
					         @Override
					         public void onClick(DialogInterface arg0, int arg1) {
					        	 Intent callIntent = new Intent(Intent.ACTION_CALL);
									callIntent.setData(Uri.parse("tel:+8801712449553"));
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