package com.jzh.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 商品页面信息——商品详情页面
 *
 * @author Yunpeng Ma
 * @version 1.0
 */
public class GoodsDetail implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 商品id
	 */
	private Long id;

	/**
	 * 商品名称
	 */
	private String name;

	/**
	 * 商品简介
	 */
	private String introduction;

	/**
	 * 商品价格
	 */
	private Double price;

	/**
	 * 商品分类（面包屑）
	 */
	private List<Category> category;

	/**
	 * 主要展示图片url集合
	 */
	private List<String> imgPrincipal;

	/**
	 * 商品参数图片url集合
	 */
	private List<String> detail_top;

	/**
	 * 商品细节图片url集合
	 */
	private List<DetailImage> detailImg;

	/**
	 * 店铺信息
	 */
	private ShopInfo shopInfo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	public List<Category> getCategory() {
		return category;
	}

	public void setCategory(List<Category> category) {
		this.category = category;
	}

	public List<String> getImgPrincipal() {
		return imgPrincipal;
	}

	public void setImgPrincipal(List<String> imgPrincipal) {
		this.imgPrincipal = imgPrincipal;
	}

	public ShopInfo getShopInfo() {
		return shopInfo;
	}

	public void setShopInfo(ShopInfo shopInfo) {
		this.shopInfo = shopInfo;
	}

	public List<String> getDetail_top() {
		return detail_top;
	}
	public void setDetail_top(List<String> detail_top) {
		this.detail_top = detail_top;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<DetailImage> getDetailImg() {
		return detailImg;
	}

	public void setDetailImg(List<DetailImage> detailImg) {
		this.detailImg = detailImg;
	}
}
