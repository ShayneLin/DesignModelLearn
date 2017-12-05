package observer.simple;

//具体的观察者对象
public class ConcreteObserver implements Observer {

	@Override
	public void update() {
		System.out.println("我是观察者，接收到了你的更新通知");

	}

}
