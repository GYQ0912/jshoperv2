package com.jshop.entity;

// Generated 2012-9-13 10:50:57 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * VouchersT generated by hbm2java
 */
public class VouchersT implements java.io.Serializable {

	private String vouchersid;
	private String vouchersname;
	private String begintime;
	private String endtime;
	private String voucherscontent;
	private double limitprice;
	private String givenuserid;
	private String voucherstate;
	private String voucheruseway;
	private String state;
	private Date createtime;
	private String creatorid;

	public VouchersT() {
	}

	public VouchersT(String vouchersid, String vouchersname, String begintime,
			String endtime, String voucherscontent, double limitprice,
			String voucherstate, String voucheruseway, String state,
			Date createtime, String creatorid) {
		this.vouchersid = vouchersid;
		this.vouchersname = vouchersname;
		this.begintime = begintime;
		this.endtime = endtime;
		this.voucherscontent = voucherscontent;
		this.limitprice = limitprice;
		this.voucherstate = voucherstate;
		this.voucheruseway = voucheruseway;
		this.state = state;
		this.createtime = createtime;
		this.creatorid = creatorid;
	}

	public VouchersT(String vouchersid, String vouchersname, String begintime,
			String endtime, String voucherscontent, double limitprice,
			String givenuserid, String voucherstate, String voucheruseway,
			String state, Date createtime, String creatorid) {
		this.vouchersid = vouchersid;
		this.vouchersname = vouchersname;
		this.begintime = begintime;
		this.endtime = endtime;
		this.voucherscontent = voucherscontent;
		this.limitprice = limitprice;
		this.givenuserid = givenuserid;
		this.voucherstate = voucherstate;
		this.voucheruseway = voucheruseway;
		this.state = state;
		this.createtime = createtime;
		this.creatorid = creatorid;
	}

	public String getVouchersid() {
		return this.vouchersid;
	}

	public void setVouchersid(String vouchersid) {
		this.vouchersid = vouchersid;
	}

	public String getVouchersname() {
		return this.vouchersname;
	}

	public void setVouchersname(String vouchersname) {
		this.vouchersname = vouchersname;
	}

	public String getBegintime() {
		return this.begintime;
	}

	public void setBegintime(String begintime) {
		this.begintime = begintime;
	}

	public String getEndtime() {
		return this.endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public String getVoucherscontent() {
		return this.voucherscontent;
	}

	public void setVoucherscontent(String voucherscontent) {
		this.voucherscontent = voucherscontent;
	}

	public double getLimitprice() {
		return this.limitprice;
	}

	public void setLimitprice(double limitprice) {
		this.limitprice = limitprice;
	}

	public String getGivenuserid() {
		return this.givenuserid;
	}

	public void setGivenuserid(String givenuserid) {
		this.givenuserid = givenuserid;
	}

	public String getVoucherstate() {
		return this.voucherstate;
	}

	public void setVoucherstate(String voucherstate) {
		this.voucherstate = voucherstate;
	}

	public String getVoucheruseway() {
		return this.voucheruseway;
	}

	public void setVoucheruseway(String voucheruseway) {
		this.voucheruseway = voucheruseway;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

}
