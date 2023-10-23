import java.util.ArrayList;

public class H10 {
    public static void main(String[] args) {
        StringBuilder napis = new StringBuilder("bananowy");
        ArrayList<Character> temp = new ArrayList<>();

        for(int i=0; i< napis.length();i++) {
            if(!temp.contains(napis.charAt(i))) temp.add(napis.charAt(i));
        }

        StringBuilder napisBezPowtorzen = new StringBuilder();

        for(int i=0; i<temp.size();i++){
            napisBezPowtorzen.append(temp.get(i));
        }

        System.out.println(napisBezPowtorzen);


    }
}
