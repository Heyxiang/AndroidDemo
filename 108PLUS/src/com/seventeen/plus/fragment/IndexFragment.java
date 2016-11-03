package com.seventeen.plus.fragment;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest.HttpMethod;
import com.seventeen.config.AppConfigInterface;
import com.seventeen.plus.activity.R;
import com.seventeen.plus.adapter.IndexBannerAdapter;
import com.seventeen.plus.adapter.IndexListViewAdapter;
import com.seventeen.plus.bean.IndexBannerBean;
import com.seventeen.plus.bean.IndexBannerBean.DataEntity.IndexBannerEntity;
import com.seventeen.plus.bean.IndexListViewBean;
import com.seventeen.plus.bean.IndexListViewBean.DataEntity.ListEntity.ItemsEntity;
import com.seventeen.plus.bean.Index_banner;

public class IndexFragment extends Fragment {

	private ViewPager index_viewPager;
	private ImageView iv_perimeter, iv_stay, iv_pick, iv_event;
	private GridView index_gridView;
	private ListView index_listView;
	private View view;
	private TextView center_banner;

	private List<Index_banner> list;

	private String banner_path = "";
	private String listview_path = "";

	private HttpUtils utils;
	private HttpUtils listViewHttpUtils;
	private IndexBannerAdapter adapter;
	private IndexListViewAdapter adapter2;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.index_fragment, null);
		initView();

		formatString();

		// viewpager填充数据
		utils = new HttpUtils();
		utils.send(HttpMethod.GET, banner_path, new RequestCallBack<String>() {

			@Override
			public void onFailure(HttpException arg0, String arg1) {
				// TODO Auto-generated method stub
				Toast.makeText(getActivity(), "广告条请求失败", Toast.LENGTH_SHORT)
						.show();
			}

			@Override
			public void onSuccess(ResponseInfo<String> arg0) {
				// TODO Auto-generated method stub
				IndexBannerBean bean = new Gson().fromJson(arg0.result,
						IndexBannerBean.class);
				List<IndexBannerEntity> indexBannerEntities = bean.getData()
						.getIndexBanner();
				adapter = new IndexBannerAdapter(indexBannerEntities,
						getActivity());
				index_viewPager.setAdapter(adapter);
			}
		});

		// ListView填充数据
		listViewHttpUtils = new HttpUtils();
		listViewHttpUtils.send(HttpMethod.GET, listview_path,
				new RequestCallBack<String>() {

					@Override
					public void onFailure(HttpException arg0, String arg1) {
						// TODO Auto-generated method stub
						Toast.makeText(getActivity(), "展示条目请求失败",
								Toast.LENGTH_SHORT).show();
					}

					@Override
					public void onSuccess(ResponseInfo<String> arg0) {
						// TODO Auto-generated method stub
						IndexListViewBean bean = new Gson().fromJson(
								arg0.result, IndexListViewBean.class);
						String name = bean.getData().getList().get(0).getName();
						center_banner.setText(name);
						List<ItemsEntity> list = bean.getData().getList()
								.get(0).getItems();
						adapter2 = new IndexListViewAdapter(getActivity(), list);
						index_listView.setAdapter(adapter2);
					}
				});

		return view;
	}

	private void formatString() {
		// TODO Auto-generated method stub
		banner_path = String.format(AppConfigInterface.INDEX_BANNER, 1, 0);
		listview_path = String.format(AppConfigInterface.INDEX_LISTVIEW, 1, 0,
				2);
	}

	private void initView() {
		// TODO Auto-generated method stub
		index_viewPager = (ViewPager) view.findViewById(R.id.index_viewpager);
		iv_perimeter = (ImageView) view.findViewById(R.id.iv1);
		iv_stay = (ImageView) view.findViewById(R.id.iv2);
		iv_pick = (ImageView) view.findViewById(R.id.iv3);
		iv_event = (ImageView) view.findViewById(R.id.iv4);
		center_banner = (TextView) view.findViewById(R.id.center_banner);

		index_gridView = (GridView) view.findViewById(R.id.index_gridview);
		index_listView = (ListView) view.findViewById(R.id.index_listview);

		list = new ArrayList<Index_banner>();

	}
}
