package adapter.bionicman;

//适配器类（CatAdatper类），对象适配器
public class CatAdapter implements Robot {

	private Cat cat;

	public CatAdapter() {
		// TODO Auto-generated constructor stub
	}

	public CatAdapter(Cat cat) {
		super();
		this.cat = cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	@Override
	public void cry() {
		cat.miao();
	}

	@Override
	public void move() {
		cat.run();
	}

}
