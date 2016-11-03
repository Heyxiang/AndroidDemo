package com.seventeen.plus.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Window;
import android.widget.LinearLayout;

public class WelcomeActivity extends Activity {
	private LinearLayout mLinearLayout;
	private boolean isFirst;
	private SharedPreferences sp;

	private Handler handler = new Handler() {
		@Override
		public void handleMessage(android.os.Message msg) {
			Intent intent = new Intent();
			switch (msg.what) {
			case 1:
				Editor edit = sp.edit();
				edit.putBoolean("isFirst", false);
				edit.commit();

				intent.setClass(WelcomeActivity.this, SplashActivity.class);
				startActivity(intent);
				break;

			case 2:
				intent.setClass(WelcomeActivity.this, MainActivity.class);
				startActivity(intent);
				break;
			}
		};
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_entrance);
		mLinearLayout = (LinearLayout) findViewById(R.id.ll_entrance);

		sp = getSharedPreferences("config", MODE_PRIVATE);
		isFirst = sp.getBoolean("isFirst", true);
		new Thread(new Runnable() {

			@Override
			public void run() {
				Message msg = Message.obtain();
				if (isFirst) {
					msg.what = 1;
				} else {
					msg.what = 2;
				}
				try {
					Thread.sleep(1500);
					finish();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				handler.sendMessage(msg);
			}
		}).start();

	}

}
