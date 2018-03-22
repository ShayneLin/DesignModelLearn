package strategy.sort;

//冒泡排序
public class BubbleSort implements Sort {

	@Override
	public int[] sort(int[] arr) {
		int len = arr.length;
		// for (int i = 0; i < len; i++) {
		// for (int j = i + 1; j < len - i; j++) {
		// if (arr[j] < arr[j - 1]) {
		// int temp = arr[j];
		// arr[j - 1] = arr[j];
		// arr[j] = temp;
		// }
		// }
		// }
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("冒泡排序");
		return arr;
	}

}
