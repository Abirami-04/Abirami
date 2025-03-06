import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        int tam,eng,mat,sci,soc,total,avg;
        Scanner sc=new Scanner(System.in);
        tam=sc.nextInt();
        eng=sc.nextInt();
        mat=sc.nextInt();
        sci=sc.nextInt();
        soc=sc.nextInt();
        total=tam+eng+mat+sci+soc;
        avg=total/5;
        System.out.println(total);
        System.out.println(avg);
    }
}