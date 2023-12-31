package com.example.demo.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(unique = true)
	private String userName;

	@Column(unique = true)
	private String email;
	private String password;
	private String Name;
	private BigInteger mobileNo;
	private boolean email_verified;
	private String role = "USER";

	public User() {

	}

	public User(int id, String userName, String email, String password, String Name,
			BigInteger mobileNo, boolean email_verified, String role) {
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.Name = Name;
		this.mobileNo = mobileNo;
		this.email_verified = email_verified;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String username) {
		this.userName = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return Name;
	}

	public void setName(String firstName) {
		this.Name = Name;
	}

	public BigInteger getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(BigInteger mobileNo) {
		this.mobileNo = mobileNo;
	}

	public boolean isEmail_verified() {
		return email_verified;
	}

	public void setEmail_verified(boolean email_verified) {
		this.email_verified = email_verified;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", email=" + email + ", Name=" + Name + ", " +
				" mobileNo=" + mobileNo + ", email_verified=" + email_verified + ", role="
				+ role + "]";
	}

}
