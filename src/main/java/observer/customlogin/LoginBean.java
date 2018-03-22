package observer.customlogin;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//具体目标类LoginBean，登录控件类
public class LoginBean extends JPanel implements ActionListener {
	JLabel labUserName, labPassword;
	JTextField txtUserName;
	JPasswordField txtPassword;
	JButton btnLogin, btnClear;

	LoginEventListener lel;// 定义一个抽象观察者对象
	LoginEvent le;// 定义一个事件对象用来传输数据

	public LoginBean() {
		this.setLayout(new GridLayout(3, 2));
		labUserName = new JLabel("User Name:");
		add(labUserName);

		txtUserName = new JTextField(20);
		add(txtUserName);

		labPassword = new JLabel("Password:");
		add(labPassword);

		txtPassword = new JPasswordField(20);
		add(txtPassword);

		btnLogin = new JButton("Login");
		add(btnLogin);

		btnClear = new JButton("Clear");
		add(btnClear);

		// 添加监听器
		btnLogin.addActionListener(this);
		btnClear.addActionListener(this);

	}

	// 实现注册方法，即添加观察者
	public void addLoginEventListener(LoginEventListener lel) {
		this.lel = lel;
	}

	// 实现通知方法，即所谓的更新方法，通知观察者
	private void fireLoginEvent(Object object, String userName, String password) {
		le = new LoginEvent(object, userName, password);
		// 通知观察者
		lel.validateLogin(le);
	}

	// 事件处理
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnLogin) {
			String userName = txtUserName.getText();
			String password = txtPassword.getText();
			// 通知观察者
			fireLoginEvent(btnLogin, userName, password);
		}

		// 清除输入框
		if (btnClear == e.getSource()) {
			txtUserName.setText("");
			txtPassword.setText("");
		}

	}

}
