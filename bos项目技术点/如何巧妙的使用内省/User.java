package cn.itcast.utils;

import java.util.Date;

/**
 *CREATE BY LIGANG
 *2017-11-21
 */
public class User {

	private Integer id;
	
	private String username;
	
	private Date birthday;
	
	private Integer gender;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}
	
	
}
