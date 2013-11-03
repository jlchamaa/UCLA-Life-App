package com.ALCU.angel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ImageButton b1 = (ImageButton) findViewById(R.id.button1);
		ImageButton b2 = (ImageButton) findViewById(R.id.button2);
		OnClickListener diningclick = new OnClickListener() 
		{
			@Override
			public void onClick(View v)
			{
				Intent intent = new Intent(MainActivity.this,Dining_nav.class);
			    startActivity(intent);
			}
		};
		OnClickListener housingclick = new OnClickListener() 
		{
			
			@Override
			public void onClick(View v)
			{
				Intent intent = new Intent(MainActivity.this,Housing_nav.class);
			    startActivity(intent);
			}
		};
		b1.setOnClickListener(diningclick);
		b2.setOnClickListener(housingclick);
		
		OrientationEventListener spincheck = new OrientationEventListener(this) 
		{
			
			@Override
			public void onOrientationChanged(int orientation)
			{
				RelativeLayout rl= (RelativeLayout)findViewById(R.layout.activity_main);
				if((orientation>315 && orientation<370)||(orientation>-1 &&orientation<45))
					rl.setBackgroundResource(R.drawable.campus1);
				else
					rl.setBackgroundResource(R.drawable.campus2);
			}
		};
	};
		
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
