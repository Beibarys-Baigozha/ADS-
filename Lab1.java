import java.util.Scanner;

public class Lab1 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

    }

    /** task 1 */
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


    /** task 2 */
    private static double searchAverage(int[] arr) {
        double average = 0.0D;

        for(int i = 0; i < arr.length; ++i) {
            average += (double)arr[i];
        }

        average /= (double)arr.length;
        return average;
    }

    public static double calculateAverage(int[] arr) {
        return calculateAverage(arr, 1, (double)arr[0]);
    }

    private static double calculateAverage(int[] arr, int i, double sum) {
        if (i >= arr.length) {
            return sum / (double)arr.length;
        } else {
            sum += (double)arr[i];
            return calculateAverage(arr, i + 1, sum);
        }
    }


    /** task 3 */
    public static void isPrime(int n ) {
        int c = 0;
        for (int i = 2; i < (int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c > 0) {
            System.out.println("Composite");
        } else {
            System.out.println("Prime");
        }
    }


    /** task 4 */
     private static int fac(int n) {
        return n == 0 ? 1 : n * fac(n - 1);
    }


    /** task 5 */
   private static int fab(int n) {
        return n <= 1 ? n : fab(n - 1) + fab(n - 2);
    }

    /** task 6 */
    public static int square(int a , int n){
        if(n == 1){
            return a;
        }
        return a * square(a, n-1);
    }


    /** task 7 */
    public static void reverse(){
        int n = in.nextInt();
        reverse(n);
    }
    public static void reverse(int n){
        if(n < 1)
            return;
        int a = in.nextInt();
        reverse(n-1);
        System.out.println(a);
    }


    /** task 8 */
    public static void allDigits(String str){
        char[] arr = str.toCharArray();
        if(allDigits(arr, 0))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static boolean allDigits(char[] arr, int i){
        if(i >= arr.length)
            return true;
        else if(!Character.isDigit(arr[i]))
            return false;
        else
            return allDigits(arr, i+1);
    }


    /** task 9 */
    public static int BinomialCoefficient(int n, int k) {
        return k != 0 && n != k ? Bc(n - 1, k - 1) + Bc(n - 1, k) : 1;
    }


    /** task 10 */
     public static int GCD(int a, int b) {
        return b == 0 ? a : GCD(b, a % b);
    }
}
