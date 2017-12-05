package observer.customlogin;

import java.util.EventObject;

//LoginEvent是一个事件封装的对象，他用来向观察者传递变化信息
public class LoginEvent extends EventObject {
	private String userName;
	private String password;

	public LoginEvent(Object source, String userName, String password) {
		super(source);
		this.userName = userName;
		this.password = password;
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

}
