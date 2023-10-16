import java.util.Random;

public class E3 {

    public static void main(String[] args)
    {
        System.out.println(generateRandomIntInRange(5,10));
    }

    public static int generateRandomIntInRange(int x, int y)
    {
        Random random = new Random();
        return random.nextInt(x,y+1);
    }

}
