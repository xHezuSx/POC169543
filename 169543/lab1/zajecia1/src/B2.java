import java.util.Scanner;

public class B2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("podaj pierwszą liczbę całkowitą");
        int x = scanner.nextInt();

        System.out.println("podaj drugą liczbę całkowitą");
        int y = scanner.nextInt();

        System.out.println("podaj trzecią liczbę całkowitą");
        int z = scanner.nextInt();
        
        if(x>=y)
        {
            if(x>=z)
            {
                System.out.println(x);
            }
            else
            {
                System.out.println(z);
            }
        }
        else if (y>=x)
        {
            if(y>=z)
            {
                System.out.println(y);
            }
            else
            {
                System.out.println(z);
            }
        }
    }
}
