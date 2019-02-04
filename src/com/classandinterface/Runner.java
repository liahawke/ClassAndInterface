package com.classandinterface;

public class Runner{

    public static void main(String[] args) {
        PrintPhraseClass printPhrase = new PrintPhraseClass();
        PrintClassMonth printMonth = new PrintClassMonth(12);
        String numberOfMonth = printMonth.getMonthNameByNum();
        String nameOfDay = printPhrase.returnDayNameByNum(7);
        int numberOfDay = printPhrase.returnDayNumByName("Saturday");
        System.out.println("This is "+numberOfMonth + " month");
        System.out.println("This is "+nameOfDay+ " day");
        if(numberOfDay == 0){
            System.out.println("There is no such day of week!");
        } else {
            System.out.println("This is " + numberOfDay + " day of the week");
        }
        printPhrase.printPhrase();
        printMonth.printPhrase();
    }
}
