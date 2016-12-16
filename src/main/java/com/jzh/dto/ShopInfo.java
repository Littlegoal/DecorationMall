package com.jzh.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 店铺简介——商品详情页面、店铺搜索页面
 *
 * @author Yunpeng Ma
 * @version 1.0
 */
public class ShopInfo implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 店铺id
	 */
	private Long id;

	/**
	 * 店铺名称
	 */
	private String name;

	/**
	 * 店铺地址
	 */
	private String address;

	/**
	 * 店铺联系方式
	 */
	private String contact;

	/**
	 * 店铺图片url
	 */
	private String displayImage;

	/**
	 * 店铺经营商品类型集合
	 */
	private List<Category> category;



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getDisplayImage() {
		return displayImage;
	}

	public void setDisplayImage(String displayImage) {
		this.displayImage = displayImage;
	}

	public List<Category> getCategory() {
		return category;
	}

	public void setCategory(List<Category> category) {
		this.category = category;
	}
}
