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

public class b8 extends Activity {

	Typeface font1;
	Typeface font2;
	TextView txtv1;
	TextView txtv2;
	final Context context = this;
	private Button BtnCall;
	protected void onCreate(Bundle savedInstanceState)

	{

		super.onCreate(savedInstanceState);
		setContentView(R.layout.b8);

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
				.setText("বাংলাদেশের সর্ব দক্ষিণে বঙ্গোপসাগরের উত্তর-পূর্বাংশে অবস্থিত একটি প্রবালদ্বীপ। এটি কক্সবাজার জেলার টেকনাফ হতে প্রায় ৯ কিলোমিটার দক্ষিণে এবং মায়ানমার-এর উপকূল হতে ৮ কিলোমিটার পশ্চিমে নাফ নদীর মোহনায় অবস্থিত। প্রচুর নারিকেল পাওয়া যায় বলে স্থানীয়ভাবে একে নারিকেল জিঞ্জিরাও বলা হয়ে থাকে। সম্ভবত বাঙালি জেলেরা জলকষ্ঠ এবং ক্লান্তি দূরীকরণের অবলম্বন হিসাবে প্রচুর পরিমাণ নারকেল গাছ এই দ্বীপে রোপণ করেছিল। কালক্রমে পুরো দ্বীপটি একসময় 'নারকেল গাছ প্রধান' দ্বীপে পরিণত হয়। এই সূত্রে স্থানীয় অধিবাসীরা এই দ্বীপের উত্তরাংশকে নারিকেল জিঞ্জিরা নামে অভিহিত করা শুরু করে। ১৯০০ খ্রিষ্টাব্দের দিকে ব্রিটিশ ভূ-জরীপ দল এই দ্বীপকে ব্রিটিশ-ভারতের অংশ হিসাবে গ্রহণ করে। জরীপে এরা স্থানীয় নামের পরিবর্তে খ্রিষ্টান সাধু মার্টিনের নামানুসারে সেন্ট মার্টিন নাম প্রদান করে। এরপর ধীরে ধীরে এই অঞ্চলের বাইরের মানুষের কাছে, দ্বীপটি সেন্ট মার্টিন নামেই পরিচিত লাভ করে।");

		this.font2 = Typeface.createFromAsset(getAssets(), "android.ttf");
		this.txtv2.setTypeface(this.font2);
		this.txtv2 = ((TextView) findViewById(R.id.dec3));

		this.txtv2
				.setText("বাংলাদেশের যে কোনও স্থান থেকে সেন্টমার্টিন যাওয়ার জন্য আপনাকে প্রথমে যেতে হবে কক্সবাজার। কক্সবাজার থেকে প্রথমে জিপে চড়ে টেকনাফ, টেকনাফ থেকে সি-ট্রাক, জাহাজ কিংবা ট্রলারে চড়ে পৌঁছাবেন সেন্টমার্টিনে। প্রতিদিন ঢাকা থেকে সরাসরি কক্সবাজারের উদ্দেশে ছেড়ে যায় দূরপাল্লার বেশ কিছু গাড়ি। বাসে ভাড়া লাগবে এসি ১২০০-১৪০০ এবং নন-এসি ৮০০-৯০০ টাকা। কক্সবাজার তো গেলেন তারপর বাসে ১৪০ টাকা, অথবা রিজার্ভ মাইক্রোবাসে সেন্টমার্টিন যেতে পারেন (৮-১০ সিট)। প্রতিদিন সকাল থেকে কক্সবাজার-টেকনাফ রুটে চলাচল করে এসব গাড়ি। টেকনাফ থেকে সেন্টমার্টিনে প্রতিদিন সকাল থেকে আসা-যাওয়া করে সি-ট্রাক, কেয়ারি সিন্দাবাদ । চমৎকার এসব জাহাজের পাশাপাশি ট্রলার ও চলাচল করে এই সমুদ্র রুটে। পছন্দসই বাহনে যেতে পারেন। তবে নিরাপদ জলযান হিসেবে কেয়ারি সিন্দাবাদ নির্ভরযোগ্য। এসব জাহাজে টেকনাফ থেকে সেন্টমার্টিন যেতে সময় লাগে দুই ঘণ্টা। অন্যদিকে প্রতিদিনই বিকাল ৩টায় এসব সাহাজ সেন্টমার্টিন ছেড়ে আসে। শীত মৌসুমে সমুদ্র শান্ত থাকে এবং গ্রীষ্ম-বর্ষা মৌসুমে সমুদ্র উত্তাল থাকে, তখন চলাচল ঝুঁকিপূর্ণ। ");

		this.font2 = Typeface.createFromAsset(getAssets(), "android.ttf");
		this.txtv2.setTypeface(this.font2);
		this.txtv2 = ((TextView) findViewById(R.id.dec4));

		this.txtv2
				.setText("সেন্ট মার্টিন্স দ্বীপে বর্তমানে বেশ কয়েকটি ভালো আবাসিক হোটেল রয়েছে। একটি সরকারি ডাকবাংলো আছে। সেন্ট মার্টিন্স দ্বীপের আইন-শৃঙ্খলা পরিস্থিতি ভাল। তবে সাধারনত কক্সবাজারে থেকেই পর্যটকরা এখানে ভ্রমন করে থাকে। টেকনাফেও থাকা যায়। বাংলাদেশ পর্যটন কর্পোরেশন কর্তৃক পরিচালিত হোটেল নে টং, টেকনাফ উল্লেখযোগ্য। হোটেল নে টং, এর সাথে ০১৭১২৪৪৯৫৫৩ এই নম্বরে যোগাযোগ করতে কল করুন নিচের বাটনে ক্লিক করে।");

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
						AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(b8.this);
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