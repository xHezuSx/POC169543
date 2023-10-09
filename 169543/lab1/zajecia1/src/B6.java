import java.util.Scanner;

public class B6
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj rok a ja sprawdzę czy jest przestępny: ");

        int rok = scanner.nextInt();

        if(rok%4==0)
        {
            if(rok%100!=0)
            {
                System.out.println("rok " +rok + " jest przestępny");
            }
            else if (rok%400==0)
            {
                System.out.println("rok " +rok + " jest przestępny");
            }
        }
        else
        {
            System.out.println("rok " +rok + " NIE jest przestępny");
        }
    }
}
