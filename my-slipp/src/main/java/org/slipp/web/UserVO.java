package org.slipp.web;

import java.util.Date;

public class UserVO {

	private String user_email;
	private String user_pw;
	private String user_name;
	private Date regdate;

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public UserVO() {
	}

	public UserVO(String user_email, String user_pw, String user_name, Date regdate) {
		super();
		this.user_email = user_email;
		this.user_pw = user_pw;
		this.user_name = user_name;
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "UserVO [user_email=" + user_email + ", user_pw=" + user_pw + ", user_name=" + user_name + ", regdate="
				+ regdate + "]";
	}

}
