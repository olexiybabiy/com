package com.company;

public class Incrementable {

    static void increment (){
        StaticTest.i++;
    }
    public static void main(String[] args){
        Incrementable x = new Incrementable();
        x.increment();
        Incrementable.increment();
        increment();
    }
}

class StaticTest{
    static int i = 78;
}
