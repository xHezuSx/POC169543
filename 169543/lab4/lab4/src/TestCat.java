public class TestCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = null;
        Cat cat2;
        cat2 = cat1.createCat();
        System.out.println(cat2.name);      // w tym przypadku odwołujemy się do pola z warością null co generuje error
    }
}


class Cat{
    String name;

    Cat createCat(){
        Cat cat = new Cat();
        if(this.name!=null) cat.name = this.name;
        else return null;
        return cat;
    }
}