package pl.cars.zad10;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car("Tesla","S");
        System.out.println(car.price);
        car.price += 5.0;
        System.out.println(car.price);  // działa
    }
}
