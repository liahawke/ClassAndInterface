package com.classandinterface;

public enum DaysOfWeek {
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    private String dayOfWeek;
    private int indexNumber;

    DaysOfWeek (String dayOfWeek, int indexNumber){
        this.dayOfWeek = dayOfWeek;
        this.indexNumber = indexNumber;
    }

    public String getNameOfWeek(){
        return dayOfWeek;
    }

    public int getIndexNumber(){
        return indexNumber;
    }
}
