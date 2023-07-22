package com.BikkadIT.CrudRepoMethods.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERS_DETAILS")
public class User {
	@Id
	@Column(name="USERS_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	@Column(name="USERS_NAME")
	private String userName;
	
	@Column(name="USERS_ADDRESS")
	private String userAddress;
	
	@Column(name="USERS_AGE")
	private int userAge;
	
	@Column(name="USERS_EMAIL")
	private String userEmail;
	
	@Column(name="USERS_PASS")
	private String userPass;
	
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + ", userAge="
				+ userAge + ", userEmail=" + userEmail + ", userPass=" + userPass + "]";
	}
	
	
	

}
