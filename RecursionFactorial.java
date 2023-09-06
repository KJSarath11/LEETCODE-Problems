public class RecursionFactorial {
    public static int calculateFactorial(int n) {
        // base
        if (n == 1 || n == 0) {
            return 1;
        }
        // printingconditon
        int x_minus_one = calculateFactorial(n - 1);
        int fact = n * x_minus_one;
        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        int Factorial = calculateFactorial(n);
        System.out.println("The factorial of " + n + " is: " + Factorial);
    }
}
