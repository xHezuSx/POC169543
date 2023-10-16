public class D9 {


    public static void main(String[] args)
    {
        System.out.println(func(20, 4));
    }



    public static int func(int n, int k)
    {
        return silnia(n)/(silnia(k)*(silnia(n-k)));
    }
    public static int silnia(int a)
    {
        int wynik=1;
        for(int i=a;i>=1;i--)
        {
            wynik*=i;
        }
        return wynik;
    }
}
