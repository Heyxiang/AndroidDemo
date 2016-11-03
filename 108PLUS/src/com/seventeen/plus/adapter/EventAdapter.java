package com.seventeen.plus.adapter;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;

public class EventAdapter extends FragmentPagerAdapter {
	List<Fragment> mList;
	private FragmentManager fm;

	public EventAdapter(FragmentManager fm) {
		super(fm);

	}

	public EventAdapter(FragmentManager fm, List<Fragment> data) {
		super(fm);
		this.mList = data;
	}

	public void setData(List<Fragment> mList) {
		if (this.mList != null) {
			FragmentTransaction ft = fm.beginTransaction();
			for (Fragment f : this.mList) {
				ft.remove(f);
			}
			ft.commit();
			ft = null;
			fm.executePendingTransactions();
		}
		this.mList = mList;
		notifyDataSetChanged();
	}

	@Override
	public Fragment getItem(int position) {
		// TODO Auto-generated method stub
		return mList != null ? mList.get(position) : null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mList.size();
	}

}
