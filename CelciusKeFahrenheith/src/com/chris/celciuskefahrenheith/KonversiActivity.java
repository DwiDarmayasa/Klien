package com.chris.celciuskefahrenheith;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class KonversiActivity extends Activity {
	EditText c, f;
	Button Konversi;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_konversi);
		Konversi = (Button)findViewById(R.id.buttonkonversi);
		c = (EditText)findViewById(R.id.editText1);
		f = (EditText)findViewById(R.id.editText2);
		Konversi.setOnClickListener(new View.OnClickListener(){
			public void onClick(View view){
				if(c.length()==0){
					Toast.makeText(getApplication(), "Mohon Masukan Celsius", Toast.LENGTH_LONG).show();
				}
				else{
					String celsius = c.getText().toString();
					double c = Double.parseDouble(celsius);
					double fh = fahrenheith (c);
					String output = String.valueOf(fh);
					f.setText(output.toString());
					}
			}
		});
		
	}
	public double fahrenheith (double c)
	{
		return (c*1.8)+ 32;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.konversi, menu);
		return true;
	}

}
