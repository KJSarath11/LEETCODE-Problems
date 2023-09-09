public class RecursionStringReverse {
    public static void printString(String str, int idx) {
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printString(str, idx - 1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        printString(str, str.length() - 1);
    }
}
