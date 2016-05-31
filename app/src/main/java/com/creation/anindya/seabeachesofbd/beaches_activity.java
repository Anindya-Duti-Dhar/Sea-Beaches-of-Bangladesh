package com.creation.anindya.seabeachesofbd;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class beaches_activity extends Activity {
	
	
	Typeface font1;
	  Typeface font2;
	  TextView tv1;
	
	
	 protected void onCreate(Bundle savedInstanceState)
	  
	  {
		  super.onCreate(savedInstanceState);
		  setContentView(R.layout.beaches_activity);
		  
		  
		  
			  
			  this.tv1 = ((TextView)findViewById(R.id.rimenu1));
			    this.font1 = Typeface.createFromAsset(getAssets(), "android2.ttf");
			    this.tv1.setTypeface(this.font1);
			    this.tv1.setOnClickListener(new View.OnClickListener()
			    {
			      public void onClick(View paramAnonymousView)
			      {
			        Intent localIntent = new Intent(paramAnonymousView.getContext(), b1.class);
			       beaches_activity.this.startActivityForResult(localIntent, 0);
			      }
			    });
			  
			    
			    
			    this.tv1 = ((TextView)findViewById(R.id.rimenu2));
			    this.font1 = Typeface.createFromAsset(getAssets(), "android2.ttf");
			    this.tv1.setTypeface(this.font1);
			    this.tv1.setOnClickListener(new View.OnClickListener()
			    {
			      public void onClick(View paramAnonymousView)
			      {
			        Intent localIntent = new Intent(paramAnonymousView.getContext(), b2.class);
			       beaches_activity.this.startActivityForResult(localIntent, 0);
			      }
			    });
			    
			    
			    
			    
			    this.tv1 = ((TextView)findViewById(R.id.rimenu3));
			    this.font1 = Typeface.createFromAsset(getAssets(), "android2.ttf");
			    this.tv1.setTypeface(this.font1);
			    this.tv1.setOnClickListener(new View.OnClickListener()
			    {
			      public void onClick(View paramAnonymousView)
			      {
			        Intent localIntent = new Intent(paramAnonymousView.getContext(), b3.class);
			       beaches_activity.this.startActivityForResult(localIntent, 0);
			      }
			    });  
			    
			    
			    
			    
			    
			   
			    
			    
			    
			    this.tv1 = ((TextView)findViewById(R.id.rimenu6));
			    this.font1 = Typeface.createFromAsset(getAssets(), "android2.ttf");
			    this.tv1.setTypeface(this.font1);
			    this.tv1.setOnClickListener(new View.OnClickListener()
			    {
			      public void onClick(View paramAnonymousView)
			      {
			        Intent localIntent = new Intent(paramAnonymousView.getContext(), b6.class);
			       beaches_activity.this.startActivityForResult(localIntent, 0);
			      }
			    });
			    
			    
			    this.tv1 = ((TextView)findViewById(R.id.rimenu7));
			    this.font1 = Typeface.createFromAsset(getAssets(), "android2.ttf");
			    this.tv1.setTypeface(this.font1);
			    this.tv1.setOnClickListener(new View.OnClickListener()
			    {
			      public void onClick(View paramAnonymousView)
			      {
			        Intent localIntent = new Intent(paramAnonymousView.getContext(), b7.class);
			       beaches_activity.this.startActivityForResult(localIntent, 0);
			      }
			    });
			   
			    
			    
			    this.tv1 = ((TextView)findViewById(R.id.rimenu8));
			    this.font1 = Typeface.createFromAsset(getAssets(), "android2.ttf");
			    this.tv1.setTypeface(this.font1);
			    this.tv1.setOnClickListener(new View.OnClickListener()
			    {
			      public void onClick(View paramAnonymousView)
			      {
			        Intent localIntent = new Intent(paramAnonymousView.getContext(), b8.class);
			       beaches_activity.this.startActivityForResult(localIntent, 0);
			      }
			    }); 
			    
			    
			    
			    this.tv1 = ((TextView)findViewById(R.id.rimenu9));
			    this.font1 = Typeface.createFromAsset(getAssets(), "android2.ttf");
			    this.tv1.setTypeface(this.font1);
			    this.tv1.setOnClickListener(new View.OnClickListener()
			    {
			      public void onClick(View paramAnonymousView)
			      {
			        Intent localIntent = new Intent(paramAnonymousView.getContext(), b9.class);
			       beaches_activity.this.startActivityForResult(localIntent, 0);
			      }
			    });
			    	  
			    this.tv1 = ((TextView)findViewById(R.id.rimenu10));
			    this.font1 = Typeface.createFromAsset(getAssets(), "android2.ttf");
			    this.tv1.setTypeface(this.font1);
			    this.tv1.setOnClickListener(new View.OnClickListener()
			    {
			      public void onClick(View paramAnonymousView)
			      {
			        Intent localIntent = new Intent(paramAnonymousView.getContext(), b10.class);
			       beaches_activity.this.startActivityForResult(localIntent, 0);
			      }
			    }); 
			    
			    
			    			    
			 
			    
	  }
	 public boolean onCreateOptionsMenu(Menu paramMenu) {
			getMenuInflater().inflate(R.menu.main, paramMenu);
			return true;
		}

		public boolean onOptionsItemSelected(MenuItem paramMenuItem) {
			boolean bool = true;
			switch (paramMenuItem.getItemId()) {
			default:
				bool = super.onOptionsItemSelected(paramMenuItem);
				break;
			case R.id.ABOUT:
				final Dialog localDialog = new Dialog(this);
				localDialog.setContentView(R.layout.about_dialog);
				localDialog.setTitle("অ্যাপ্লিকেশান সম্পর্কে");
				localDialog.setCancelable(bool);
				((Button) localDialog.findViewById(R.id.Button02))
						.setOnClickListener(new View.OnClickListener() {
							public void onClick(View paramAnonymousView) {
								localDialog.cancel();
							}
						});
				localDialog.show();
				break;

			case R.id.SPECIALTHANKS:

				Intent i = new Intent(getBaseContext(), thanks.class);
				startActivity(i);
				
			
			}
			return bool;
		}
	
		@Override
		public void onBackPressed() {
		    new AlertDialog.Builder(this)
		           
		           .setMessage("আপনি কি অ্যাপ্লিকেশান থেকে বের হতে চাচ্ছেন?")
		           .setCancelable(true)
		           
		           .setTitle(getTitle().toString())
		           .setPositiveButton("হ্যাঁ", new DialogInterface.OnClickListener() {
		               public void onClick(DialogInterface dialog, int id) {
		                    beaches_activity.this.finish();
		               }
		           })
		           .setNegativeButton("না", null)
		           .show();
		}

}
