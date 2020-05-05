package com.locusnine.Request;

public class UserRequest {

	private Long userId;

	private String userName;

	private String userEmail;

	private String userRole;

	private String userStatus;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "UserRequest [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userRole="
				+ userRole + ", userStatus=" + userStatus + "]";
	}

}
