package com.company;

public class Static_Test {

        static int a = 56;
        public static void main(String[] args){
            Static_Test frs_1 = new Static_Test();
            Static_Test frs_2 = new Static_Test();

            System.out.println("F: "+frs_1.a+"; S: "+frs_2.a+";");

            frs_1.a++;

            System.out.println("F: "+frs_1.a+"; S: "+frs_2.a+";");

        }
}
