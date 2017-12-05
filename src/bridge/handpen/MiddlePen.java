package bridge.handpen;

//扩充抽象类（中号毛笔类）
public class MiddlePen extends Pen {

	@Override
	public void draw(String name) {
		String penType = "中号毛笔绘制";
		color.bepaint(penType, name);

	}

}
