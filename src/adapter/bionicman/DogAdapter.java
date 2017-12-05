package adapter.bionicman;

//适配器类（DogAdapter类），类适配器
public class DogAdapter extends Dog implements Robot {

	@Override
	public void cry() {
		wang();
	}

	@Override
	public void move() {
		run();
	}

}
