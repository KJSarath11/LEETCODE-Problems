public class NegativeInvertedHalfPyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)//loop to print space//space is determined by checking (n-i)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)//loop to print star
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
