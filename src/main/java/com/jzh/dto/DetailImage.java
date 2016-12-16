package com.jzh.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 某一类图片url集合——商品详情页面
 *
 * @author Yunpeng Ma
 * @version 1.0
 */
public class DetailImage implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 图片类别名
	 */
	private String name;

	/**
	 * 图片url集合
	 */
	private List<String> imgs;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getImgs() {
		return imgs;
	}
	public void setImgs(List<String> imgs) {
		this.imgs = imgs;
	}
	
	

}
