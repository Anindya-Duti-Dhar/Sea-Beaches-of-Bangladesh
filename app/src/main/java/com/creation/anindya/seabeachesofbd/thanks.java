package com.creation.anindya.seabeachesofbd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class thanks extends Activity implements AnimationListener {

	ImageView imgLogo;

	// Animation
	Animation animMove;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.thanks);

		imgLogo = (ImageView) findViewById(R.id.imgLogo2);
		

		// load the animation
		animMove = AnimationUtils.loadAnimation(getApplicationContext(),
				R.anim.move2);

		// set animation listener
		animMove.setAnimationListener(this);

		imgLogo.startAnimation(animMove);

	}
	
	
	@Override
	public void onBackPressed()
	{
	    super.onBackPressed(); 
	    startActivity(new Intent(thanks.this,beaches_activity.class));
	    finish();

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
	
	public void onDestroy()
	  {
	   
	    super.onDestroy();
	  }

	
	
	
}
