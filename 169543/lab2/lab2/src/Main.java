import java.util.Scanner;
// wariant J
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wpisz dowolną dodatnią liczbę całkowitą");
        int n = scanner.nextInt();
        for(int i =1; i<n; i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            }
            else if (i%5==0) {
                System.out.println("Buzz");
            }
            else {
                int j = i;
                System.out.println(j);
            }
        }
    }
}