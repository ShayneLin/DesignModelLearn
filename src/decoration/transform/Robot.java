package decoration.transform;

//具体装饰类（机器人）
public class Robot extends Changer {

	public Robot(Transform transform) {
		super(transform);
		System.out.println("变成机器人了！");
		// 透明模式
		// say();
	}

	public void say() {
		System.out.println("说话！");
	}
}
