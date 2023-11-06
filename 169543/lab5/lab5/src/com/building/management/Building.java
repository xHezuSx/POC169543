package com.building.management;

public class Building {

    private String address;
    private int floors;

    Building(String address, int floors){
        this.address = address;
        setFloors(floors);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setFloors(int floors) {
        this.floors = floors<1 ? 1 : floors;
    }

    public int getFloors() {
        return floors;
    }
}
