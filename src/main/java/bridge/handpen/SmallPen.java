package bridge.handpen;

//扩充抽象类（小号毛笔类）
public class SmallPen extends Pen {

	@Override
	public void draw(String name) {
		String penType = "小号毛笔绘制";
		color.bepaint(penType, name);

	}

}
