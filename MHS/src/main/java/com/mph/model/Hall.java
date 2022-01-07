package com.mph.model;

public class Hall {
	
	private int hid;
	private String hname;
	private int hprice;
	private String hloc;
	private int hcap;
	private String hincl;
	public Hall() {
		super();
		}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public int getHprice() {
		return hprice;
	}
	public void setHprice(int hprice) {
		this.hprice = hprice;
	}
	public String getHloc() {
		return hloc;
	}
	public void setHloc(String hloc) {
		this.hloc = hloc;
	}
	public int getHcap() {
		return hcap;
	}
	public void setHcap(int hcap) {
		this.hcap = hcap;
	}
	public String getHincl() {
		return hincl;
	}
	public void setHincl(String hincl) {
		this.hincl = hincl;
	}
	@Override
	public String toString() {
		return "Hall [hid=" + hid + ", hname=" + hname + ", hprice=" + hprice + ", hloc=" + hloc + ", hcap=" + hcap
				+ ", hincl=" + hincl + "]";
	}
	
	
	
	

}
