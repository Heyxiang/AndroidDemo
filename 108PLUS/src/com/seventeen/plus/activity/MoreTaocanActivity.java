package com.seventeen.plus.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class MoreTaocanActivity extends Activity {
	private TextView tv_content;
	private ImageView iv_close;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_more_taocan);
		initView();
		Intent intent = getIntent();
		String extra = intent.getStringExtra("comMore");
		tv_content.setText(extra);

	}

	private void initView() {
		tv_content = (TextView) findViewById(R.id.taocan_detail);
		iv_close = (ImageView) findViewById(R.id.iv_close_tacan);

		iv_close.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				MoreTaocanActivity.this.finish();

			}
		});

	}

}
