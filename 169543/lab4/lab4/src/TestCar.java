public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = null;
        System.out.println(car.brand);          // wynik: null
        System.out.println(car.brand==null);    // wynik: true
    }
}


class Car{
    public String brand;
}

