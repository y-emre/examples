package com.examples.storepicture.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="picture")
public class Picture {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="picture_id")
	private long id;
	
	@Column(name="picture_name")
	private String pictureName;

	@Column(name="picture_bytes")
	@Lob	//extensive data
	@Basic(fetch=FetchType.LAZY)
	private byte[] pictureBytes;
	
	private Date date;
	
	public Picture() {

	}
	
	public Picture(String pictureName, byte[] pictureBytes, Date date) {
		this.pictureName=pictureName;
		this.pictureBytes=pictureBytes;
		this.date=date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPictureName() {
		return pictureName;
	}

	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}
	
	public byte[] getPictureBytes() {
		return pictureBytes;
	}

	public void setPictureBytes(byte[] pictureBytes) {
		this.pictureBytes = pictureBytes;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Picture [id=" + id + ", pictureName=" + pictureName + ", date=" + date + "]";
	}
	
}
