package org.example;

public class DateOneTest {

    public static void main(String[] args) {

        DateOne date = new DateOne();
        date.day = 16;
        date.month = 10;
        date.year = 2011;

        System.out.println("Date: " + date.day + "/" + date.month + "/" + date.year);

    }

}
