package com.example.imageviewer;

import android.os.Build;
import android.os.Bundle;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Path.FillType;
import android.graphics.Point;
import android.view.Display;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class MainActivity extends Activity {

	
	
//	@TargetApi(Build.VERSION_CODES.HONEYCOMB_MR1)
//	@SuppressLint("NewApi")
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		

		LinearLayout imgLayout = (LinearLayout) findViewById(R.id.image_layout);
		// imgLayout.addChildrenForAccessibility(childrenForAccessibility)
		ImageView iView = new ImageView(this);
		iView.setImageResource(R.drawable.sample_0);
//		iView.setScaleType(ScaleType.FIT_CENTER);//android.view.ViewGroup.LayoutParams.MATCH_PARENT
////		iView.se
//		iView.setLayoutParams(new LayoutParams(android.view.ViewGroup.LayoutParams.WRAP_CONTENT,280));
//		iView.setScaleType(iView.))
		imgLayout.addView(iView);

		ImageView iView1 = new ImageView(this);
		iView1.setImageResource(R.drawable.sample_1);
//		iView1.setLayoutParams(new LayoutParams(android.view.ViewGroup.LayoutParams.WRAP_CONTENT,280));
//		iView1.setScaleType(ScaleType.FIT_CENTER);
		imgLayout.addView(iView1);

		ImageView iView2 = new ImageView(this);
		iView2.setImageResource(R.drawable.sample_2);
//		iView2.setScaleType(ScaleType.FIT_CENTER);
//		iView2.setLayoutParams(new LayoutParams(android.view.ViewGroup.LayoutParams.WRAP_CONTENT,280));
//		iView2.setScaleY(280);
		imgLayout.addView(iView2);
		
		anim();
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	private void anim()
	{
		Display display = getWindowManager().getDefaultDisplay();
		Point size = new Point();
		display.getSize(size);
		int width = size.x;
		//findViewById(R.id.image_layout).animate().scaleYBy(width-120);
		
		findViewById(R.id.parentLayout).setY(-width);
		findViewById(R.id.parentLayout).animate().yBy(width);
		findViewById(R.id.parentLayout).animate().setDuration(6000);
		
//		ImageView belowCurtain = (ImageView)findViewById(R.id.below_curtain);
//		belowCurtain.animate().y(-400);
//		
//		belowCurtain.animate().setDuration(3000);
//		findViewById(R.id.image_layout).animate().y(-400);
//		
//		
//		ImageView topCurtain = (ImageView)findViewById(R.id.top_curtain);
//		topCurtain.animate().y(-400);
//		topCurtain.animate().setDuration(3000);
//		
//		belowCurtain.animate().translationYBy(400);
//		topCurtain.animate().translationYBy(100);
//		findViewById(R.id.image_layout).animate().translationYBy(100);
//		
		
		
		//sun.animate().start();
		//load the sun movement animation
		//AnimatorSet sunSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.move);
		//set the view as target
		
		//sun.animate().rotation(200);
        //sunSet.setTarget(findViewById(R.id.parentLayout));
		//start the animation
//		sunSet.start();
		// imgLayout.setAdapter(new ImageAdapter(this));
//		LayoutTransition l = new LayoutTransition();
//	    l.enableTransitionType(LayoutTransition.CHANGING);
//	    viewGroup = (ViewGroup) findViewById(R.id.parentLayout);
//	    viewGroup.setLayoutTransition(l);
	}

}
