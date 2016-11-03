package com.seventeen.plus.activity;

import java.util.ArrayList;
import java.util.List;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.seventeen.plus.adapter.MainPagerAdapter;
import com.seventeen.plus.fragment.DiscoverFragment;
import com.seventeen.plus.fragment.EventFragment;
import com.seventeen.plus.fragment.IndexFragment;
import com.seventeen.plus.fragment.MineFragment;

/*
 *  hz--第一次提交，程序主框架部分，
	适配器部分有bug，
	致使ViewPager不能显示出各个板块的Fragment，
	在res中fragment的布局文件已经写好，请根据模块自行修改！
*/
public class MainActivity extends FragmentActivity implements
		OnPageChangeListener {

	private RadioGroup radioGroup;
	private ViewPager viewPager;

	IndexFragment indexFragment;
	DiscoverFragment discoverFragment;
	EventFragment eventFragment;
	MineFragment mineFragment;
	private List<Fragment> fragments;

	private RadioButton index_bottom_index;
	private RadioButton index_bottom_discover;
	private RadioButton index_bottom_event;
	private RadioButton index_bottom_mine;

	private MainPagerAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		initView();

	}

	private void initView() {
		// TODO Auto-generated method stub
		viewPager = (ViewPager) findViewById(R.id.index_viewpager);
		radioGroup=(RadioGroup) findViewById(R.id.index_rg);
		fragments = new ArrayList<Fragment>();
		index_bottom_index = (RadioButton) findViewById(R.id.index_bottom_index);
		index_bottom_discover = (RadioButton) findViewById(R.id.index_bottom_discover);
		index_bottom_event = (RadioButton) findViewById(R.id.index_bottom_event);
		index_bottom_mine = (RadioButton) findViewById(R.id.index_bottom_mine);

		indexFragment = new IndexFragment();
		discoverFragment = new DiscoverFragment();
		eventFragment = new EventFragment();
		mineFragment = new MineFragment();

		fragments.add(indexFragment);
		fragments.add(discoverFragment);
		fragments.add(eventFragment);
		fragments.add(mineFragment);

		// System.out.println("--" + fragments.size());

		adapter = new MainPagerAdapter(getSupportFragmentManager(), fragments);
		viewPager.setAdapter(adapter);
		// 注册监听
		viewPager.setOnPageChangeListener(this);

		// 默认为第一个fragment
		viewPager.setCurrentItem(0);
		Resources res = this.getResources();
		Drawable drawable = res.getDrawable(R.drawable.tab_find_selected_icon);
		index_bottom_index.setCompoundDrawablesWithIntrinsicBounds(null,
				drawable, null, null);
		index_bottom_index.setTextColor(getResources().getColorStateList(
				R.color.mycolor1));

	}

	public void checked(View view) {

		flushView();
		Resources res = this.getResources();

		switch (view.getId()) {
		case R.id.index_bottom_index:
			viewPager.setCurrentItem(0);
			Drawable drawable = res
					.getDrawable(R.drawable.tab_find_selected_icon);
			index_bottom_index.setCompoundDrawablesWithIntrinsicBounds(null,
					drawable, null, null);
			index_bottom_index.setTextColor(getResources().getColorStateList(
					R.color.mycolor1));
			break;
		case R.id.index_bottom_discover:
			viewPager.setCurrentItem(1);
			drawable = res.getDrawable(R.drawable.tab_choiceness_selected_icon);
			index_bottom_discover.setCompoundDrawablesWithIntrinsicBounds(null,
					drawable, null, null);
			index_bottom_discover.setTextColor(getResources()
					.getColorStateList(R.color.mycolor1));

			break;
		case R.id.index_bottom_event:
			viewPager.setCurrentItem(2);
			drawable = res.getDrawable(R.drawable.tab_activity_selected_icon);

			index_bottom_event.setCompoundDrawablesWithIntrinsicBounds(null,
					drawable, null, null);
			index_bottom_event.setTextColor(getResources().getColorStateList(
					R.color.mycolor1));

			break;
		case R.id.index_bottom_mine:
			viewPager.setCurrentItem(3);
			drawable = res.getDrawable(R.drawable.tab_me_selected_icon);

			index_bottom_mine.setCompoundDrawablesWithIntrinsicBounds(null,
					drawable, null, null);
			index_bottom_mine.setTextColor(getResources().getColorStateList(
					R.color.mycolor1));

			break;

		}
	}

	// 刷新函数，在每次点击后都刷新控件
	private void flushView() {
		// TODO Auto-generated method stub
		Resources res = this.getResources();
		Drawable drawable = res.getDrawable(R.drawable.tab_find_unselect_icon);

		index_bottom_index.setCompoundDrawablesWithIntrinsicBounds(null,
				drawable, null, null);
		index_bottom_index.setTextColor(getResources().getColorStateList(
				R.color.mycolor));

		drawable = res.getDrawable(R.drawable.tab_choiceness_unselect_icon);

		index_bottom_discover.setCompoundDrawablesWithIntrinsicBounds(null,
				drawable, null, null);
		index_bottom_discover.setTextColor(getResources().getColorStateList(
				R.color.mycolor));

		drawable = res.getDrawable(R.drawable.tab_activity_unselect_icon);

		index_bottom_event.setCompoundDrawablesWithIntrinsicBounds(null,
				drawable, null, null);
		index_bottom_event.setTextColor(getResources().getColorStateList(
				R.color.mycolor));

		drawable = res.getDrawable(R.drawable.tab_me_unselect_icon);

		index_bottom_mine.setCompoundDrawablesWithIntrinsicBounds(null,
				drawable, null, null);
		index_bottom_mine.setTextColor(getResources().getColorStateList(
				R.color.mycolor));
	}

	/************************ ViewPager监听事件 **************************/
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
		// TODO Auto-generated method stub
		flushView();
		Resources res = this.getResources();

		switch (position) {
		case 0:
			viewPager.setCurrentItem(0);
			Drawable drawable = res
					.getDrawable(R.drawable.tab_find_selected_icon);
			index_bottom_index.setCompoundDrawablesWithIntrinsicBounds(null,
					drawable, null, null);
			index_bottom_index.setTextColor(getResources().getColorStateList(
					R.color.mycolor1));
			break;
		case 1:
			viewPager.setCurrentItem(1);
			drawable = res.getDrawable(R.drawable.tab_choiceness_selected_icon);
			index_bottom_discover.setCompoundDrawablesWithIntrinsicBounds(null,
					drawable, null, null);
			index_bottom_discover.setTextColor(getResources()
					.getColorStateList(R.color.mycolor1));

			break;
		case 2:
			viewPager.setCurrentItem(2);
			drawable = res.getDrawable(R.drawable.tab_activity_selected_icon);

			index_bottom_event.setCompoundDrawablesWithIntrinsicBounds(null,
					drawable, null, null);
			index_bottom_event.setTextColor(getResources().getColorStateList(
					R.color.mycolor1));

			break;
		case 3:
			viewPager.setCurrentItem(3);
			drawable = res.getDrawable(R.drawable.tab_me_selected_icon);

			index_bottom_mine.setCompoundDrawablesWithIntrinsicBounds(null,
					drawable, null, null);
			index_bottom_mine.setTextColor(getResources().getColorStateList(
					R.color.mycolor1));

			break;

		}
	}

}
