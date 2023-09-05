public class PalindromicPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //first half                    //          1
            for(int j=i;j>=1;j--){          //         21
                System.out.print(j);        //        321
            }
            //second half                   //          1
            for(int j=2;j<=i;j++){          //          12
                System.out.print(j);        //          123
            }
        System.out.println();
        }
    }
}
