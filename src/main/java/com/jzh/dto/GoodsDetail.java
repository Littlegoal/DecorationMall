package com.jzh.dto;

import java.io.Serializable;

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
	 * 商品信息
	 */
	private Info info;

	/**
	 * 店铺信息
	 */
	private StoreInfo storeInfo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Info getInfo() {
		return info;
	}
	public void setInfo(Info info) {
		this.info = info;
	}
	public StoreInfo getStoreInfo() {
		return storeInfo;
	}
	public void setStoreInfo(StoreInfo storeInfo) {
		this.storeInfo = storeInfo;
	}
	
	

}
