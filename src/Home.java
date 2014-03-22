package com.example.eblood;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

public class Home extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		
		RelativeLayout r1 = (RelativeLayout) findViewById(R.id.layout_askblood);
		RelativeLayout r2 = (RelativeLayout) findViewById(R.id.layout_donateblood);
		
		r1.setOnTouchListener(new View.OnTouchListener() {  
	        @Override
	        public boolean onTouch(View arg0, MotionEvent arg1) {
	        	int action = arg1.getAction();
	    		switch (action) {
	    		    case MotionEvent.ACTION_DOWN:
	    		    // Do your stuff here
	    		    	Intent openHomepage = new Intent("com.example.eblood.HOMEPAGE");
	    		    	startActivity(openHomepage);
	    		        break;
	    		    
	    		    }
	            return true;//always return true to consume event
	        }
	    });
		r2.setOnTouchListener(new View.OnTouchListener() {  
	        @Override
	        public boolean onTouch(View arg0, MotionEvent arg1) {
	        	int action = arg1.getAction();
	    		switch (action) {
	    		    case MotionEvent.ACTION_DOWN:
	    		    // Do your stuff here
	    		    	Intent openHomepage = new Intent("com.example.eblood.HOMEPAGE");
	    		    	startActivity(openHomepage);
	    		        break;
	    		    
	    		    }
	            
	            return true;//always return true to consume event
	        }
	    });
		
	}
	
	
	

}
