import java.util.ArrayList;

public class G4 {
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<>();
        for(int i =0; i<15; i++)
        {
            lista.add(i/(-2.0));
        }

        for(double i : lista)
        {
            System.out.println(i);
        }

        double min = minimumValue(lista);
        System.out.println("oto najmniejsza wartość z ArrayList:");
        System.out.println(min);

    }

    public static double minimumValue(ArrayList<Double> lista)
    {
        double min = lista.get(0);
        for(int i=0; i<lista.size();i++){
            if(min>lista.get(i)) min = lista.get(i);
        }
        return min;
    }

}
