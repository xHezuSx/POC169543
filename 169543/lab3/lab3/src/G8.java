import java.util.ArrayList;

public class G8 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(9);
        lista.add(2);
        lista.add(0);
        lista.add(12);
        lista.add(44);
        lista.add(0);

        System.out.println("liczba zer to: "+countZeros(lista));
    }


    public static int countZeros(ArrayList<Integer> lista){
        int liczbaZer = 0;
        for(int i=0; i<lista.size();i++){
            if(lista.get(i)==0)
            {
                liczbaZer++;
            }
        }
        return liczbaZer;
    }

}
