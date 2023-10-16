//Napisz program, który tworzy jednowymiarową tablicę 50 liczb całkowitych.
// Program powinien obliczać i wyświetlać ilość liczb, które są liczbami pierwszymi.
public class F12 {

    public static void main(String[] args)
    {
        int[] tab = new int[50];
        for(int i=0;i<tab.length;i++)
        {
            tab[i] = i;
        }

        int iloscLiczbPierwszych = 0;

        for(int i=0;i<tab.length;i++){
            boolean pierwsza = true;
            if(tab[i]==0 || tab[i]==1)
            {
                pierwsza = false;
            }
            for(int j = 2; j<tab[i];j++)
            {
                if(tab[i]%j==0) {
                    pierwsza = false;
                    break;
                }

            }
            if(pierwsza) {
                iloscLiczbPierwszych++;
                System.out.println(iloscLiczbPierwszych + ": " + tab[i]);
            }
        }

    }

}
