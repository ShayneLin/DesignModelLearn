package iterator.tvcontroller;

//抽象迭代器，电视机遥控器类
public interface TVIterator {
	public void setChannel(int i);

	public void next();

	public void previous();

	public boolean isLast();

	public Object currentChannel();

	public boolean isFirst();
}
