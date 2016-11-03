package com.seventeen.plus.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lidroid.xutils.BitmapUtils;
import com.lidroid.xutils.db.sqlite.CursorUtils.FindCacheSequence;
import com.seventeen.plus.activity.R;
import com.seventeen.plus.bean.OldTimeyInfo;

public class DiscoverGVAdapter extends BaseAdapter{
	
	private Context ctx;
	private List<OldTimeyInfo> list;
	BitmapUtils bitmapUtils = null;

	
	public DiscoverGVAdapter(Context context, List<OldTimeyInfo> list)
	{
		this.ctx = context;
		this.list = list;
		bitmapUtils = new BitmapUtils(this.ctx);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list == null ? 0 :list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder;
		if(convertView == null)
		{
			convertView = LayoutInflater.from(ctx).inflate(R.layout.discover_gv_item, null);
			holder = new ViewHolder();
			holder.tvName = (TextView) convertView.findViewById(R.id.discover_gv_item_name);
			holder.ivHeadImg = (ImageView) convertView.findViewById(R.id.discover_gv_item_headimg);
			
			convertView.setTag(holder);
		}
		else
		{
			holder = (ViewHolder) convertView.getTag();
		}
		
		holder.tvName.setText(list.get(position).getName());
		String imgUrl = list.get(position).getHeadImg();
		imgUrl = "http://pic.108tian.com/pic/" + imgUrl;
		bitmapUtils.display(holder.ivHeadImg, imgUrl);
		return convertView;
	}
	
	class ViewHolder
	{
		TextView tvName;
		ImageView ivHeadImg;
	}


}
