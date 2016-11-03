package com.seventeen.plus.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lidroid.xutils.BitmapUtils;
import com.seventeen.plus.activity.R;
import com.seventeen.plus.bean.IndexListViewBean;
import com.seventeen.plus.bean.IndexListViewBean.DataEntity.ListEntity.ItemsEntity;

public class IndexListViewAdapter extends BaseAdapter {

	private List<ItemsEntity> list = new ArrayList<IndexListViewBean.DataEntity.ListEntity.ItemsEntity>();
	private BitmapUtils utils;
	private LayoutInflater inflater;

	public IndexListViewAdapter(Context context, List<ItemsEntity> list) {
		// TODO Auto-generated constructor stub
		this.list.addAll(list);
		utils = new BitmapUtils(context);
		inflater = LayoutInflater.from(context);
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

		IndexListViewViewHolder holder;
		if (arg1 == null) {
			arg1 = inflater.inflate(R.layout.index_listview_item, null);
			holder = new IndexListViewViewHolder();
			holder.img = (ImageView) arg1
					.findViewById(R.id.index_listview_img1);
			holder.title = (TextView) arg1
					.findViewById(R.id.index_listview_tv1);
			holder.numOfPerson = (TextView) arg1
					.findViewById(R.id.index_listview_tv3);
			holder.money = (TextView) arg1
					.findViewById(R.id.index_listview_tv4);
			arg1.setTag(holder);
		} else {
			holder = (IndexListViewViewHolder) arg1.getTag();
		}

		ItemsEntity itemsEntity = list.get(arg0);

		holder.title.setText(itemsEntity.getName());
		holder.numOfPerson.setText(itemsEntity.getRecommend().getFav() + "人");
		holder.money.setText("￥" + itemsEntity.getRecommend().getPrice());

		String imgUrl = "http://pic.108tian.com/pic/" + itemsEntity.getImg();
		utils.display(holder.img, imgUrl);

		return arg1;
	}

	class IndexListViewViewHolder {
		ImageView img;
		TextView title, numOfPerson, money;
	}

}
