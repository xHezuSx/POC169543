public class TestDog {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();


    }
}

class Dog{
    String name;
    String breed;
    int age;

    void bark(){
        System.out.println("Hał hał!");
    }

}