import java.util.*;
public class passfail {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a>=50)
        {
            System.out.print("pass");
        }
        else{
            System.out.print("fail");
        }
    }
}