
//Napisz statyczną metodę, której argumentem jest dodatnia liczba całkowita
//. Metoda zwraca true jeśli zadana liczba
// jest nieparzysta, ujemna, (poza minusem) składa się z 4 cyfr i podzielna przez 5, oraz zwraca false w pozostałych przypadkach.
// Stwórz przypadek testowy dla metody.

import java.util.Arrays;

public class D5 {

    public static boolean func(int n)
    {
        String nStr = Integer.toString(n);
        if(n%2!=0 && n%5==0 && nStr.length() == 4) // funcja z założenia przyjmuje licbę dodatnią a pierwszy warunek sprawia że funckaj nigdy nie zwróci true
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        System.out.println(func(-2015));
    }
}
