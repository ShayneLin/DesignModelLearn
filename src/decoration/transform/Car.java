package decoration.transform;

//具体构建类（汽车类） 用final修饰使它不能通过继承新增功能，所以我们使用装饰者模式
public final class Car implements Transform {
	public Car() {
		System.out.println("变形金刚是一辆汽车！");
	}

	@Override
	public void move() {
		System.out.println("在陆地上移动！");

	}

}
