package com.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MATHANG {
	@Id
	@Column(name = "MAHANG")
	private long mahang;
	@Column(name = "TENHANG")
	private String tenhang;
	@Column(name = "MACONGTY")
	private long macongty;
	@Column(name = "MALOAIHANG")
	private long maloaihang;
	@Column(name = "SOLUONG")
	private long soluong;
	@Column(name = "DONVITINH")
	private String donvitinh;
	@Column(name = "GIAHANG")
	private double giahang;

	public MATHANG() {
	}

	public MATHANG(String tenhang, long macongty, long maloaihang, long soluong, String donvitinh, double giahang) {
		super();
		this.tenhang = tenhang;
		this.macongty = macongty;
		this.maloaihang = maloaihang;
		this.soluong = soluong;
		this.donvitinh = donvitinh;
		this.giahang = giahang;
	}

	public String getTenhang() {
		return tenhang;
	}

	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}

	public long getMacongty() {
		return macongty;
	}

	public void setMacongty(long macongty) {
		this.macongty = macongty;
	}

	public long getMaloaihang() {
		return maloaihang;
	}

	public void setMaloaihang(long maloaihang) {
		this.maloaihang = maloaihang;
	}

	public long getSoluong() {
		return soluong;
	}

	public void setSoluong(long soluong) {
		this.soluong = soluong;
	}

	public String getDonvitinh() {
		return donvitinh;
	}

	public void setDonvitinh(String donvitinh) {
		this.donvitinh = donvitinh;
	}

	public double getGiahang() {
		return giahang;
	}

	public void setGiahang(double giahang) {
		this.giahang = giahang;
	}

	public long getMahang() {
		return mahang;
	}

}
