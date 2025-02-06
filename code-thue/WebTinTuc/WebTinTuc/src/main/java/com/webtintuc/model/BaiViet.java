package com.webtintuc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity

@Table(name="baiviet")
public class BaiViet implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
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
    @ManyToOne
	@JoinColumn(name="account")
	private Account account;
//	@Column
//	private Date createAt;
	
	@ManyToOne
	@JoinColumn(name="category")
	private Category category;

	public BaiViet() {
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

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

//	public Date getCreateAt() {
//		return createAt;
//	}
//
//	public void setCreateAt(Date createAt) {
//		this.createAt = createAt;
//	}

	public String getPreContent() {
		return preContent;
	}

	public void setPreContent(String preContent) {
		this.preContent = preContent;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	
	
	
	
}
