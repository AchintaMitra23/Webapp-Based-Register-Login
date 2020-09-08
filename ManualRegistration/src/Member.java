
public class Member {
	public String userName, passWord, email, phoneNo;

	public Member() {
		super();
	}
	
	public Member(String userName, String passWord, String email, String phoneNo) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
}
