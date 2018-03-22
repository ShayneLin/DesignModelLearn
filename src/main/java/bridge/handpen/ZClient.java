package bridge.handpen;

public class ZClient {
	public static void main(String args[]) {
		// 1.抽象的对象声明
		Color color;
		Pen pen;
		// 2.例子1
		color = new Blue();
		pen = new BigPen();
		pen.setColor(color);
		pen.draw("大西瓜");

		// 3.例子2
		color = new Black();
		pen = new SmallPen();
		pen.setColor(color);
		pen.draw("大西瓜");
	}
}
