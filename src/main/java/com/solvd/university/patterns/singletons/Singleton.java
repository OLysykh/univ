package com.solvd.university.patterns.singletons;

public class Singleton {

    private static final Singleton instance = new Singleton(); //because this instance is static it will always be initialized when cod eis compiling;

    private Singleton(){

    }

    public Singleton getInstance (){
        return instance;
    }

}
