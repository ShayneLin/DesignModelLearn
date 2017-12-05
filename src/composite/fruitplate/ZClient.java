package composite.fruitplate;

public class ZClient {
	public static void main(String args[]) {
		MyElement obj1, obj2, obj3, obj4, obj5, obj6;
		Plate plate1, plate2, plate3;
		// 1.初始化水果和水果盘
		obj1 = new Apple();
		obj2 = new Banana();
		plate1 = new Plate();
		plate1.add(obj1);
		plate1.add(obj2);

		obj3 = new Pear();
		obj4 = new Banana();
		plate2 = new Plate();
		plate2.add(obj3);
		plate2.add(obj4);

		obj5 = new Pear();
		obj6 = new Apple();
		plate3 = new Plate();
		plate3.add(obj5);
		plate3.add(obj6);

		// 2.嵌套
		plate3.add(plate1);
		plate3.add(plate2);
		
		plate3.eat();
		/**
		 * 在调用水果盘的eat()方法时，将递归调用其中每个成员对象的eat()方法，最终执行
		 * 每个水果对象的eat()方法，实现对水果的遍历.
		 */
	}
}
