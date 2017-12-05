package iterator.simple;

//迭代器接口
public interface MyIterator {
	public void first();

	public void next();

	public boolean isLast();

	public Object currentItem();

}
