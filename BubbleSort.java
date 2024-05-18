public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 12, 43, 15, 67, 87, 45, 37, 56, 87, 93, 5 };
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
    }

    public static void bubbleSort(int[] arr) {
        int i, j, len;
        len = arr.length;
        for (i = 0; i < len - 1; i++) {
            boolean swapped = true;
            for (j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                    swapped = false;
                }
            }
            if (swapped) {
                break;
            }
        }
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
