class SelectionSort {

	public static void main(String[] args) {

		// int[] arr={64, 25, 12, 22, 11};
		int[] arr = { 10, 20, 30, 40, 50 };

		System.out.println("Original Array: ");
		display(arr);

		System.out.println();
		sort(arr);

		System.out.println("\nSorted Array is:");
		display(arr);

	}

	public static void sort(int[] arr) {

		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {

			int minIndex = i;

			for (int j = i + 1; j < n; j++) {

				if (arr[j] < arr[minIndex])
					minIndex = j;

			}
			swap(arr, i, midIndex);
			System.out.print("Round " + (i + 1) + ": ");
			display(arr);
		}

	}

	public static void swap(int[] arr, int j, int midIndex) {
		int temp = arr[j];
		arr[j] = arr[midIndex];
		arr[midIndex] = temp;
	}

	public static void display(int[] arr) {
		for (int x : arr)
			System.out.print(x + " ");
		System.out.println();
	}
}