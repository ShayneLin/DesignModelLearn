package composite.fruitplate;

//叶子构件（梨子类）
public class Pear extends MyElement{

	@Override
	public void eat() {
		System.out.println("吃梨子！");
		
	}

}