package com.creation.anindya.seabeachesofbd;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends Activity implements AnimationListener {

	

	// Animation
	Animation animMove, animMove1;
	  Typeface font1;
	  Typeface font2;
	  TextView txtv1;
	  TextView txtv2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
   
		txtv1 = (TextView) findViewById(R.id.dec1);
		txtv2 = (TextView) findViewById(R.id.dec2);
		
		
this.txtv1 = ((TextView)findViewById(R.id.dec1));
		
	    this.txtv1.setText("বাংলাদেশ");    
	    
	  
	    this.font1 = Typeface.createFromAsset(getAssets(), "android2.ttf");
	    this.txtv1.setTypeface(this.font1);
	    
	    
	    
	    this.txtv2 = ((TextView)findViewById(R.id.dec2));
	    
	    this.txtv2.setText("সৈকতে সৌন্দর্যের লীলাভূমি");  	    
	    this.font2 = Typeface.createFromAsset(getAssets(), "android.ttf");
	    this.txtv2.setTypeface(this.font2);
	    
		
	    
	    
		// load the animation
		animMove = AnimationUtils.loadAnimation(getApplicationContext(),
				R.anim.move);

		// set animation listener
		animMove.setAnimationListener(this);

		txtv1.startAnimation(animMove);

		// load the animation
		animMove1 = AnimationUtils.loadAnimation(getApplicationContext(),
				R.anim.move_1);

		// set animation listener
		animMove1.setAnimationListener(this);

		txtv2.startAnimation(animMove1);  
	    
	    
	    
	    
		// METHOD Splash   
        
        /****** Create Thread that will sleep for 5 seconds *************/        
       Thread background = new Thread() {
           public void run() {
                
               try {
                   // Thread will sleep for 5 seconds
                   sleep(5*1000);
                    
                   // After 5 seconds redirect to another intent
                   Intent i=new Intent(getBaseContext(),beaches_activity.class);
                   startActivity(i);
                    
                   //Remove activity
                   finish();
                    
               } catch (Exception e) {
                
               }
           }
       };
        
       // start thread
       background.start();
        
   }
    
   @Override
   protected void onDestroy() {
        
       super.onDestroy();
        
   }
   
   @Override
	public void onAnimationEnd(Animation animation) {
		// Take any action after completing the animation

		// check for zoom in animation
		if (animation == animMove) {
		}

	}
	
	@Override
	public void onAnimationRepeat(Animation animation) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onAnimationStart(Animation animation) {
		// TODO Auto-generated method stub

	}

}
