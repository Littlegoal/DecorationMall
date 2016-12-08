package com.jzh.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 联系方式——店铺详情页面
 *
 * @author Yunpeng Ma
 * @version 1.0
 */
public class Contact implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * qq
	 */
	private String qq;

	/**
	 * 二维码url
	 */
	private String qrcode;

	/**
	 * 电话号
	 */
	private List<String> phone;

	/**
	 * 联系人
	 */
	private String name;
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getQrcode() {
		return qrcode;
	}
	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
