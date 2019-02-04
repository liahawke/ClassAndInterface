package com.classandinterface;

public class PrintPhraseClass implements PrintPhraseInterface {

    @Override
    public void printPhrase() {
        System.out.println("This is madness.");
    }

    @Override
    public String returnDayNameByNum(int numOfDay) {
        String dayName;
        switch(numOfDay){
            case 1:
                dayName = DaysOfWeek.MONDAY.getNameOfWeek();
                break;
            case 2:
                dayName = DaysOfWeek.TUESDAY.getNameOfWeek();
                break;
            case 3:
                dayName = DaysOfWeek.WEDNESDAY.getNameOfWeek();
                break;
            case 4:
                dayName = DaysOfWeek.THURSDAY.getNameOfWeek();
                break;
            case 5:
                dayName = DaysOfWeek.FRIDAY.getNameOfWeek();
                break;
            case 6:
                dayName = DaysOfWeek.SATURDAY.getNameOfWeek();
                break;
            case 7:
                dayName = DaysOfWeek.SUNDAY.getNameOfWeek();
                break;
            default:
                dayName = "There is no day under this number";
                break;
        }
        return dayName;
    }

    @Override
    public int returnDayNumByName(String name) {
        int dayNumber;
        switch(name) {
            case "Monday":
                dayNumber = DaysOfWeek.MONDAY.getIndexNumber();
                break;
            case "Thuesday":
                dayNumber = DaysOfWeek.TUESDAY.getIndexNumber();
                break;
            case "Wednesday":
                dayNumber = DaysOfWeek.WEDNESDAY.getIndexNumber();
                break;
            case "Thursday":
                dayNumber = DaysOfWeek.THURSDAY.getIndexNumber();
                break;
            case "Friday":
                dayNumber = DaysOfWeek.FRIDAY.getIndexNumber();
                break;
            case "Saturday":
                dayNumber = DaysOfWeek.SATURDAY.getIndexNumber();
                break;
            case "Sunday":
                dayNumber = DaysOfWeek.SUNDAY.getIndexNumber();
                break;
            default:
                dayNumber = 0;
                break;
        }
        return dayNumber;
    }

}
