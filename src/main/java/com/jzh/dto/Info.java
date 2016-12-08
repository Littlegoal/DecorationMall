package com.jzh.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 商品主要信息——商品详情页面
 *
 * @author Yunpeng Ma
 * @version 1.0
 */
public class Info implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 商品名称
	 */
	private String title;

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
	private List<Class> classes;

	/**
	 * 主要展示图片url集合
	 */
	private List<String> imgs;

	/**
	 * 商品参数图片url集合
	 */
	private List<String> detail_top;

	/**
	 * 商品细节图片url集合
	 */
	private List<Img> detail;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public List<Class> getClasses() {
		return classes;
	}
	public void setClasses(List<Class> classes) {
		this.classes = classes;
	}
	public List<String> getImgs() {
		return imgs;
	}
	public void setImgs(List<String> imgs) {
		this.imgs = imgs;
	}
	public List<String> getDetail_top() {
		return detail_top;
	}
	public void setDetail_top(List<String> detail_top) {
		this.detail_top = detail_top;
	}
	public List<Img> getDetail() {
		return detail;
	}
	public void setDetail(List<Img> detail) {
		this.detail = detail;
	}
	

}
