package com.jzh.dto;

import java.io.Serializable;

/**
 * 商品类别——店铺详情页面、商品详情页面
 *
 * @author Yunpeng Ma
 * @version 1.0
 */
public class Class implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 商品类名
	 */
	private String name;

	/**
	 * 商品类别id
	 */
	private Long id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	

}
