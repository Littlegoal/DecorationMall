package com.jzh.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 店铺页面信息——店铺详情页面
 *
 * @author Yunpeng Ma
 * @version 1.0
 */
public class ShopDetail implements Serializable{
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
	 * 联系方式
	 */
	private String contact;

	/**
	 * 二维码链接
	 */
	private String qrCode;

	/**
	 * qq
	 */
	private String qq;

	/**
	 * 店铺介绍
	 */
	private String introduction;

	/**
	 * 店铺图片
	 */
	private String img;

	/**
	 * 店铺商品类别（三级）集合
	 */
	private List<Category> classes;

	/**
	 * 商品简介集合
	 */
	private GoodsInfo goodsInfo;

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

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public List<Category> getClasses() {
		return classes;
	}
	public void setClasses(List<Category> classes) {
		this.classes = classes;
	}
	public GoodsInfo getGoodsInfo() {
		return goodsInfo;
	}
	public void setGoodsInfo(GoodsInfo goodsInfo) {
		this.goodsInfo = goodsInfo;
	}
	
	

}
