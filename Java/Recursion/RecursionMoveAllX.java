public class RecursionMoveAllX {
    public static void moveAllX(String str, int idx, int count, String newStr) {

        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.println("New string : " + newStr);
            return;
        }

        char currchar = str.charAt(idx);
        if (currchar == 'x') {
            count++;
            moveAllX(str, idx + 1, count, newStr);
        } else {
            newStr += currchar;
            moveAllX(str, idx + 1, count, newStr);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllX(str, 0, 0, "");
    }
}
