package com.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOAIHANG")
public class LOAIHANG {
	@Id
	@Column(name = "MALOAIHANG")
	private long maloai;
	@Column(name = "TENLOAIHANG")
	private String tenloai;

	public LOAIHANG() {
		super();
	}

	public LOAIHANG(long maloai, String tenloai) {
		super();
		this.maloai = maloai;
		this.tenloai = tenloai;
	}

	public long getMaloai() {
		return maloai;
	}

	public void setMaloai(long maloai) {
		this.maloai = maloai;
	}

	public String getTenloai() {
		return tenloai;
	}

	public void setTenloai(String tenloai) {
		this.tenloai = tenloai;
	}

}
