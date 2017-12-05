package bridge.handpen;

//具体实现类（黑色类）
public class Black implements Color {

	@Override
	public void bepaint(String penType, String name) {
		System.out.println(penType + "黑色的" + name);
	}

}
