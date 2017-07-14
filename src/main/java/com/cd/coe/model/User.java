package com.cd.coe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



	
@Entity
@Table(name="usermaster")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userMasterID;
	
	@Size(min=3, max=50)
	@Column(name = "userFirstName", nullable = true)
	private String userFirstName;

	@Size(min=3, max=50)
	@Column(name = "userLastName", nullable = true)
	private String userLastName;

	@Size(min=3, max=50)
	@Column(name = "username", nullable = false)
	private String username;
	
	@Column(name = "userEmail", nullable = true)
	private String userEmail;
	
	@Size(min=3, max=50)
	@Column(name = "userPwd", nullable = false)
	private String userPwd;
	
	@NotNull
	@Column(name = "userContact", unique=true, nullable = true)
	private int userContact;
	
	@NotNull
	@Column(name = "userType", nullable = true)
	private int userType;

	public int getUserMasterID() {
		return userMasterID;
	}

	public void setUserMasterID(int userMasterID) {
		this.userMasterID = userMasterID;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public  void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public int getUserContact() {
		return userContact;
	}

	public void setUserContact(int userContact) {
		this.userContact = userContact;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "User [userMasterID=" + userMasterID + ", userFirstName=" + userFirstName + ", userLastName="
				+ userLastName + ", username=" + username + ", userEmail=" + userEmail + ", userPwd=" + userPwd
				+ ", userContact=" + userContact + ", userType=" + userType + "]";
	}
	
	
	
}

