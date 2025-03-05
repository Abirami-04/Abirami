import java.util.*;
public class prime {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean flag=false;
    if(n==0||n==1){
        flag=true;
    }
    else{
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=true;
            }
            else{
                flag=false;
            }
        }
        if(flag==false)
        System.out.println("prime");
        else
        System.out.println("not prime");
    }
}
    
}