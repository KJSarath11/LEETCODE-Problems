
public class prime2 {
    public static void main(String args[]) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the ")
        int i, j, flag = 0;
        for (i = 50; i <= 100; i++) {
            for (j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(i);
            }
            flag=0;
        }
    }
}
