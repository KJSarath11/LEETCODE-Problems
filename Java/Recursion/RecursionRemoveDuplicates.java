public class RecursionRemoveDuplicates {
    public static boolean map[]=new boolean[26];//which denotes 26 letters in an alphabet

    public static void removeDuplicates(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println("New string : " + newStr);
            return;
        }

        char currchar = str.charAt(idx);

        if (map[currchar - 'a'] == true)// this determines whether the character repeats or not
        {
            removeDuplicates(str, idx + 1, newStr);
        } else {
            newStr += currchar;
            map[currchar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr);
        }

    }

    public static void main(String[] args) {
        String str="abbccda";
        removeDuplicates(str,0,"");
    }
}
