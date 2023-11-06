package com.building.management;

public class TestBuilding {
    public static void main(String[] args) {
        Building build = new Building("Słoneczna 11", 0);
        build.setAddress("Słoneczna 12");
        build.setFloors(-2);

        System.out.println(build.getAddress());
        System.out.println(build.getFloors());

    }
}
