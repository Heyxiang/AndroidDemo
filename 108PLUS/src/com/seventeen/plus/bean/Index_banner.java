package com.seventeen.plus.bean;

public class Index_banner {
	private String name;
	private String img;
	private String eventName;
	private String modified;
	private String id;
	private String type;
	private String to;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getModified() {
		return modified;
	}

	public void setModified(String modified) {
		this.modified = modified;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Index_banner(String name, String img, String eventName,
			String modified, String id, String type, String to) {
		super();
		this.name = name;
		this.img = img;
		this.eventName = eventName;
		this.modified = modified;
		this.id = id;
		this.type = type;
		this.to = to;
	}

	@Override
	public String toString() {
		return "Index_banner [name=" + name + ", img=" + img + ", eventName="
				+ eventName + ", modified=" + modified + ", id=" + id
				+ ", type=" + type + ", to=" + to + "]";
	}

}
