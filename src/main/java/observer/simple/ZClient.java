package observer.simple;

public class ZClient {
	public static void main(String args[]){
		//1.创建目标对象，即被观察者对象
		Subject subject = new ConcreteSubject();
		//2.创建观察者对象
		Observer observer = new ConcreteObserver();
		//3.将观察者添加到(attach)目标对象的List里
		subject.attach(observer);
		//4.进行通知观察者更新
		subject.notifyObserver();
	}
}
