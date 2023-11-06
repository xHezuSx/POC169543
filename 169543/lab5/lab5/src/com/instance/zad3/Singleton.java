package com.instance.zad3;

class Singleton {
    static Singleton singleton = new Singleton();

    private Singleton(){
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
