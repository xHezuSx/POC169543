import java.util.Random;

public class E2 {

    public static void main(String[] args)
    {
        System.out.println(generateRandomDouble());
    }

    public static double generateRandomDouble()
    {
        Random random = new Random();
        return random.nextDouble();
    }

}
