package iterator.tvcontroller;

//具体电视机类（创维电视机类）
public class SkyworthTelevision implements Television {
	// 节目
	private Object[] obj = { "CCTV-1", "CCTV-2", "CCTV-3", "CCTV-4", "CCTV-5",
			"CCTV-6", "CCTV-7", "CCTV-8", "CCTV-9", "CCTV-10" };

	@Override
	public TVIterator createIterator() {
		return new SkyworthIterator();
	}

	private class SkyworthIterator implements TVIterator {
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
