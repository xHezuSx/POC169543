//Napisz program, który tworzy tablicę jednowymiarową 15
// liczb całkowitych, a następnie oblicza i wyświetla największą
// i najmniejszą wartość w tablicy.
public class F3 {

    public static void main(String[] args)
    {
        int[] tab = new int[15];
        for(int i=0;i<15;i++)
        {
            tab[i] = i;
        }
        int min = tab[0];
        int max = tab[0];
        for(int i=0; i<tab.length;i++)
        {
            if(min>tab[i])
            {
                min= tab[i];
            }
            if(max<tab[i])
            {
                max=tab[i];
            }
        }
        System.out.println("największa wartość: "+max+"\nnajmniejsza wartość: "+min);

    }



}
