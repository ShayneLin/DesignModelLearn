package bridge.handpen;

//具体实现类（蓝色类）
public class Blue implements Color {

	@Override
	public void bepaint(String penType, String name) {
		System.out.println(penType + "蓝色的" + name);
	}

}
