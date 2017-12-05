package adapter.bionicman;

//适配者类（Cat类），适配器所需要适配的类
public class Cat {
	public void miao() {
		System.out.println("猫喵喵叫！");
	}

	public void run() {
		System.out.println("小猫跑呀跑！");
	}
}
