package bridge.handpen;

//具体实现类（红色类）
public class Red implements Color {

	@Override
	public void bepaint(String penType, String name) {
		System.out.println(penType + "红色的" + name);
	}

}
