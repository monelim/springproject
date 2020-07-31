package com.mh.simple01.dto;

public class AADto {
	
	private int aa;
	private String bb;	
	
	@Override
	public String toString() {
		return "AADto [aa=" + aa + ", bb=" + bb + "]";
	}
	public int getAa() {
		return aa;
	}
	public void setAa(int aa) {
		this.aa = aa;
	}
	public String getBb() {
		return bb;
	}
	public void setBb(String bb) {
		this.bb = bb;
	}
	
	

}
