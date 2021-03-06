package com.abhi.location;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.os.Build;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        if(Build.VERSION.SDK_INT >20)
        {
        	 Handler handler = new Handler(); 
        	    handler.postDelayed(new Runnable() { 
        	         public void run() { 
        	        	 Intent in=new Intent(MainActivity.this,Main21Activity.class);
        	             startActivity(in);	
        	         } 
        	    }, 5000); 
       
        }
        else{
        	 Handler handler = new Handler(); 
     	    handler.postDelayed(new Runnable() { 
     	         public void run() { 
     	        	 Intent in=new Intent(MainActivity.this,Main20Activity.class);
     	            startActivity(in);	
     	         } 
     	    }, 5000); 
       
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
