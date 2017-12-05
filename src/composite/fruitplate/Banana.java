package composite.fruitplate;

//叶子构件（香蕉类）
public class Banana extends MyElement{

	@Override
	public void eat() {
		System.out.println("吃香蕉！");
		
	}

}