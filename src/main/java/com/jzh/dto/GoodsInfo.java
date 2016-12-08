package com.jzh.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 商品信息——店铺详情页面
 *
 * @author Yunpeng Ma
 * @version 1.0
 */
public class GoodsInfo implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * ?
	 */
	private String currentClass;

	/**
	 *商品简介集合
	 */
	private List<Goods> goods;

	/**
	 * 当前页
	 */
	private int page;

	/**
	 *总页数
	 */
	private int totalPage;

	/**
	 * 总商品数量
	 */
	private int totalCount;
	
	public String getCurrentClass() {
		return currentClass;
	}
	public void setCurrentClass(String currentClass) {
		this.currentClass = currentClass;
	}
	public List<Goods> getGoods() {
		return goods;
	}
	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	} 
	
	

}
