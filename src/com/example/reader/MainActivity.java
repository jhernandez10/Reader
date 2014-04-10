package com.example.reader;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {
	
	RelativeLayout first;
	LinearLayout second;
	RelativeLayout.LayoutParams params;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//ActionBar main = getActionBar();
		
		first = (RelativeLayout) findViewById(R.id.Relative1);
		
		for(int i = 0; i<10;i++)
		{
			Button b = new Button(this);
			params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, 150);
			b.setText("Top Article " + (i + 1));
			b.setId(i);
			if(i >= 1)
			{
				params.addRule(RelativeLayout.RIGHT_OF,(i-1));
			}
			b.setLayoutParams(params);
			first.addView(b);
		}
		
		second = (LinearLayout) findViewById(R.id.Linear1);
		
		for(int i = 0; i < 30; i++)
		{
			Button b = new Button(this);
			b.setText("Article " + (i + 1));
			b.setId(i);
			b.setHeight(10);
			b.setWidth(LayoutParams.MATCH_PARENT);
			second.addView(b);
		}
			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
