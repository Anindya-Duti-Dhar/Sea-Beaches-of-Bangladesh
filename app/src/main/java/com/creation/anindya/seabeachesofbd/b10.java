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

public class b10 extends Activity {

	Typeface font1;
	Typeface font2;
	TextView txtv1;
	TextView txtv2;
	final Context context = this;
	private Button BtnCall;
	protected void onCreate(Bundle savedInstanceState)

	{

		super.onCreate(savedInstanceState);
		setContentView(R.layout.b10);

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
				.setText("চট্টগ্রাম শহরের ১৪ কিলোমিটার দক্ষিণে অবস্থিত একটি সমূদ্র সৈকত। এটি কর্ণফুলী নদীর মোহনায় অবস্থিত। পতেঙ্গা চট্টগ্রাম শহরের একটি জনপ্রিয় পর্যটন কেন্দ্র। চট্টগ্রাম শহর থেকে মাত্র এক থেকে দেড় ঘন্টার পথ দূরত্বে এই সুন্দর সমুদ্র সৈকতটি অবস্থিত। একদিকে ঝাউবনের সবুজের সমারোহ, আরেকদিকে নীলাভ সমুদ্রের বিস্তৃত জলরাশি আপনাকে স্বাগত জানাবে। আর সমুদ্র তীরের মৃদুমন্দ বাতাস আপনার মনকে আনন্দে পরিপূর্ণ করে দেবে নিমেষেই। এছাড়া রয়েছে সমুদ্রে ঘুরে বেড়ানোর জন্য স্পীড-বোট, সমুদ্র তীরেই ঘুড়ে বেরানোর জন্য সী-বাইক আর ঘোড়া। এজন্য অবশ্য আপনাকে নির্দিষ্ট ভাড়া গুনতে হবে ঘন্টাপ্রতি হিসেবে। ঝাউবন ঘেঁষে উত্তর দিক বরাবর হেঁটে গেলে দেখতে পাবেন বঙ্গোপসাগর ও কর্ণফুলি নদীর মোহনা।");

		this.font2 = Typeface.createFromAsset(getAssets(), "android.ttf");
		this.txtv2.setTypeface(this.font2);
		this.txtv2 = ((TextView) findViewById(R.id.dec3));

		this.txtv2
				.setText("বাংলাদেশের যে কোনও স্থান থেকে পতেঙ্গা যাওয়ার জন্য আপনাকে প্রথমে যেতে হবে চট্টগ্রাম।  ঢাকা থেকে সড়ক পথে গ্রীন লাইন, সাউদিয়া এস আলম, হানিফ এন্টারপ্রাইজসহ অনেক এসি / নন এসি বাস যাতায়াত করে থাকে। আরামবাগ, সায়েদাবাদ হতে চট্টগ্রামগামী বাস পাওয়া যায়। এসি - ১০৫০/- টাকা হতে ১২৫০/-, নন এসি - ৫৫০/- টাকা হতে ৭৫০/-। এছারাও ঢাকা হতে চট্টগ্রাম এবং চট্টগ্রাম হতে ঢাকার মাঝে বেশ কয়েকটি ট্রেন চলাচল করে। তারমধ্যে তূর্ণা নিশিথা, পাহাড়িকা, মহানগর গোধূলী, মহানগর প্রভাতী, সুবর্ণ এক্সপ্রেস, চট্টগ্রাম মেইল অন্যতম। উক্ত দশর্নীয় স্থানে যাওয়ার জন্য চট্টগ্রাম থেকে বাস বা অটোরিক্সা ব্যবহার করা যেতে পারে। ");

		this.font2 = Typeface.createFromAsset(getAssets(), "android.ttf");
		this.txtv2.setTypeface(this.font2);
		this.txtv2 = ((TextView) findViewById(R.id.dec4));

		this.txtv2
				.setText("হোটেল পার্ক চট্টগ্রামের কদমতলিতে অবস্থিত। অনেক আবাসিক হোটেল এর মধ্যে এটা উল্লেখযোগ্য। হোটেল পার্ক এর সাথে ০১৮১৯-৩৮৮০১১ এই নম্বরে যোগাযোগ করতে কল করুন নিচের বাটনে ক্লিক করে।");

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
						AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(b10.this);
					      alertDialogBuilder.setMessage(R.string.decision);
					      alertDialogBuilder.setPositiveButton(R.string.positive_button, 
					      new DialogInterface.OnClickListener() {
							
					         @Override
					         public void onClick(DialogInterface arg0, int arg1) {
					        	 Intent callIntent = new Intent(Intent.ACTION_CALL);
									callIntent.setData(Uri.parse("tel:+8801819388011"));
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