import java.util.*;
public class z
{
    public static void main(String[] args) {
        int mark=98,pass=35;
        if(mark>=pass)
        {
            System.out.println("passed");
            if(mark>=80)
            {
                System.out.println("above 80");
                if(mark==100)
                {
                    System.out.println("centum");
                }
            }
        }
        else{
            System.out.println("fail");
        }
    }
}