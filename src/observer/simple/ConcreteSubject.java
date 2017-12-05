package observer.simple;

//具体的目标，即具体被观察的对象
public class ConcreteSubject extends Subject {

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	// 通知所有的观察者
	@Override
	public void notifyObserver() {
		for (Object obs : observers) {
			((Observer) obs).update();
		}

	}

}
