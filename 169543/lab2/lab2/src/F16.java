public class F16 {

    public static void main(String[] args)
    {
        int[] tab = {1,2,3,4,5};

        for(int i : tab)
        {
            System.out.print(i);
        }

        reverseArray(tab);
        System.out.println("\n");

        for(int i : tab)
        {
            System.out.print(i);
        }
    }

    public static void reverseArray(int[] tab){
        int l = 0;
        int r = tab.length-1;

        while (l<r)
        {
            int temp = tab[l];
            tab[l] = tab[r];
            tab[r] = temp;
            r--;
            l++;
        }
    }

}
