package adapter.bionicman;

//适配者类（Dog类），适配器所需要适配的类
public class Dog {
	public void wang() {
		System.out.println("狗汪汪叫！");
	}

	public void run() {
		System.out.println("够快快跑！");
	}
}
