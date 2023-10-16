public class F18 {

    public static void main(String[] args)
    {
        int[] tab = {1,2,3,4,5};

        for(int i : tab)
        {
            System.out.print(i);
        }
        System.out.println("\n");
        System.out.println(oddElementsSum(tab));

    }

    public static int oddElementsSum(int[] tab){
        int wynik = 0;
        for(int i=0; i<tab.length;i++)
        {
            if(tab[i]%2!=0)
            {
                wynik+=tab[i];
            }
        }
        return wynik;
    }

}
