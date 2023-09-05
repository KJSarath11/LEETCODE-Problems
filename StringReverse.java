import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string:");
        String inputString=sc.nextLine();
        
        StringBuilder sb = new StringBuilder(inputString);

       // String originalString = sb.toString();

        for (int i = 0; i < sb.length() / 2; i++) {

            int front = i;
            int back = sb.length() - 1 - i;

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);

        }
        String reversedString = sb.toString();

        System.out.println("Original String:" + inputString);
        System.out.println("Reversed string: " + reversedString);

        if (reversedString.equals(inputString)) {
            System.out.println("The string has a paliandrome");
        } else {
            System.out.println("The string does not have palindrome");
        }
        sc.close();
    }
}
