package iterator.simple;

//具体聚合类
public class NewCollection implements MyCollection {
	private Object[] obj = { "dog", "pig", "cat", "monkey", "pig" };

	@Override
	public MyIterator createIterator() {
		return new NewIterator();
	}

	// 迭代器实现类（内部类）
	class NewIterator implements MyIterator {
		private int currentIndex = 0;

		@Override
		public void first() {
			currentIndex = 0;
		}

		@Override
		public void next() {
			if (currentIndex < obj.length) {
				currentIndex++;
			}
		}

		@Override
		public boolean isLast() {
			return currentIndex == obj.length;
		}

		@Override
		public Object currentItem() {
			return obj[currentIndex];
		}

	}

}
