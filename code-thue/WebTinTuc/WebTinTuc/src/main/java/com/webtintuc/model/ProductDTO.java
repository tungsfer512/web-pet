package com.webtintuc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.multipart.MultipartFile;


import lombok.AllArgsConstructor;
import lombok.*;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class ProductDTO implements Serializable{
	private Long id;
	private String title;
	@Column(columnDefinition="varchar(1000)")
	private String preContent;
	
	@Column()
    private String title1;
	@Column(columnDefinition="varchar(1000)")
	private String content1;
	@Column()
    private String title2;
	@Column(columnDefinition="varchar(1000)")
    private String content2;
    @Column()
    private String title3;
    @Column(columnDefinition="varchar(1000)")
    private String content3;
    @Column()
    private String title4;
    @Column(columnDefinition="varchar(1000)")
    private String content4;
	private String author;
	private Date createAt;
	private Long categoryId;
	public ProductDTO() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getPreContent() {
		return preContent;
	}
	public void setPreContent(String preContent) {
		this.preContent = preContent;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public String getTitle1() {
		return title1;
	}
	public void setTitle1(String title1) {
		this.title1 = title1;
	}
	public String getContent1() {
		return content1;
	}
	public void setContent1(String content1) {
		this.content1 = content1;
	}
	public String getTitle2() {
		return title2;
	}
	public void setTitle2(String title2) {
		this.title2 = title2;
	}
	public String getContent2() {
		return content2;
	}
	public void setContent2(String content2) {
		this.content2 = content2;
	}
	public String getTitle3() {
		return title3;
	}
	public void setTitle3(String title3) {
		this.title3 = title3;
	}
	public String getContent3() {
		return content3;
	}
	public void setContent3(String content3) {
		this.content3 = content3;
	}
	public String getTitle4() {
		return title4;
	}
	public void setTitle4(String title4) {
		this.title4 = title4;
	}
	public String getContent4() {
		return content4;
	}
	public void setContent4(String content4) {
		this.content4 = content4;
	}
	
	
}
