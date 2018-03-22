package command.remotecontrol;

//接收者类，即电视类
public class Television {
	public void open() {
		System.out.println("打开电视机");
	}

	public void close() {
		System.out.println("关闭电视机");
	}

	public void change() {
		System.out.println("改变频道");
	}
}
