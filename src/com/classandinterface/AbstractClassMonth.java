package com.classandinterface;

public abstract class AbstractClassMonth {
    int numOfMonth;

    AbstractClassMonth(int numOfMonth){
        this.numOfMonth = numOfMonth;
    }

    abstract void printPhrase();

   public enum MonthsOfYear{
       JANUARY("January", 1),
       FEBRUARY("February", 2),
       MARCH("March", 3),
       APRIL("April", 4),
       MAY("May", 5),
       JUNE("June", 6),
       JULY("July", 7),
       AUGUST("August", 8),
       SEPTEMBER("September", 9),
       OCTOBER("October", 10),
       NOVEMBER("November", 11),
       DECEMBER("December", 12);
       String nameOfMonth;
       int numOfMonth;
       MonthsOfYear(String nameOfMonth, int numOfMonth){
           this.nameOfMonth = nameOfMonth;
           this.numOfMonth = numOfMonth;
       }
       public int getNumOfMonth (){
           return numOfMonth;
       }
       public String getNameOfMonth (){
           return nameOfMonth;
       }
    }

    public String getMonthNameByNum (){
        String monthName;
        switch(numOfMonth){
            case 1:
                monthName = MonthsOfYear.JANUARY.getNameOfMonth();
                break;
            case 2:
                monthName = MonthsOfYear.FEBRUARY.getNameOfMonth();
                break;
            case 3:
                monthName = MonthsOfYear.MARCH.getNameOfMonth();
                break;
            case 4:
                monthName = MonthsOfYear.APRIL.getNameOfMonth();
                break;
            case 5:
                monthName = MonthsOfYear.MAY.getNameOfMonth();
                break;
            case 6:
                monthName = MonthsOfYear.JUNE.getNameOfMonth();
                break;
            case 7:
                monthName = MonthsOfYear.JULY.getNameOfMonth();
                break;
            case 8:
                monthName = MonthsOfYear.AUGUST.getNameOfMonth();
                break;
            case 9:
                monthName = MonthsOfYear.SEPTEMBER.getNameOfMonth();
                break;
            case 10:
                monthName = MonthsOfYear.OCTOBER.getNameOfMonth();
                break;
            case 11:
                monthName = MonthsOfYear.NOVEMBER.getNameOfMonth();
                break;
            case 12:
                monthName = MonthsOfYear.DECEMBER.getNameOfMonth();
                break;
            default:
                monthName = "There is no month under this number";
                break;
        }
        return monthName;
    }

}
