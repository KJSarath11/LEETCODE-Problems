import java.util.Scanner;

public class intro{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            int result=sum(num1,num2);
            System.out.println("Result:"+result);
            
            sc.close();// preventing the resource leak
    }

    static int sum(int a,int b){
        int c=a+b;
        return c;
    }
}