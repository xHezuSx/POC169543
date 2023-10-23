public class Main {
    public static void main(String[] args) {
        // wejściówka - warinat 344

        int a = 14;
        boolean b = czyPodzielnaPrzezTrzy(a);
        System.out.println(b);



    }
    public static boolean czyPodzielnaPrzezTrzy(int a)
    {
        if(a%3==0) return true;
        return false;
    }
}