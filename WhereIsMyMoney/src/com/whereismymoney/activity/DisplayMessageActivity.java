package com.whereismymoney.activity;

import com.whereismymoney.R;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_message);
//		// Receive the intent info
//		Intent intent = getIntent();
//		String message = intent.getStringExtra(Login.EXTRA_MESSAGE);
//	
//		// Create the text view
//	    TextView textView = new TextView(this);
//	    textView.setTextSize(40);
//	    textView.setText(message);
//
//	    // Set the text view as the activity layout
//	    setContentView(textView);
//
//	// Make sure we're running on Honeycomb or higher to use ActionBar APIs
//    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
//        // Show the Up button in the action bar.
//        getActionBar().setDisplayHomeAsUpEnabled(true);
//    }

		//this was being used as a confirmation of the registration screen
		//but I got confirm registration working so this is no long necessary
/*
	Button login = (Button) findViewById(R.id.button_goToLoginFromConfirmRegistration);
	Button register = (Button) findViewById(R.id.bCreateNewAccount);
	login.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			Intent goToLogin = new Intent("com.example.myfirstapp.MAINACTIVITY");
			startActivity(goToLogin);
		}
	});
	
	
	register.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent goToRegister = new Intent("com.example.myfirstapp.REGISTER");
			startActivity(goToRegister);
		}
	});*/
		
	}
	
	
@Override
public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
    case android.R.id.home:
        NavUtils.navigateUpFromSameTask(this);
        return true;
    }
    return super.onOptionsItemSelected(item);
}
}