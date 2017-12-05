package bridge.handpen;

//抽象类（毛笔类）
public abstract class Pen {
	protected Color color;

	//注入的color对象决定了另一个维度，通过关联来达到解耦，而不是用继承
	public void setColor(Color color) {
		this.color = color;
	}

	public abstract void draw(String name);
}
