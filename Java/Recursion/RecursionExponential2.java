//STACK HEIGHT = LOG N

public class RecursionExponential2 {
    public static int calculateExponential(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        // by using [(n/2)*(n/2)=n] concept we are only using log n space
        // even case
        if (n % 2 == 0) {
            return calculateExponential(x, n / 2) * calculateExponential(x, n / 2);
        }
        // odd case
        else {
            return calculateExponential(x, n / 2) * calculateExponential(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int x = 2, n = 10;
        int Exponential = calculateExponential(x, n);
        System.out.println(Exponential);
    }
}
