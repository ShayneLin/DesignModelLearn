package strategy.sort;

//选择排序策略
public class SeelctionSort implements Sort {

	@Override
	public int[] sort(int[] arr) {
		int len = arr.length;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		System.out.println("选择排序");
		return arr;
	}
}
