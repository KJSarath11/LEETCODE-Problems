public class SolidPattern {
    public static void main(String[] args) {
        int n=5;
        int m=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();//if this line is not kept then patter appears in a single line.
        }
    }
}
