import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int a;
        int b;
        int c;
        Scanner sc= new Scanner(System.in);
        System.out.println("a= ");
        a=sc.nextInt();
        System.out.println("b= ");
        b=sc.nextInt();
        System.out.println("c= ");
        c=sc.nextInt();
        
        
        if(a > b && a> c)
        {
            System.out.println("A is Greater ");
        }
        else if(b> a && b>c)
         {
            System.out.println("B is Greater");
        }
        else
        {
          System.out.println("C is Greater");  
        }
    }
}