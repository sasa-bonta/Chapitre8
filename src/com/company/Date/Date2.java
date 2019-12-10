package com.company.Date;

public class Date2 {
    private int month; // 1-12
    private int day; // 1-31 based on month
    private int year; // any year
    private static final int[] daysPerMonth =
            { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public Date2(int month, int day, int year) {

        if (month <= 0 || month > 12)
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");

        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day +") out-of-range for the specified month and year");

        if (month == 2 && day == 29 && !(year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("day (" + day +") out-of-range for the specified month and year");
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

//    public void toString(Date2 date2) {
//        System.out.printf("%2d/%2d/%d%n",getDay() , getMonth(), getYear());
//    }


    public String toString()
    {
        return String.format("%2d/%2d/%d", getDay(), getMonth(), getYear());
    }

    public void nextDay() {
        setDay(getDay() + 1);
        if (getDay() <= 0 || (getDay() > daysPerMonth[month] && !(getMonth() == 2 && getDay() == 29))) {
            setMonth(getMonth() + 1);
            setDay(1);
        }
        if (getMonth() > 12) {
            setYear(getYear() + 1);
            setMonth(1);
        }

    }

    public void nextMonth() {
            setMonth(getMonth() + 1);
        if (getMonth() > 12) {
            setYear(getYear() + 1);
            setMonth(1);
        }
            setDay(1);
    }

    public void nextYear() {
            setYear(getYear() + 1);
            setMonth(1);
            setDay(1);
    }
}
