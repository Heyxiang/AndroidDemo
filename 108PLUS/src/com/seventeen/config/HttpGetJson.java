package com.seventeen.config;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class HttpGetJson {
	static String json;

	public static String getJson(final Context context, String url,
			final OnGetJson onGetJson) {
		RequestQueue queue = Volley.newRequestQueue(context);
		StringRequest request = new StringRequest(url, new Listener<String>() {

			@Override
			public void onResponse(String arg0) {
				// TODO Auto-generated method stub
				json = arg0;
				// Toast.makeText(context, "success！",
				// Toast.LENGTH_SHORT).show();
				onGetJson.getString(json);
			}
		}, new Response.ErrorListener() {

			@Override
			public void onErrorResponse(VolleyError arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(context, "网络异常！", Toast.LENGTH_SHORT).show();

			}
		});
		queue.add(request);
		return json;
	}

	public static String downLoadJson(String path) {
		HttpClient client = new DefaultHttpClient();
		HttpGet get = new HttpGet(path);
		try {
			HttpResponse res = client.execute(get);
			if (res.getStatusLine().getStatusCode() == 200) {
				return EntityUtils.toString(res.getEntity());
			}
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public interface OnGetJson {
		void getString(String json);
	}
}
