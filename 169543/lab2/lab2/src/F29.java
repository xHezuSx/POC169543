import java.util.Arrays;

public class F29 {
    public static void main(String[] args) {

        double[] tab = {-1.3333, Math.sqrt(3.14), 66.6, -12.43, 1};

        for(double i : tab)
        {
            System.out.println(i);
        }

        sortArray(tab);
        System.out.printf("\n");


        for(double i : tab)
        {
            System.out.println(i);
        }

    }

    public static void sortArray(double[] tab)
    {
        Arrays.sort(tab);
    }

}