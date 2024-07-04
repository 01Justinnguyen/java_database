package model;

public class User {
	private String userName;
	private String password;
	private String fullName;

	public User() {
		super();
	}

	public User(String userName, String password, String fullName) {
		super();
		this.userName = userName;
		this.password = password;
		this.fullName = fullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", fullName=" + fullName + "]";
	}

}
