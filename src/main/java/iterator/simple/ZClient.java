package iterator.simple;

public class ZClient {
	public static void process(MyCollection collection) {
		MyIterator mit = collection.createIterator();
		while (!mit.isLast()) {
			System.out.println(mit.currentItem().toString());
			mit.next();
		}
	}

	public static void main(String args[]) {
		MyCollection collection = new NewCollection();
		process(collection);
	}

}
