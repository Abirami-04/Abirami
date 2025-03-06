import java.util.*;
import java.util.Scanner;
class f{
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ab[]=new int[n];
        for(int i=0;i<n;i++){
        ab[i]=sc.nextInt();
        }

    
         Arrays.sort(ab);
         System.out.println(ab[0]"min");
         System.out.println(ab[n-1]);
        }
     }