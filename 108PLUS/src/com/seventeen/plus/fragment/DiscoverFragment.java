package com.seventeen.plus.fragment;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ScrollView;
import android.widget.Toast;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnRefreshListener2;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest;
import com.seventeen.plus.activity.R;
import com.seventeen.plus.adapter.DiscoverGVAdapter;
import com.seventeen.plus.bean.OldTimeyInfo;

public class DiscoverFragment extends Fragment {
	
	private GridView gv;
	private List<OldTimeyInfo> list;
	private DiscoverGVAdapter adapter;
	private String cityId = "1";
	private int page = 0;
	private String step = "20";
	private String url = "https://api.108tian.com/mobile/v3/RecommendList";
	private boolean isFirst = true;
	private PullToRefreshScrollView scrollView;
	
	private Handler handler = new Handler(){
		public void handleMessage(android.os.Message msg) {
			switch(msg.what)
			{
			case 1:
				scrollView.onRefreshComplete();
				break;
			}
		}
	};
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.discover_fragment, null);
		gv = (GridView) view.findViewById(R.id.discover_gv_look_back);
		gv.setFocusable(false);
		scrollView = (PullToRefreshScrollView) view.findViewById(R.id.discover_scrollview);
		list = new ArrayList<OldTimeyInfo>();
		page = 0;
		adapter = new DiscoverGVAdapter(getActivity(), list);
		getList(page);
		gv.setAdapter(adapter);
		
		//为ScrollView注册刷新监听器
		scrollView.setOnRefreshListener(new OnRefreshListener2<ScrollView>() {

			@Override
			public void onPullDownToRefresh(PullToRefreshBase refreshView) {
				
				Toast.makeText(getActivity(), "下拉刷新", Toast.LENGTH_SHORT).show();
				new EmptyTask().execute();
			}

			@Override
			public void onPullUpToRefresh(PullToRefreshBase refreshView) {
				
				page++;
				getList(page);
			}
		});
		
		return view;
	}
	
	//下载JSON,并绑定适配器
	private void getList(int page)
	{
		if(page > 3)
		{
			new EmptyTask().execute();
			return;
		}
		String httpUrl = url + "?&cityId="+cityId+"&page="+page+"&step="+step;
		HttpUtils http = new HttpUtils();
		http.send(HttpRequest.HttpMethod.GET,
				httpUrl,
		    new RequestCallBack<String>(){
		        @Override
		        public void onLoading(long total, long current, boolean isUploading) {
		        
		        }

		        @Override
		        public void onSuccess(ResponseInfo<String> responseInfo) {
		            //成功回调的方法
		        	Toast.makeText(getActivity(), "获取数据成功", Toast.LENGTH_SHORT).show();
		        	parseOldTimeyInfo(responseInfo.result);
		        	adapter.notifyDataSetChanged();
		        	handler.sendEmptyMessage(1);
		        }

		        @Override
		        public void onStart() {
		        }

		        @Override
		        public void onFailure(HttpException error, String msg) {
		        	Toast.makeText(getActivity(), "获取数据失败"+error.getMessage(), Toast.LENGTH_LONG).show();
		        }
		});
	}
	
	//解析JSON
	private void parseOldTimeyInfo(String json)
	{
		OldTimeyInfo info = null;
		try {
			JSONObject obj = new JSONObject(json).getJSONObject("data");
			JSONArray arr = obj.getJSONArray("list");
			for(int i = 0; i < arr.length(); i++)
			{
				JSONObject o = arr.getJSONObject(i);
				info = new OldTimeyInfo();
				info.setId(o.getString("id"));
				info.setHeadImg(o.getString("headImg"));
				info.setFav(o.getInt("fav"));
				info.setName(o.getString("name"));
				info.setSubTitle(o.getString("subtitle"));
				info.setType(o.getInt("type"));
				info.setModified(o.getLong("modified"));
				list.add(info);
				
			}
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	class EmptyTask extends AsyncTask<Void, Void, Void>
	{

		@Override
		protected Void doInBackground(Void... params) {
			// TODO Auto-generated method stub
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
		@Override
		protected void onPostExecute(Void result) {
			// TODO Auto-generated method stub
			super.onPostExecute(result);
			handler.sendEmptyMessage(1);
		}
		
	}
	
}
