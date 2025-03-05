import java.util.*;
public class zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0)
        {
            int dig=n%10;
            if(dig==0)
            {
                System.out.print("yes");
            }
            else{
                sum=sum+1;
            }
            n=n/10;
        }
        if(sum>0)
        {
            System.out.print("no");
        }
    }
}