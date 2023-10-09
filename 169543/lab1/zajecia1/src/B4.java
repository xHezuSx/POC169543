import java.util.Scanner;

public class B4 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj współczynnik a: ");
        double a = scanner.nextDouble();
        System.out.println("podaj współczynnik b: ");
        double b = scanner.nextDouble();
        System.out.println("podaj współczynnik c: ");
        double c = scanner.nextDouble();


        if(a!=0)
        {
            double delta = (b*b) - 4*a*c;

            if(delta>0)
            {
                double s = Math.sqrt(delta);
                System.out.println("x1="+((-b-s)/(2*a)));
                System.out.println("x2="+((-b+s)/(2*a)));
            }

            else if (delta==0)
            {
                System.out.println("x="+((-b)/(2*a)));
            }

            else if (delta<0)
            {
                if(b!=0)
                {
                    System.out.println("x="+((-c)/b));
                }

                else
                {
                    System.out.println("brak rozwiązań");
                }
            }

        }


    }
}
