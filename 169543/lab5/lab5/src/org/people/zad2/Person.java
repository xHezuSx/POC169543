package org.people.zad2;

class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
//    Person(String firstName, String lastName){            //ten konstruktor nie zadziała ponieważ klasa "nie widzi", że chcemy przypisać argumenty do "globalnych" zmiennych
//        firstName = firstName;
//        lastName = lastName;
//    }


}
