package info.people.zad13;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Andrzej", "Jakubiak", 22, "Słonczeczna 15");
        person.setAge(23);
        person.setAddress("Słoneczna 16");
        person.setLastName("Mikołajowicz");
        person.setFirstName("Michał");

        System.out.println(person.introduceYourself());

    }
}
