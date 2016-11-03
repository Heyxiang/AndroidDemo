package com.seventeen.plus.parse;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.seventeen.plus.bean.Index_banner;

public class Index_parseJson {

	public static List<Index_banner> getIndex_banners(String json) {
		List<Index_banner> list = new ArrayList<Index_banner>();

		try {
			JSONObject object = new JSONObject(json);

			JSONObject object2 = object.getJSONObject("data");
			JSONArray array = object2.getJSONArray("indexBanner");
			for (int i = 0; i < array.length(); i++) {
				JSONObject object3 = array.getJSONObject(i);
				Index_banner banner = new Gson().fromJson(object3.toString(),
						Index_banner.class);
				list.add(banner);
			}
			return list;

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
