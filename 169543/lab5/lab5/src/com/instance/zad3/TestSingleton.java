package com.instance.zad3;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();

        System.out.println(s1==s2);
    }
}
