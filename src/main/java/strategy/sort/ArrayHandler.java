package strategy.sort;

//环境类，即数组的处理类
public class ArrayHandler {
	private Sort sort;

	// 调用的方法
	public int[] sort(int arr[]) {
		sort.sort(arr);
		return arr;
	}

	public void setSort(Sort sort) {
		this.sort = sort;
	}
}
