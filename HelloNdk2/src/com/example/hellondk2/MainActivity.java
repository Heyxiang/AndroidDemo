package com.example.hellondk2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {

	public static native String getStringFromC();
	public static native void updateFile(String path);
	public static native int[] updateIntArray(int[] data);
	
	static{ 
		System.loadLibrary("hellow"); 
		}
	
	private TextView textView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//	 	   TextView  tv = new TextView(this);
//	        tv.setText( getStringFromC() );
//	        setContentView(tv);
		setContentView(R.layout.activity_main);
	   textView = (TextView) findViewById(R.id.tv);
	   textView.setText(getStringFromC());
	  // updateFile("/mnt/sdcard/boys.txt");
	   
	   int[] data = {1,2,3,4,5};
	   int[] result= updateIntArray(data);
	   for (int i = 0; i < result.length; i++) {
		   Log.i("nate","i="+result[i]);
	}
	   
	}
}
	