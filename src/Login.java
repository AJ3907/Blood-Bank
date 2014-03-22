package com.example.eblood;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		final EditText etmobno = (EditText) findViewById(R.id.et_mobileno);
		final EditText etpass = (EditText) findViewById(R.id.et_password);
		final Button blogin = (Button) findViewById(R.id.b_signin);
		final TextView tvclick = (TextView) findViewById(R.id.tv_clickhere);
		
blogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});

tvclick.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
});




	}
	

}
