package com.classandinterface;

public class PrintClassMonth extends AbstractClassMonth{

    PrintClassMonth(int numOfMonth) {
        super(numOfMonth);
    }

    @Override
    void printPhrase() {
        System.out.println("Madness? This is SPARTA!!!");
    }
}
