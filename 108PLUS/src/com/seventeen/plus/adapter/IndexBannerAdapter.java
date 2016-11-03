package com.seventeen.plus.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.lidroid.xutils.BitmapUtils;
import com.seventeen.plus.bean.IndexBannerBean.DataEntity.IndexBannerEntity;

public class IndexBannerAdapter extends PagerAdapter {

	private List<ImageView> list_img;
	private BitmapUtils utils;

	public IndexBannerAdapter(List<IndexBannerEntity> list, Context context) {
		// TODO Auto-generated constructor stub
		utils = new BitmapUtils(context);
		list_img = new ArrayList<ImageView>();

		for (int i = 0; i < list.size(); i++) {
			String imgUrl = list.get(i).getImg();
			ImageView imageView = new ImageView(context);
			utils.display(imageView, "http://pic.108tian.com/pic/" + imgUrl);
			list_img.add(imageView);
		}

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list_img == null ? 0 : list_img.size();
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		// TODO Auto-generated method stub
		return arg0 == arg1;
	}

	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		// TODO Auto-generated method stub
		container.addView(list_img.get(position));
		return list_img.get(position);
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		// TODO Auto-generated method stub
		container.removeView(list_img.get(position));
	}
}
