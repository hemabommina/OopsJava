class InsertionSort {
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Print the array
    void printArray(int arr[]) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    // Main method
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6};
        InsertionSort obj = new InsertionSort();
        obj.sort(arr);
        System.out.println("Sorted array:");
        obj.printArray(arr);
    }
}
