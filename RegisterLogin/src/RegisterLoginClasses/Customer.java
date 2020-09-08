package RegisterLoginClasses;

public class Customer {
	private String userName, email, passWord, phoneNo;

	public Customer() {
		super();
	}

	public Customer(String userName, String email, String passWord, String phoneNo) {
		super();
		this.userName = userName;
		this.email = email;
		this.passWord = passWord;
		this.phoneNo = phoneNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
}
