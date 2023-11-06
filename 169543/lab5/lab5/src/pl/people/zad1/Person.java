package pl.people.zad1;

class Person {
    String name;
    static int counter;

    Person(){
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
