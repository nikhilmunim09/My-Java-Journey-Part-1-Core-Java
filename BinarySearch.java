public class BinarySearch {
    public static void main(String[] args) {
        int item = 62;
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        if (binarySearch(arr, 0, arr.length - 1, item) == -1) {
            System.out.println(item + " is not found in the list.");
        } else {
            System.out.println(item + " is found at index : " + binarySearch(arr, 0, arr.length - 1, item));
        }
    }

    public static int binarySearch(int[] arr, int left, int right, int item) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == item) {
                return mid;
            } else if (arr[mid] < item) {
                return binarySearch(arr, mid + 1, right, item);
            } else {
                return binarySearch(arr, left, mid - 1, item);
            }
        } else {
            return -1;
        }
    }
}
