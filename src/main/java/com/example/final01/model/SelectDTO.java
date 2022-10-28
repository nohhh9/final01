package com.example.final01.model;

import java.util.Date;

public class SelectDTO {

	private int id;//--게시물번호
	private String member_id; 
	private String sname;// 닉네임
    private String title;//--제목
    private int view_cnt;//--조회수
    private Date reg_date;//--작성일자
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getView_cnt() {
		return view_cnt;
	}
	public void setView_cnt(int view_cnt) {
		this.view_cnt = view_cnt;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	@Override
	public String toString() {
		return "SelectDTO [id=" + id + ", member_id=" + member_id + ", sname=" + sname + ", title=" + title
				+ ", view_cnt=" + view_cnt + ", reg_date=" + reg_date + "]";
	}
    
    
}
