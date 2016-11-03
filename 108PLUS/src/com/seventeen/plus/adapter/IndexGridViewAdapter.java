package com.seventeen.plus.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.lidroid.xutils.BitmapUtils;
import com.seventeen.plus.bean.IndexBannerBean.DataEntity.AdletEntity;

public class IndexGridViewAdapter extends BaseAdapter {

	private List<AdletEntity> list;
	private LayoutInflater inflater;
	private BitmapUtils utils;

	public IndexGridViewAdapter(List<AdletEntity> list, Context context) {
		// TODO Auto-generated constructor stub
		utils = new BitmapUtils(context);
		inflater = LayoutInflater.from(context);
		this.list.addAll(list);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return list.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		return null;
	}

}
