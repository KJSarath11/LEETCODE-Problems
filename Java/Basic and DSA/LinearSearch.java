import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the search element:");
        int n=sc.nextInt();

        int a[]={10,20,30,40,50,60,};
        int pos=-1;

        for(int i=0;i<a.length;i++){
            if(a[i]==n)
            {
                pos=i;
                break;
            }
        }

        if(pos==-1){
            System.out.println("Search element do not exist");
        }else{
            System.out.print("Search element is at "+pos);
        }
        
        sc.close();
    }
    
}
