package com.trekappAPI.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "treks")
public class Treks {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tid;
	
	private String name;
	@Column(columnDefinition = "LONGTEXT")
	private String par1;
	@Column(columnDefinition = "LONGTEXT")
	private String par2;
	@Column(columnDefinition = "LONGTEXT")
	private String par3;
	@Column(columnDefinition = "LONGTEXT")
	private String par4;
	@Column(columnDefinition = "LONGTEXT")
	private String par5;
	
	private String distance;
	private String timing;
	private String date;
	private String price;
	private String imgUrl;
	private String imgUrl1;
	private String imgUrl2;
	private String imgUrl3;
	private String imgUrl4;
	private String location;
	private String source;
	
	private String day1;
	private String day2;
	
	public Long getId() {
		return tid;
	}
	public void setId(Long tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getImgUrl1() {
		return imgUrl1;
	}
	public void setImgUrl1(String imgUrl1) {
		this.imgUrl1 = imgUrl1;
	}
	public String getImgUrl2() {
		return imgUrl2;
	}
	public void setImgUrl2(String imgUrl2) {
		this.imgUrl2 = imgUrl2;
	}
	public String getImgUrl3() {
		return imgUrl3;
	}
	
	
	
	public String getPar1() {
		return par1;
	}
	public void setPar1(String par1) {
		this.par1 = par1;
	}
	public String getPar2() {
		return par2;
	}
	public void setPar2(String par2) {
		this.par2 = par2;
	}
	public String getPar3() {
		return par3;
	}
	public void setPar3(String par3) {
		this.par3 = par3;
	}
	public String getPar4() {
		return par4;
	}
	public void setPar4(String par4) {
		this.par4 = par4;
	}
	public String getPar5() {
		return par5;
	}
	public void setPar5(String par5) {
		this.par5 = par5;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDay1() {
		return day1;
	}
	public void setDay1(String day1) {
		this.day1 = day1;
	}
	public String getDay2() {
		return day2;
	}
	public void setDay2(String day2) {
		this.day2 = day2;
	}
	public void setImgUrl3(String imgUrl3) {
		this.imgUrl3 = imgUrl3;
	}
	public String getImgUrl4() {
		return imgUrl4;
	}
	public void setImgUrl4(String imgUrl4) {
		this.imgUrl4 = imgUrl4;
	}
	public Long getTid() {
		return tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}	
}
