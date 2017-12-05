package adapter.bionicman;

public class ZClient {
	public static void main(String args[]) {
		// 1.创建DogAdapter对象（类适配器）
		// 其实还是可以dogAdapter.run()调用到Dog的方法，这种方式有点不行啊。
		DogAdapter dogAdapter = new DogAdapter();
		dogAdapter.cry();
		dogAdapter.move();

		System.out.println("------------------------------");
		// 2.创建CatAdapter对象（对象适配器）这种方式比较不错,但却需要暴露Cat
		// 其实也可以直接在构造方法里默认创建一个Cat对象就行了
		Cat cat = new Cat();
		CatAdapter catAdapter = new CatAdapter(cat);
		catAdapter.cry();
		catAdapter.move();

	}
}
