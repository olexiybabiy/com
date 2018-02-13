package com.company;

public class Storage {

    String z = "Wegfhsjqwmem";
    int storage(String z){
        return z.length();
    }

    void ex(){
        System.out.print(storage(z));
    }

    public  static  void main(String[] args){
        Storage f = new Storage();
        f.ex();
    }
}
