import java.util.*;
public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int dig;
        int n=sc.nextInt();
        while(n>0)
        {
            dig=n%10;
            sum=sum+dig;
            n=n/10;
        }
        System.out.println(sum);
        }

    }