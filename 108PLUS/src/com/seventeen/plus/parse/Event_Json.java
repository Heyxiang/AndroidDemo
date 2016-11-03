package com.seventeen.plus.parse;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.seventeen.plus.bean.LifeParty;
import com.seventeen.plus.bean.Purchase;

public class Event_Json {
	public static List<LifeParty> LifePartyJson(String json) {
		List<LifeParty> list = null;

		try {
			JSONObject o1 = new JSONObject(json);
			JSONObject o2 = o1.getJSONObject("data");
			JSONArray array = o2.getJSONArray("list");

			list = new ArrayList<LifeParty>();
			for (int i = 0; i < array.length(); i++) {
				LifeParty lifeParty = new LifeParty();
				JSONObject o3 = array.getJSONObject(i);
				lifeParty.setLngLatitude(o3.getString("lngLatitude"));
				lifeParty.setProductExists(o3.getString("productExists"));
				lifeParty.setExpired(o3.getString("expired"));
				lifeParty.setFav(o3.getString("fav"));
				lifeParty.setEndTime(o3.getString("endTime"));
				lifeParty.setId(o3.getString("id"));
				lifeParty.setStartTime(o3.getString("startTime"));
				lifeParty.setHeadImg(o3.getString("headImg"));
				lifeParty.setPrice(o3.getString("price"));
				lifeParty.setPriceRange(o3.getString("priceRange"));
				lifeParty.setName(o3.getString("name"));
				list.add(lifeParty);

			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public static List<Purchase> purchasesJson(String json) {
		List<Purchase> list = new ArrayList<Purchase>();
		try {
			JSONObject o = new JSONObject(json);
			JSONObject o1 = o.getJSONObject("data");
			Purchase purchase = new Purchase();
			purchase.setOrgin(o1.getString("origin"));
			purchase.setTimeDesc((o1.getString("timeDesc")));
			purchase.setDataVersion((o1.getString("dataVersion")));
			purchase.setStartTimeArr((o1.getString("startTimeArr")));
			purchase.setThemes((o1.getString("themes")));
			purchase.setHeadImg((o1.getString("headImg")));
			purchase.setDuration((o1.getString("duration")));
			// JSONArray array = o1.getJSONArray("feeDesc");
			// List<Purchase> list = new ArrayList<Purchase>();
			// for (int i = 0; i < array.length(); i++) {
			// JSONObject object = array.getJSONObject(i);
			// Purchase purchase2 = new Purchase();
			// purchase2.setValue(object.getString("value"));
			// list.add(purchase2);
			// }

			purchase.setMerchantId((o1.getString("merchantId")));
			purchase.setPriority((o1.getString("priority")));
			JSONObject o2 = o1.getJSONObject("fee");
			purchase.setPrice(o2.getString("price"));
			purchase.setDetail(o2.getString("detail"));

			purchase.setContent((o1.getString("content")));
			purchase.setTips((o1.getString("tips")));
			JSONArray jsonArray2 = o1.getJSONArray("purchaseNote");
			// for (int i = 0; i < jsonArray2.length(); i++) {
			// JSONObject object = jsonArray2.getJSONObject(i);
			// Purchase purchase3 = new Purchase();
			// purchase3.setProvinceName(object.getString("value"));
			// list.add(purchase3);
			// }
			purchase.setDest((o1.getString("dest")));
			purchase.setPrice((o1.getString("price")));
			purchase.setDuration((o1.getString("durationMilSec")));
			purchase.setCityId((o1.getString("cityId")));
			purchase.setGroups((o1.getString("groups")));
			JSONObject addressobject = o1.getJSONObject("address");
			purchase.setProvince(addressobject.getString("province"));
			purchase.setCity(addressobject.getString("city"));
			purchase.setProvinceName((addressobject.getString("provinceName")));
			purchase.setDistrict((addressobject.getString("district")));
			purchase.setCityName((addressobject.getString("cityName")));
			purchase.setDetail(addressobject.getString("detail"));
			purchase.setDistrictName((addressobject.getString("districtName")));
			purchase.setCityEnName((addressobject.getString("cityEnName")));
			purchase.setProvinceEnName((addressobject
					.getString("provinceEnName")));
			purchase.setCityEnName((addressobject.getString("cityEnName")));

			purchase.setCityName((o1.getString("cityEnName")));
			purchase.setLngLatitude((o1.getString("lngLatitude")));

			purchase.setName((o1.getString("name")));
			purchase.setCreated((o1.getString("created")));
			purchase.setModified((o1.getString("modified")));
			JSONObject contactobject = o1.getJSONObject("contact");
			purchase.setPhone(contactobject.getString("phone"));
			purchase.setName(contactobject.getString("name"));

			purchase.setCityName((o1.getString("cityName")));
			purchase.setContact_startTime((o1.getString("startTime")));
			purchase.setContact_endTime((o1.getString("endTime")));
			purchase.setId((o1.getString("id")));
			purchase.setFav((o1.getString("fav")));
			purchase.setProductExists((o1.getString("productExists")));

			list.add(purchase);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}
}
