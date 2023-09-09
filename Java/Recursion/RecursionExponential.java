//STACK HEIGHT = N

public class RecursionExponential {
    public static int calculateExponential(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int x_raised_to_minus_one = calculateExponential(x, n - 1);
        int expo = x * x_raised_to_minus_one;
        return expo;
    }

    public static void main(String[] args) {
        int x = 2, n = 10;
        int Exponential = calculateExponential(x, n);
        System.out.println(Exponential);
    }
}
