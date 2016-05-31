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

public class b6 extends Activity {

	Typeface font1;
	Typeface font2;
	TextView txtv1;
	TextView txtv2;
	final Context context = this;
	private Button BtnCall;
	protected void onCreate(Bundle savedInstanceState)

	{

		super.onCreate(savedInstanceState);
		setContentView(R.layout.b6);

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
				.setText("সোনাদিয়া কক্সবাজার জেলাধীন মহেশখালী উপজেলার প্রাকৃতিক সৌন্দর্য ও জীববৈচিত্র্য সমৃদ্ধ একটিদ্বীপ । দ্বীপটির আয়তন ৭ বর্গ কিলোমিটার। প্রায় ১৪ কিলোমিটার দীর্ঘ প্রশস্থ সৈকত, সৈকত ঘেষে সারিবদ্ধভাবে দাড়িয়ে থাকা সূউচ্চ বালিয়াড়ি, জালের  মতো ছোট-বড় অসংখ্য খাল বেষ্টিত ম্যানগ্রোভ বন, বিস্তির্ণ ল্যাগুন্যাল ম্যাডফ্ল্যাট, কেয়া-নিশিন্দার ঝোপ, বিচিত্র প্রজাতির জলচর পাখি সোনাদিয়া দ্বীপের প্রধান বৈশিষ্ট্য। সমুদ্র সৈকতের পাশ ঘেষে অবস্থিত সোনাদিয়ার সূ-উচ্চু বালিয়াড়ির তুলনা বাংলাদেশে  নেই। সমুদ্র এবং সৈকত থেকে বালিয়াড়ির দৃশ্য অপূর্ব মনে হয়।  সোনাদিয়ার সৈকত এবং বালিয়াড়ি বিপন্ন জলপাই বর্ণের সামুদ্রিক কাছিমের ডিম পাড়ার উপযোগী স্থান। এখানে সামুদ্রিক সবুজ কাছিমও ডিম পাড়তে আসে। সমুদ্র সৈকতের বেলাভূমিতে পানির কিনারা ঘেষে বিচরন করে লাল কাঁকড়া এবং প্যারাবন এলাকায় শীলা কাঁকড়া পাওয়া যায়। ");

		this.font2 = Typeface.createFromAsset(getAssets(), "android.ttf");
		this.txtv2.setTypeface(this.font2);
		this.txtv2 = ((TextView) findViewById(R.id.dec3));

		this.txtv2
				.setText("বাংলাদেশের যে কোনও স্থান থেকে সোনাদিয়া যাওয়ার জন্য আপনাকে প্রথমে যেতে হবে কক্সবাজার। প্রতিদিন ঢাকা থেকে সরাসরি কক্সবাজারের উদ্দেশে ছেড়ে যায় দূরপাল্লার বেশ কিছু গাড়ি। বাসে ভাড়া লাগবে এসি ১২০০-১৪০০ এবং নন-এসি ৮০০-৯০০ টাকা। কক্সবাজার সদর হতে কস্তুরা ঘাট / ৬নং ঘাটা / উত্তর নুনিয়া ছড়া সরকারী জেটী ঘাট হতে স্প্রীট বোট বা কাটের বোটে করে সোনাদিয়া যাওয়া যায়। ");

		this.font2 = Typeface.createFromAsset(getAssets(), "android.ttf");
		this.txtv2.setTypeface(this.font2);
		this.txtv2 = ((TextView) findViewById(R.id.dec4));

		this.txtv2
				.setText("আপনি চাইলে কক্সবাজার ও থাকতে পারেন। নতুবা জেলা পরিষদ,কক্সবাজার পরিচালিত উপজেলা ডাক বাংলো, মহেশখালী থাকার জন্য উপযোগী। উপজেলা ডাক বাংলো এর সাথে ০১৭৩২৫৯২৩২১ এই নম্বরে যোগাযোগ করতে কল করুন নিচের বাটনে ক্লিক করে।");

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
						AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(b6.this);
					      alertDialogBuilder.setMessage(R.string.decision);
					      alertDialogBuilder.setPositiveButton(R.string.positive_button, 
					      new DialogInterface.OnClickListener() {
							
					         @Override
					         public void onClick(DialogInterface arg0, int arg1) {
					        	 Intent callIntent = new Intent(Intent.ACTION_CALL);
									callIntent.setData(Uri.parse("tel:+8801732592321"));
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