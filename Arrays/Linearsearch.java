package Arrays;
import java.util.Scanner;
public class Linearsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int n=sc.nextInt();
        System.out.println("Enter the values:");
        int number[]=new int[n];
        for(int i=0;i<n;i++)
        {
            number[i]=sc.nextInt();
        }
        System.out.print("enter the value to be search:");
        int x=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(number[i]==x)
            {
                System.out.println("value found at position:"+i);
            }
        }

    }
}
