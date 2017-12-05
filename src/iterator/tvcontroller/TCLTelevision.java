package iterator.tvcontroller;
//具体电视机类（TCL电视机类）
public class TCLTelevision implements Television {
	// 节目
	private Object[] obj = { "广东卫视", "深圳卫士", "江苏卫士", "浙江卫士", "北京卫视", "上海卫士",
			"湖北卫士" };

	@Override
	public TCLIterator createIterator() {
		return new TCLIterator();
	}

	private class TCLIterator implements TVIterator {
		private int currentIndex = 0;

		@Override
		public void setChannel(int i) {
			currentIndex = i;
		}

		@Override
		public void next() {
			if (currentIndex < obj.length) {
				currentIndex++;
			}
		}

		@Override
		public void previous() {
			if (currentIndex > 0) {
				currentIndex--;
			}

		}

		@Override
		public boolean isLast() {
			return currentIndex == obj.length;
		}

		@Override
		public Object currentChannel() {
			return obj[currentIndex];
		}

		@Override
		public boolean isFirst() {

			return currentIndex == 0;
		}

	}

}
