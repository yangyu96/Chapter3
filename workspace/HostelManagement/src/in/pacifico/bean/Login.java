package in.pacifico.bean;

public class Login {
private int loginId ;
private String password ;
public int getLoginId() {
	return loginId;
}
public void setLoginId(int loginId) {
	this.loginId = loginId;
}
@Override
public String toString() {
	return "Login [loginId=" + loginId + ", password=" + password + "]";
}
public Login(int loginId, String password) {
	super();
	this.loginId = loginId;
	this.password = password;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
	
}
