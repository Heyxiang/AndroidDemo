package com.seventeen.plus.fragment;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.seventeen.plus.activity.R;
import com.seventeen.plus.adapter.EventAdapter;

public class EventFragment extends Fragment implements OnClickListener {
	private View view;
	private TextView tv_TravelOutdoors, tv_Sports, tv_LifeParty,
			tv_OverExperence;
	private ImageView iv_TravelOutdoor, iv_Sports, iv_LifeParty,
			iv_OverExperence;
	private FragmentManager childfragmentManager;
	private List<ImageView> imageList;
	private ViewPager event_vp;
	private EventAdapter eventAdapter;
	int prePosition = 0;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		view = inflater.inflate(R.layout.event_fragment, null);
		childfragmentManager = getChildFragmentManager();
		initView();
		initEvent();
		initData();
		return view;
	}

	private void initView() {
		event_vp = (ViewPager) view.findViewById(R.id.event_vp);
		tv_TravelOutdoors = (TextView) view.findViewById(R.id.tv_travelOutdoor);
		tv_Sports = (TextView) view.findViewById(R.id.tv_Sports);
		tv_LifeParty = (TextView) view.findViewById(R.id.tv_LifeParty);
		tv_OverExperence = (TextView) view.findViewById(R.id.tv_overExperence);
		iv_TravelOutdoor = (ImageView) view.findViewById(R.id.iv_travelOutdoor);
		iv_Sports = (ImageView) view.findViewById(R.id.iv_sports);
		iv_LifeParty = (ImageView) view.findViewById(R.id.iv_lifeParty);
		iv_OverExperence = (ImageView) view.findViewById(R.id.iv_overExperence);

	}

	private void initEvent() {

		tv_TravelOutdoors.setOnClickListener(this);
		tv_Sports.setOnClickListener(this);
		tv_LifeParty.setOnClickListener(this);
		tv_OverExperence.setOnClickListener(this);

	}

	private void initData() {
		List<Fragment> list = new ArrayList<Fragment>();
		list.add(new Event_TravelChildFragment());
		list.add(new Event_SportChildFragment());
		list.add(new Event_LifeChildFragment());
		list.add(new Event_ExperienceChildFragment());

		eventAdapter = new EventAdapter(childfragmentManager);
		eventAdapter.setData(list);
		event_vp.setAdapter(eventAdapter);

		imageList = new ArrayList<ImageView>();
		imageList.add(iv_TravelOutdoor);
		imageList.add(iv_Sports);
		imageList.add(iv_LifeParty);
		imageList.add(iv_OverExperence);

		event_vp.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int position) {
				imageList.get(position).setVisibility(View.VISIBLE);
				imageList.get(prePosition).setVisibility(View.INVISIBLE);
				prePosition = position;

			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub

			}
		});
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.tv_travelOutdoor:
			event_vp.setCurrentItem(0);
			break;
		case R.id.tv_Sports:
			event_vp.setCurrentItem(1);
			break;
		case R.id.tv_LifeParty:
			event_vp.setCurrentItem(2);
			break;
		case R.id.tv_overExperence:
			event_vp.setCurrentItem(3);
			break;

		}
	}

	@Override
	public void onDetach() {
		// TODO Auto-generated method stub
		super.onDetach();
		try {
			Field childFragmentManager = Fragment.class
					.getDeclaredField("mChildFragmentManager");
			childFragmentManager.setAccessible(true);
			childFragmentManager.set(this, null);

		} catch (NoSuchFieldException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}
}
