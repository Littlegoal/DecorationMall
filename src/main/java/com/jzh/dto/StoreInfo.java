package com.jzh.dto;

import java.io.Serializable;

/**
 * 店铺简介——商品详情页面
 *
 * @author Yunpeng Ma
 * @version 1.0
 */
public class StoreInfo implements Serializable{
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
	private String img;
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
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	

}
