import java.util.*;
public class report {
    public static void main(String[] args) {
        int tam,eng,mat,sci,soc;
        Scanner sc=new Scanner(System.in);
        tam=sc.nextInt();
        eng=sc.nextInt();
        mat=sc.nextInt();
        sci=sc.nextInt();
        soc=sc.nextInt();
        System.out.print("TAMIL "+tam+" ");
        if(tam>=50)
        {
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
        System.out.print("ENGLISH "+eng+" ");
        if(eng>=50)
        {
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
        System.out.print("MATHS "+mat+" ");
        if(mat>=50)
        {
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
        System.out.print("SCIENCE "+sci+" ");
        if(sci>=50)
        {
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
        System.out.print("SOCIAL "+soc+" ");
        if(soc>=50)
        {
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}