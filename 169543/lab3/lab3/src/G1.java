import java.util.ArrayList;

public class G1 {
    public static void main(String[] args) {
        ArrayList<Integer> listaInt = new ArrayList<>();

        for(int i=0; i<10; i++){
            listaInt.add(i);
        }
        for(int i=listaInt.size()-1;i>=0; i--)
        {
            System.out.println(listaInt.get(i));
        }

    }
}
