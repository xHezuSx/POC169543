import java.util.Arrays;

public class F28 {
    public static void main(String[] args) {
        double[] tab = {-1.3333, Math.sqrt(3.14), 3, 4, 5};
        for(double i : tab)
        {
            System.out.println(i);
        }
        double[] copyedTab = copyArray(tab);

        System.out.printf("\n");

        for(double i : copyedTab)
        {
            System.out.println(i);
        }
    }

    public static double[] copyArray(double[] tab)
    {
        return Arrays.copyOf(tab, tab.length);
    }

}