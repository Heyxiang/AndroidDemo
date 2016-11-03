package com.seventeen.plus.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class MoreBuyNoteActivity extends Activity {
	private TextView tvContent_attention, tvContent_suit;
	private ImageView mIv_close;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_more_buy_note);
		initView();
		Intent intent = getIntent();
		String content_attention = intent.getStringExtra("attention");
		String content_suit = intent.getStringExtra("suit");
		tvContent_attention.setText(content_attention);
		tvContent_suit.setText(content_suit);
	}

	private void initView() {
		tvContent_attention = (TextView) findViewById(R.id.buyNote_contentAttention);
		tvContent_suit = (TextView) findViewById(R.id.buyNote_contentSuit);
		mIv_close = (ImageView) findViewById(R.id.iv_close);
		mIv_close.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				MoreBuyNoteActivity.this.finish();

			}
		});

	}

}
