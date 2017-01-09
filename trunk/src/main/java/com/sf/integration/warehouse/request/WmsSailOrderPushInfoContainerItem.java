/**
 * Project Name:wms
 * File Name:WmsSailOrderPushInfoContainerItem.java
 * Package Name:com.sf.integration.warehouse.request
 * Date:2014年8月28日上午11:13:04
 * Copyright (c) 2014 深圳市金立通信设备有限公司 版权所有 .
 */
package com.sf.integration.warehouse.request;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @see com.sf.integration.warehouse.request.WmsSailOrderPushInfo
 * @author PengBin 00001550<br>
 * @date 2014年8月28日 上午11:13:04
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "item")
public class WmsSailOrderPushInfoContainerItem {
	@XmlElement
	private String container_id;
	@XmlElement
	private String item;
	@XmlElement
	private String quantity;
	@XmlElement
	private String quantity_um;
	@XmlElement
	private String lot;
	@XmlElement
	private String weight;
	@XmlElement
	private String weight_um;
	@XmlElement
	private String user_stamp;
	@XmlElement
	private String user_def1;
	@XmlElement
	private String user_def2;
	@XmlElement
	private String user_def3;
	@XmlElement
	private String user_def4;
	@XmlElement
	private String user_def5;
	@XmlElement
	private String user_def6;
	@XmlElement
	private String user_def7;
	@XmlElement
	private String user_def8;
	@XmlElementWrapper(name = "serialNumberList")
	@XmlElement
	private List<String> serial_number;

	/**
	 * @return the container_id
	 */
	public String getContainer_id() {
		return container_id;
	}

	/**
	 * @param container_id the container_id
	 */
	public void setContainer_id(String container_id) {
		this.container_id = container_id;
	}

	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}

	/**
	 * @param item the item
	 */
	public void setItem(String item) {
		this.item = item;
	}

	/**
	 * @return the quantity
	 */
	public String getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the quantity_um
	 */
	public String getQuantity_um() {
		return quantity_um;
	}

	/**
	 * @param quantity_um the quantity_um
	 */
	public void setQuantity_um(String quantity_um) {
		this.quantity_um = quantity_um;
	}

	/**
	 * @return the lot
	 */
	public String getLot() {
		return lot;
	}

	/**
	 * @param lot the lot
	 */
	public void setLot(String lot) {
		this.lot = lot;
	}

	/**
	 * @return the weight
	 */
	public String getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight
	 */
	public void setWeight(String weight) {
		this.weight = weight;
	}

	/**
	 * @return the weight_um
	 */
	public String getWeight_um() {
		return weight_um;
	}

	/**
	 * @param weight_um the weight_um
	 */
	public void setWeight_um(String weight_um) {
		this.weight_um = weight_um;
	}

	/**
	 * @return the user_stamp
	 */
	public String getUser_stamp() {
		return user_stamp;
	}

	/**
	 * @param user_stamp the user_stamp
	 */
	public void setUser_stamp(String user_stamp) {
		this.user_stamp = user_stamp;
	}

	/**
	 * @return the user_def1
	 */
	public String getUser_def1() {
		return user_def1;
	}

	/**
	 * @param user_def1 the user_def1
	 */
	public void setUser_def1(String user_def1) {
		this.user_def1 = user_def1;
	}

	/**
	 * @return the user_def2
	 */
	public String getUser_def2() {
		return user_def2;
	}

	/**
	 * @param user_def2 the user_def2
	 */
	public void setUser_def2(String user_def2) {
		this.user_def2 = user_def2;
	}

	/**
	 * @return the user_def3
	 */
	public String getUser_def3() {
		return user_def3;
	}

	/**
	 * @param user_def3 the user_def3
	 */
	public void setUser_def3(String user_def3) {
		this.user_def3 = user_def3;
	}

	/**
	 * @return the user_def4
	 */
	public String getUser_def4() {
		return user_def4;
	}

	/**
	 * @param user_def4 the user_def4
	 */
	public void setUser_def4(String user_def4) {
		this.user_def4 = user_def4;
	}

	/**
	 * @return the user_def5
	 */
	public String getUser_def5() {
		return user_def5;
	}

	/**
	 * @param user_def5 the user_def5
	 */
	public void setUser_def5(String user_def5) {
		this.user_def5 = user_def5;
	}

	/**
	 * @return the user_def6
	 */
	public String getUser_def6() {
		return user_def6;
	}

	/**
	 * @param user_def6 the user_def6
	 */
	public void setUser_def6(String user_def6) {
		this.user_def6 = user_def6;
	}

	/**
	 * @return the user_def7
	 */
	public String getUser_def7() {
		return user_def7;
	}

	/**
	 * @param user_def7 the user_def7
	 */
	public void setUser_def7(String user_def7) {
		this.user_def7 = user_def7;
	}

	/**
	 * @return the user_def8
	 */
	public String getUser_def8() {
		return user_def8;
	}

	/**
	 * @param user_def8 the user_def8
	 */
	public void setUser_def8(String user_def8) {
		this.user_def8 = user_def8;
	}

	/**
	 * @return the serial_number
	 */
	public List<String> getSerial_number() {
		return serial_number;
	}

	/**
	 * @param serial_number the serial_number
	 */
	public void setSerial_number(List<String> serial_number) {
		this.serial_number = serial_number;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return "WmsSailOrderPushInfoContainerItem [container_id=" + container_id + ", item=" + item + ", quantity=" + quantity + ", quantity_um=" + quantity_um + ", lot=" + lot + ", weight=" + weight + ", weight_um=" + weight_um + ", user_stamp=" + user_stamp + ", serial_number=" + serial_number
				+ "]";
	}

}
