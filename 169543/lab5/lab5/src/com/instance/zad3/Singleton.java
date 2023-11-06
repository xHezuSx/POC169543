package com.instance.zad3;

class Singleton {
    static Singleton singleton;

    private Singleton(){
    }

    public static Singleton getSingleton() {
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
