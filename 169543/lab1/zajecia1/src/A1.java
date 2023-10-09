import java.util.Scanner;

//2,4,6,8,10,12 zadania

public class A1 {
    public static void main(String[] args)
    {
        Scanner scaner = new Scanner(System.in);

        System.out.println("podaj pierwszą liczbę:");
        int x = scaner.nextInt();

        System.out.println("podaj drugą liczbę:");
        int y = scaner.nextInt();

        System.out.println("wynik to: "+ (x+y));

    }
}
