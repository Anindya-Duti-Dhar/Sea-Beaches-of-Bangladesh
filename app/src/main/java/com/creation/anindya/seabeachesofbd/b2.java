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

public class b2 extends Activity {

	Typeface font1;
	Typeface font2;
	TextView txtv1;
	TextView txtv2;
	final Context context = this;
	private Button BtnCall;
	protected void onCreate(Bundle savedInstanceState)

	{

		super.onCreate(savedInstanceState);
		setContentView(R.layout.b2);

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
				.setText("কক্সবাজার জেলার পর্যটন সেক্টরে ইমাজিং টাইগার হচ্ছে ইনানী। বিশ্বের দীর্ঘতম বালকাময় সৈকত কক্সবাজার যার দূরত্ব প্রায় ১২০০ কিলোমিটার। কক্সবাজার থেকে টেকনাফ পর্যন্ত দীর্ঘ একশো বিশ কিলোমিটার সমুদ্র সৈকতের মধ্যে সবচেয়ে সুন্দর,আকর্ষণীয় ও নয়নাভিরাম হচ্ছে ইনানী বীচ। এককথায় ইনানীকে প্রকৃতির ভূস্বর্গ বলা চলে। ইনানী সৈকত থেকে শুরু করে টেকনাফ পর্যন্ত এর প্রাকৃতিক প্রবাল এবং পাথর সমুদ্রের ভাঙ্গন থেকে সৈকতকে রক্ষা করছে।  আবার, এসব পাথর ইনানী সৈকতকে দিয়েছে বাড়তি সৌন্দর্য। ইনানী সমুদ্র সৈকত যাওয়ার পথে বনবনানীতে পাহাড়ঘেরা পাখির কলকাকলী ও সাগর বেস্টিত সমুদ্রের গর্জন স্বকর্ণে শোনা ও শুভ্র রঙ্গের সাগরের ঊর্মি, সারি সারি ঝাউবাগান এবং কক্সাবাজার জেলার নৈসর্গিক দৃশ্য উপভোগ করার মজাই আলাদা। সিনেমা ও নাট্য পরিচালকদের শুটিং করার জন্য এ সমুদ্র সৈকতসহ আশে পাশে অনেক পিকনিক স্পট এখন অনেক লোভনীয় শুটি স্পট।");

		this.font2 = Typeface.createFromAsset(getAssets(), "android.ttf");
		this.txtv2.setTypeface(this.font2);
		this.txtv2 = ((TextView) findViewById(R.id.dec3));

		this.txtv2
				.setText("বাংলাদেশের যে কোনও স্থান থেকে ইনানী যাওয়ার জন্য আপনাকে প্রথমে যেতে হবে কক্সবাজার। প্রতিদিন ঢাকা থেকে সরাসরি কক্সবাজারের উদ্দেশে ছেড়ে যায় দূরপাল্লার বেশ কিছু গাড়ি। বাসে ভাড়া লাগবে এসি ১২০০-১৪০০ এবং নন-এসি ৮০০-৯০০ টাকা। একদা ইনানী যেতে হতো কক্সবাজার-টেকনাফ সড়ক হয়ে সোনারপাড়া আধাপাকা ও কাঁচা রাস্তার দিয়ে। সে সময় এখন আর নেই। বাংলাদেশ সেনাবাহিনীর ইঞ্জিনিয়ারিং কোর কর্তৃক ১৯৯২ সালে নির্মিত কলাতলী থেকে টেকনাফ ৮৪ কিঃমিঃ দীর্ঘ মেরিন ড্রাইভ রোড দিয়ে যে কোন যানে এখন ইনানী সমুদ্র সৈকতে যাওয়া যায়। উখিয়া থেকে সিএনজি এবং মাইক্রো নিয়ে যাওয়া যায়। ");

		this.font2 = Typeface.createFromAsset(getAssets(), "android.ttf");
		this.txtv2.setTypeface(this.font2);
		this.txtv2 = ((TextView) findViewById(R.id.dec4));

		this.txtv2
				.setText("কক্সবাজার শহর হইতে ৩২ কিলোমিটার এবং যে কোন গাড়ী নিয়ে য়াওয়া যায়। তাই অনেকে কক্সবাজার থেকেই এখানে যেতে আরাম অনুভব করেন। বাংলাদেশ পর্যটন কর্পোরেশন কর্তৃক পরিচালিত মোটেল শৈবাল উল্লেখযোগ্য। মোটেল শৈবাল এর সাথে ০৩৪১-৬৩২৭৪ এই নম্বরে যোগাযোগ করতে কল করুন নিচের বাটনে ক্লিক করে।");

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
						AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(b2.this);
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