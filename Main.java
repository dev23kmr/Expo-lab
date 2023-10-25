package org.example;

import org.example.lambda.Printable;

public class Main {

    static void printThing(Printable printable, int a , int b){
        printable.add(a,b);
    }
    public static void main(String[] args) {
        printThing(  (a,b) -> System.out.println("Sum is "+ (a +  b)) , 7, 8);
    }
}