package com.deckofcards;

public class Fizz <T>{

    public Fizz(){

    }

    public void doSomething(T foo){
        System.out.println(foo.getClass());
    }

    static void main() {
        Fizz<Integer> robert = new Fizz<>();
        Fizz<String> bobby = new Fizz<>();
        robert.doSomething(5);
        bobby.doSomething("Robert");
    }
}
