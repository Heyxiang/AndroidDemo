package com.seventeen.plus.bean;

/*
 * {
 "status": 0,
 "data": {
 "number": 74,
 "list": [
 {
 "lngLatitude": [
 116.4996337890625,
 39.98519134521484
 ],
 "productExists": true,
 "expired": false,
 "fav": 55,
 "endTime": 1447603200000,
 "id": "5639c2ba0cf2db34db095ffc",
 "startTime": 1447585200000,
 "duration": 1,
 "headImg": "1bfdfbd1267e134369f454d8de4b88a8.jpg",
 "price": 593,
 "priceRange": [
 593,
 593
 ],
 "dest": "朝阳区酒仙桥路4号 751时尚设计广场A19",
 "name": "东区故事生活馆开幕"
 },

 },*/

public class LifeParty {
	private String lngLatitude;
	private String productExists;
	private String expired;
	private String fav;
	private String endTime;
	private String id;
	private String startTime;
	private String headImg;
	private String price;
	private String priceRange;
	private String dest;
	private String name;

	public String getLngLatitude() {
		return lngLatitude;
	}

	public void setLngLatitude(String lngLatitude) {
		this.lngLatitude = lngLatitude;
	}

	public String getProductExists() {
		return productExists;
	}

	public void setProductExists(String productExists) {
		this.productExists = productExists;
	}

	public String getExpired() {
		return expired;
	}

	public void setExpired(String expired) {
		this.expired = expired;
	}

	public String getFav() {
		return fav;
	}

	public void setFav(String fav) {
		this.fav = fav;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "LifeParty [lngLatitude=" + lngLatitude + ", productExists="
				+ productExists + ", expired=" + expired + ", fav=" + fav
				+ ", endTime=" + endTime + ", id=" + id + ", startTime="
				+ startTime + ", headImg=" + headImg + ", price=" + price
				+ ", priceRange=" + priceRange + ", dest=" + dest + ", name="
				+ name + "]";
	}

}
