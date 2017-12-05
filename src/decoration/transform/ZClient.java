package decoration.transform;

public class ZClient {
	public static void main(String args[]) {
		System.out.println("没有增加新行为前：");
		// 1.创建具体构建类的对象
		Car car = new Car();
		car.move();

		System.out.println("--------------------");
		System.out.println("变成机器人后的行为：");
		Robot robot = new Robot(car);
		robot.move();
		robot.say();
		// 透明模式
		// Transform robot = new Robot(car);
		// robot.move();

		System.out.println("---------------------");
		System.out.println("变成飞机后的行为:");
		Airplane airplane = new Airplane(car);
		airplane.move();
		airplane.fly();

		/*
		 * ！！！！！！！ 需要注意的是，car对象可以通过抽象构件Transform进行定义，但是定义
		 * robot和airplane对象时只能通过Robot和Airplane，因为say()方法
		 * 和fly()方法未在Transform中声明。也就是说对于具体构件可以通过抽象
		 * 构件来定义，但是对于具体装饰者不能通过抽象构件来定义，对于客户端来说具体 构件是透明的，而具体装饰者是不透明的，这被称为半透明装饰模式。
		 * 
		 * 
		 * 若想更改为透明装饰模式也很简单：将say()和fly()方法的调用封装到move()里即可
		 * 那么在测试方法中调用move()时，也能实现相应的功能，对吧！！！
		 */
	}

}
