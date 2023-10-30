import java.util.ArrayList;

public class TestPerson {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        System.out.println(people.get(0).name);     // jak na razie nie dodaliśmy żadnych obiektów do listy dlatego generuje nam to wyjątek: Index 0 out of bounds for length 0, poza tym wartość jest null'em
    }
}


class Person{
    public String name;
}
