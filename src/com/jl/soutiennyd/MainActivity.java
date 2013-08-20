package com.jl.soutiennyd;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callem();	
        findem();
    }
    
    public void findem(){
    	ImageView map = (ImageView)findViewById(R.id.imageViewMap);
    	map.setOnClickListener(new OnClickListener(){
    		public void onClick(View v){
    			String geoUriString = getResources().getString(R.string.map_location);
    			Uri geoUri = Uri.parse(geoUriString);
    			Intent mapCall = new Intent(Intent.ACTION_VIEW, geoUri);
    			startActivity(mapCall);
    			
    		}
    		
    	});
    }

    public void callem(){
    	Button button = (Button) findViewById(R.id.buttonCall);
 
		// add button listener
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
 
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:022508586823"));
				startActivity(callIntent);

			}
 
		});
 	 	
    }
}


