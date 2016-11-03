package com.seventeen.plus.adapter;

import java.util.List;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lidroid.xutils.BitmapUtils;
import com.seventeen.plus.activity.R;
import com.seventeen.plus.bean.LifeParty;

public class Event_Lifeparty_Adapter extends BaseAdapter {
	private List<com.seventeen.plus.bean.LifeParty> data;
	private LayoutInflater inflater;
	private Context context;

	public Event_Lifeparty_Adapter(Context context) {
		this.context = context;
		inflater = LayoutInflater.from(context);
	}

	public void setData(List<LifeParty> data) {
		this.data = data;
	}

	@Override
	public int getCount() {
		return data.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return data.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, final ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.item_event_lifeparty, null);

			holder = new ViewHolder();
			holder.name = (TextView) convertView
					.findViewById(R.id.name_lifeparty);
			holder.fav = (TextView) convertView
					.findViewById(R.id.fav_lifeparty);
			holder.price = (TextView) convertView
					.findViewById(R.id.price_lifeparty);
			holder.headImg = (ImageView) convertView
					.findViewById(R.id.headImg_lifepaty);
			holder.time = (TextView) convertView
					.findViewById(R.id.time_lifeparty);

			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		LifeParty lifeParty = data.get(position);
		long startime = Long.parseLong(lifeParty.getStartTime());
		long endtime = Long.parseLong(lifeParty.getEndTime());

		// holder.time.setText(time + "");
		holder.name.setText(lifeParty.getName());
		Log.i("name", "--" + lifeParty.getName());
		holder.fav.setText(lifeParty.getFav());
		holder.price.setText("￥" + lifeParty.getPrice());

		String imgurl = lifeParty.getHeadImg();
		String url = "http://pic.108tian.com/pic/" + imgurl;
		Log.i("url", "--" + url);
		if (url.equals("")) {
			holder.headImg.setImageResource(R.drawable.ic_launcher);
		} else {
			BitmapUtils bitmapUtils = new BitmapUtils(context);
			bitmapUtils.display(holder.headImg, url);
		}
		return convertView;

	}
}

/**
 * name; private String score; private String icon; private String size; private
 * String count_dl; private String android_dl;
 */
class ViewHolder {
	TextView name, fav, price, time;
	ImageView headImg, list_collect_icon;

}
