//TIME COMPLEXITY O(2^N)

public class TowerofHanoi {
    public static void toh(int n, String source, String helper, String destination) {
        // base case
        if (n == 1) {
            System.out.println("Transef disk " + n + " from " + source + " to " + destination);
            return;
        }
        // approach steps
        toh(n - 1, source, destination, helper);
        System.out.println("Transef disk " + n + " from " + source + " to " + destination);
        toh(n - 1, helper, source, destination);

    }

    public static void main(String[] args) {
        int n = 3;
        toh(n, "S", "H", "D");
    }
}
