import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int low = 0, mid;
        int high = arr.length - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched:");
        int key = sc.nextInt();

        int index = binarySearch(arr, key);

        if (index == -1) {
            System.out.println("Element is not found");
        } else {
            System.out.println("Element is found and is at pos " + index);
        }

        sc.close();
    }
}
