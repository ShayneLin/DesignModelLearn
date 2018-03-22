package observer.simple;

import java.util.ArrayList;

//目标即被观察的对象
public abstract class Subject {
	
	protected ArrayList observers = new ArrayList();

	public abstract void attach(Observer observer);

	public abstract void detach(Observer observer);

	public abstract void notifyObserver();
}
