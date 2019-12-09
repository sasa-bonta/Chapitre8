package com.company.Date;

import java.util.Date;

public class DateTest {

    public static void main(String[] args) {
        Date2 date1 = new Date2(12, 29, 1999);

        System.out.println(date1.toString());

        for (int i = 0; i < 100; i++) {
            date1.nextDay();
            System.out.println(date1.toString());
        }
    }
}
