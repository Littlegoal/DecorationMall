package com.jzh.dto;

import java.io.Serializable;

/**
 * 商品简介——店铺详情页面
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
	private String title;

	/**
	 * 价格
	 */
	private Double price;

	/**
	 * 主图片url集合
	 */
	private String mainImg;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getMainImg() {
		return mainImg;
	}
	public void setMainImg(String mainImg) {
		this.mainImg = mainImg;
	}
	
	

}
