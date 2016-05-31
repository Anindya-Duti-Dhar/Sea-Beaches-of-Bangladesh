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

public class b9 extends Activity {

	Typeface font1;
	Typeface font2;
	TextView txtv1;
	TextView txtv2;
	final Context context = this;
	private Button BtnCall;
	protected void onCreate(Bundle savedInstanceState)

	{

		super.onCreate(savedInstanceState);
		setContentView(R.layout.b9);

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
				.setText("অপার সৌন্দয়ের লীলাভুমি সাগর সৈকত কুয়াকাটা প্রায় ১৮ কিলোমিটার দীর্ঘ। কুয়াকাটা সমুদ্র সৈকতে সূর্যোদয় ও সূর্য়াস্তের মনোরম দৃশ্য অবলোকন করা যায়। সমুদ্র সৈকতের পাশেই দেড় শতাধিক একর জমিতে অবস্থিত নারিকেল বাগান যা নারিকেল কুঞ্জ নামেই পরিচিত। এর পরেই রয়েছে আর এক বিশাল বনাঞ্চল চরগঙ্গামতি। বনের মধ্যে রয়েছে ছৈলা, কেওড়া ও কড়াই বাগান। বিশাল এই বাগানের মাঝে রয়েছে একটি নয়নাভিরাম লেক। কুয়াকাটা সমূদ্র সৈকত থেকে ৫ কিলোমিটার পশ্চিমে লেম্বুর চরে বন বিভাগের একটি বাগান আছে। বনে রয়েছে কড়াই, গেওয়া, ছৈলা ও কেওড়া গাছ। বেড়াতে আসা পর্যটকরা এখানে যায়। আন্ধারমানিক নদীর মোহনার পূর্ব দিকে লেম্বুর চর আর পশ্চিম দিকে রয়েছে ফাতরার চরের বিশাল বনাঞ্চল। ভৌগোলিক ভাবে বরগুনা জেলায় বাগানটির অবস্থান থাকলেও কুয়াকাটায় আগত পর্যটকরা বিনোদনের জন্য সেখানে ট্রলার যোগে যাতায়াত করেন। কুয়াকাটা সৈকতের ৭ কিলোমিটার পশ্চিমে রয়েছে শুটকি পল্লী। অর্ধশতাধিক ব্যবসায়ী শীত মৌসুমে বিভিন্ন মাছ শুকিয়ে শুটকি তৈরী করে। পর্যটকরা তাজা মাছ কেটে শুটকিজাত করার দৃশ্য দেখতে ভিড় জমায়। দেখতে পায় খুটা জেলেদের ইলিশ শিকারে সাগরে ঢেউয়ের সঙ্গে মিতালি করা জীবন জীবিকার যুদ্ধ। দেখতে পায় বেড় জালে বিভিন্ন প্রজাতির মাছ শিকারের অনন্য দৃশ্য। পর্যটকদের থাকা খাওয়ার সুবিধার্থে গড়ে উঠেছে পর্যটন কর্পোরেশনের পর্যটন হলিডে হোমস ও রেস্তোঁরা, জেলা পরিষদ ও এলজিইডির অত্যাধুনিক ডাক বাংলো। এছাড়াও বেসরকারি ব্যবস্থাপনায় অনেক আবাসিক ও খাবার হোটেল গড়ে উঠেছে। সরকারী উদ্যোগে নির্মিত রাখাইন কালচারাল একাডেমী, রাখাইন মহিলা মার্কেট সহ ঐতিহ্যবাহী কুয়া ও বৌদ্ধ মন্দির। কুয়াকাটা পর্যটন এলাকার গঙ্গামতিতে ইকোপার্ক ও বিমানবন্দর করার পরিকল্পনা নেয়া হয়েছে। এছাড়াও কুয়াকাটা উন্নয়নের জন্য মাস্টার প্লানের কাজ চলমান রয়েছে ।");

		this.font2 = Typeface.createFromAsset(getAssets(), "android.ttf");
		this.txtv2.setTypeface(this.font2);
		this.txtv2 = ((TextView) findViewById(R.id.dec3));

		this.txtv2
				.setText("বাংলাদেশের যে কোনও স্থান থেকে কুয়াকাটা যাওয়ার জন্য আপনাকে প্রথমে যেতে হবে পটুয়াখালী । ঢাকার গাবতলী ও সায়েদাবাদ থেকে বাসযোগে পটুয়াখালী যাওয়া যায়। রুট দুটির একটি হলো ঢাকা-মাওয়া-বরিশাল-পটুয়াখালী এবং অন্যটি হলো ঢাকা-আরিচা-বরিশাল-পটুয়াখালী। ভাড়া ৪৫০ থেকে ৭০০ টাকার মধ্যে। অথবা সবচেয়ে আরামদায়ক ও কম খরচে ঢাকা থেকে পটুয়াখালী যাওয়া যায়। লঞ্চে সাধারণ যাত্রীদের ভাড়া ১০০-১৫০ টাকা এবং বিলাসবহুল যাত্রীদের জন্য কেবিন ভাড়া ১০০০ টাকা। তারপর পটুয়াখালী থেকে বাসে কিংবা মাইক্রবাস রিজার্ভ করে কুয়াকাটা যাওয়া যায়। ");

		this.font2 = Typeface.createFromAsset(getAssets(), "android.ttf");
		this.txtv2.setTypeface(this.font2);
		this.txtv2 = ((TextView) findViewById(R.id.dec4));

		this.txtv2
				.setText("হোটেল নিলাঞ্জনা, হোটেল কুয়াকাটা ইন,হোটেল বনানী প্যালেস আবাসনের জন্য উল্লেখযোগ্য। এগুলো সবই  কুয়াকাটা পর্যটন এলাকাতে অবস্থিত। হোটেল বনানী প্যালেস এর সাথে ০১৭১৩-৬৭৪১৮৯ এই নম্বরে যোগাযোগ করতে কল করুন নিচের বাটনে ক্লিক করে।");

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
						AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(b9.this);
					      alertDialogBuilder.setMessage(R.string.decision);
					      alertDialogBuilder.setPositiveButton(R.string.positive_button, 
					      new DialogInterface.OnClickListener() {
							
					         @Override
					         public void onClick(DialogInterface arg0, int arg1) {
					        	 Intent callIntent = new Intent(Intent.ACTION_CALL);
									callIntent.setData(Uri.parse("tel:+8801713674189"));
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