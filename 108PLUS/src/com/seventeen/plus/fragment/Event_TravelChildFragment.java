package com.seventeen.plus.fragment;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshBase.Mode;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnRefreshListener2;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.seventeen.config.AppConfigInterface;
import com.seventeen.config.HttpGetJson;
import com.seventeen.config.HttpGetJson.OnGetJson;
import com.seventeen.plus.activity.PurchaseActivity;
import com.seventeen.plus.activity.R;
import com.seventeen.plus.adapter.Event_Lifeparty_Adapter;
import com.seventeen.plus.bean.LifeParty;
import com.seventeen.plus.parse.Event_Json;

public class Event_TravelChildFragment extends Fragment implements
		OnItemClickListener {
	private View view;
	private PullToRefreshListView mPullToRefreshListView;
	private ListView lv;
	List<LifeParty> mLifeParties;
	private Event_Lifeparty_Adapter adapter;
	private int page = 0;
	private List<LifeParty> partyJson;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		view = inflater.inflate(R.layout.event_travelchild, null);
		mPullToRefreshListView = (PullToRefreshListView) view
				.findViewById(R.id.travel_lv);
		mPullToRefreshListView.setMode(Mode.BOTH);
		mPullToRefreshListView.setFocusable(false);
		mLifeParties = new ArrayList<LifeParty>();
		loadurl(page);
		adapter = new Event_Lifeparty_Adapter(getActivity());
		lv = mPullToRefreshListView.getRefreshableView();
		lv.setFocusable(false);
		lv.setOnItemClickListener(this);
		mPullToRefreshListView.setOnItemClickListener(this);
		mPullToRefreshListView
				.setOnRefreshListener(new OnRefreshListener2<ListView>() {

					@Override
					public void onPullDownToRefresh( // 下拉刷新执行的方法
							PullToRefreshBase<ListView> refreshView) {
						handler.sendEmptyMessageAtTime(1, 3000);

					}

					@Override
					public void onPullUpToRefresh(
							PullToRefreshBase<ListView> refreshView) { // 上拉加载执行的方法

						if (page < 4) {
							page = page + 1;
							loadurl(page);
						}

					}
				});
		return view;
	}

	private void loadurl(int index) {
		String url = String.format(AppConfigInterface.EVENT_TRVAEL, 1, index);
		Log.i("url--", "--" + url);
		Toast.makeText(getActivity(), url, 1).show();
		HttpGetJson.getJson(getActivity(), url, new OnGetJson() {

			@Override
			public void getString(String json) {

				Log.i("下载json", json);
				partyJson = Event_Json.LifePartyJson(json);
				Log.i("解析json", "--" + partyJson);
				if (partyJson.isEmpty()) {
					// page--;
					Log.i("main", "page==" + page);
					handler.sendEmptyMessageAtTime(1, 2000);
					return;
				} else {
					int size = partyJson.size();
					mLifeParties.addAll(partyJson);
					adapter.setData(mLifeParties);
					mPullToRefreshListView.setAdapter(adapter);
					adapter.notifyDataSetChanged();
					handler.sendEmptyMessage(1);
					lv.setSelection(size - 1);
				}
				// mPullToRefreshListView.onRefreshComplete();

			}
		});
	}

	Handler handler = new Handler() {

		public void handleMessage(android.os.Message msg) {
			mPullToRefreshListView.onRefreshComplete();
		};
	};

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		LifeParty life = partyJson.get(position - 1);
		Toast.makeText(getActivity(), "" + position, 1).show();
		String id2 = life.getId();
		Log.i("id2", "--" + id2);
		Intent intent = new Intent(getActivity(), PurchaseActivity.class);
		intent.putExtra("id", id2);
		startActivity(intent);
	}

}
