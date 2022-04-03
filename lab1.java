import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMin(arr));
    }

    public static int findMin(int[] a) {
        return findMin(a, 1, a[0]);
    }

    private static int findMin(int[] a, int i, int min) {
        if (i >= a.length) {
            return min;
        } else {
            return min > a[i] ? a[i] : findMin(a, i + 1, min);
        }
    }
}
