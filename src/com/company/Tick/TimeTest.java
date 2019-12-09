package com.company.Tick;

public class TimeTest {
    public static void main(String[] args) {
        //Time t1 = new Time(); // 00:00:00
        //Time t2 = new Time(2); // 02:00:00
        Time t3 = new Time(23, 58, 58); // 21:34:00
        Time t4 = new Time(12, 58, 42); // 12:25:42


        displayTime("t3: hour and minute specified; default second", t3);
        t3.tick();
        displayTime("t3: hour and minute specified; default second", t3);
        t3.tick();
        displayTime("t3: hour and minute specified; default second", t3);

        for (int i = 0; i < 59; i++){
            t3.tick();
        }
        displayTime("t3: hour and minute specified; default second", t3);

        t3.tick();
        displayTime("t3: hour and minute specified; default second", t3);


        displayTime("t4: hour and minute specified; default second", t4);
        t4.addMitute();
        t4.addMitute();
        displayTime("t4: hour and minute specified; default second", t4);
        t4.addHour();
        displayTime("t4: hour and minute specified; default second", t4);

    }
    // displays a Time2 object in 24-hour and 12-hour formats
    private static void displayTime(String header, Time t) {
        System.out.printf("%s%n%s%n", header, t.toUniversalString());
    }
} // end class Time2Test
