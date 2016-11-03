package com.seventeen.plus.bean;

/**
 * 
 * 往期回顾的条目的信息
 * */
public class OldTimeyInfo {
	
	private String id;
	private String headImg;
	private int fav;
	private String name;
	private String subTitle;
	private int type;
	private long modified;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHeadImg() {
		return headImg;
	}
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}
	public int getFav() {
		return fav;
	}
	public void setFav(int fav) {
		this.fav = fav;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String sunTitle) {
		this.subTitle = sunTitle;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public long getModified() {
		return modified;
	}
	public void setModified(long modified) {
		this.modified = modified;
	}
	@Override
	public String toString() {
		return "OldTimeyInfo [id=" + id + ", headImg=" + headImg + ", fav="
				+ fav + ", name=" + name + ", sunTitle=" + subTitle + ", type="
				+ type + ", modified=" + modified + "]";
	}
	
	
}




