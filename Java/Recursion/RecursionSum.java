public class RecursionSum {
    public static void printSum(int i, int n, int sum) {
        // base
        if (i == n) {
            sum += i;
            System.out.println("Sum is:" + sum);
            return;
        }
        // condtion
        sum += i;
        printSum(i + 1, n, sum);
    }

    public static void main(String[] args) {
        printSum(1, 5, 0);
    }
}
