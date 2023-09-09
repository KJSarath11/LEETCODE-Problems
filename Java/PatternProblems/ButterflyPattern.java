public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 5;
        // upper part
        for (int i = 1; i <= n; i++) {
            // part 1
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space between parts of upper and lower part
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // last part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower part
        for (int i = n; i >= 1; i--) {
            // part 1
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space between parts of upper and lower part
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // last part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}