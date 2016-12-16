package com.jzh.dto;

import java.io.Serializable;

/**
 * 商品简介——店铺详情页面、家具首页、家具搜索页面
 *
 * @author Yunpeng Ma
 * @version 1.0
 */
public class Goods implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 *商品id
	 */
	private Long id;

	/**
	 * 商品名称
	 */
	private String name;

	/**
	 * 价格
	 */
	private Double price;

	/**
	 * 主图片url
	 */
	private String displayImage;

	/**
	 * 促销标记位
	 */
	private int sale;

	/**
	 * 店铺id
	 */
	private Long shopId;

	/**
	 * 店铺名字
	 */
	private String shopName;

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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDisplayImage() {
		return displayImage;
	}

	public void setDisplayImage(String displayImage) {
		this.displayImage = displayImage;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}

	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
}
