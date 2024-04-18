public class InsertionSort {
    
    public static void InsertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] theArray = {21, 59, 64, 99, 72, 31, 43, 76, 10};

        System.out.print("Original Array: ");
        for (int num : theArray) {
            System.out.print(num + ", ");
        }

        InsertionSort(theArray);

        System.out.print("\nSorted Array: ");
        for (int num: theArray) {
            System.out.print(num + ", ");
        }
    }
}
