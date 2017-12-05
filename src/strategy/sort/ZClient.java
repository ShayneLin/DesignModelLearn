package strategy.sort;

public class ZClient {
	public static void main(String args[]) {
		int arr[] = { 1, 4, 6, 2, 5, 3, 7, 8, 9, 10 };
		int result[];
		// 1.创建环境类
		ArrayHandler ah = new ArrayHandler();

		// 2.创建策略具体类
		Sort sort;
		sort = new BubbleSort();

		// 3.往环境对象中注入策略实现对象
		ah.setSort(sort);
		result = ah.sort(arr);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ",");
		}
		System.out.println();

		// 选择排序策略
		sort = new SeelctionSort();

		// 3.往环境对象中注入策略实现对象
		ah.setSort(sort);
		result = ah.sort(arr);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ",");
		}
		System.out.println();

		// 插入排序策略
		sort = new InsertSort();

		// 3.往环境对象中注入策略实现对象
		ah.setSort(sort);
		result = ah.sort(arr);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ",");
		}
		System.out.println();

	}
}
