package com.seventeen.plus.activity;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class SplashActivity extends Activity implements OnPageChangeListener {
	private ViewPager mVp;
	private LayoutInflater inflater;
	private List<View> viewList;
	private LinearLayout llPoints;
	private int prePosition = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_welcome);
		initView();

		SplashAdapter adapter = new SplashAdapter();

		mVp.setAdapter(adapter);
	}

	private void initView() {
		mVp = (ViewPager) findViewById(R.id.vp);
		llPoints = (LinearLayout) findViewById(R.id.ll_points);
		viewList = new ArrayList<View>();
		inflater = LayoutInflater.from(getApplicationContext());
		viewList.add(inflater.inflate(R.layout.slide1, null));
		viewList.add(inflater.inflate(R.layout.slide2, null));
		viewList.add(inflater.inflate(R.layout.slide3, null));
		for (int i = 0; i < 3; i++) {
			// 添加小圆�?
			View view = new View(this);
			view.setBackgroundResource(R.drawable.abc_list_pressed_holo_dark);
			LayoutParams params = new LayoutParams(10, 10);
			params.leftMargin = 5;
			view.setLayoutParams(params);
			llPoints.addView(view);
		}

		// 设置第一个位置小圆点的初始�?
		llPoints.getChildAt(0).setBackgroundResource(
				R.drawable.abc_list_longpressed_holo);

		SplashAdapter adapter = new SplashAdapter();
		mVp.setAdapter(adapter);
		mVp.setOnPageChangeListener(this);

	}

	class SplashAdapter extends PagerAdapter {

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return viewList.size();
		}

		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			// TODO Auto-generated method stub
			return arg0 == arg1;
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			container.addView(viewList.get(position));
			if (position == 2) {
				Button button = (Button) findViewById(R.id.btn_entrance);
				button.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						Intent intent = new Intent(SplashActivity.this,
								MainActivity.class);
						startActivity(intent);
						finish();

					}
				});
			}
			return viewList.get(position);
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			container.removeView(viewList.get(position));
		}

	}

	@Override
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPageSelected(int position) {
		llPoints.getChildAt(position).setBackgroundResource(
				R.drawable.abc_list_longpressed_holo);
		llPoints.getChildAt(prePosition).setBackgroundResource(
				R.drawable.abc_list_pressed_holo_dark);
		prePosition = position;

	}

}
