package com.chris.celciuskefahrenheith;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button Konversi_suhu = (Button)findViewById(R.id.button1);
        Button Profile = (Button)findViewById(R.id.button2);
        Button Keluar = (Button)findViewById(R.id.button3);
        Konversi_suhu.setOnClickListener(new OnClickListener(){
			public void onClick(View view){
		    	Intent intent = new Intent(MainActivity.this, KonversiActivity.class);
		    	startActivity(intent);
			}
        
    });
        Profile.setOnClickListener(new OnClickListener(){
        	public void onClick(View view){
        		Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
        		startActivity(intent);
        	}
    });
        Keluar.setOnClickListener(new OnClickListener(){
        	public void onClick(View view){
        		finish();
        		System.exit(0);
        	}
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
