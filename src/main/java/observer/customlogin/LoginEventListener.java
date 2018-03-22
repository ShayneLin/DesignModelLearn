package observer.customlogin;

import java.util.EventListener;
//抽象观察者，监听LoginEvent事件， LoginEvent的Listener
//,若LoginEvent改变了会通知它

public interface LoginEventListener extends EventListener {
	public void validateLogin(LoginEvent loginEvent);
}
