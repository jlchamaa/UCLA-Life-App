package com.ALCU.angel;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.RelativeLayout;
import android.graphics.*;

public class MainActivity extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
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
