import java.util.Scanner;

public class B8 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj dochody: ");

        double salary = scanner.nextDouble();

        if(salary<=85528)
        {
            double podatek = salary*0.18;
            System.out.println("podatek wynosi: "+podatek);
        }
        else if (salary>85528)
        {
            double podatek = 14839.02 + (salary*0.32);
            System.out.println("podatek wynosi: "+podatek);
        }
    }
}
