package com.company.Tick;

public class TimeTest {
    public static void main(String[] args) {
        Time t1 = new Time(); // 00:00:00
        Time t2 = new Time(2); // 02:00:00
        Time t3 = new Time(23, 58, 58); // 21:34:00
        Time t4 = new Time(12, 25, 42); // 12:25:42
        Time t5 = new Time(t4); // 12:25:42
//        System.out.println("Constructed with:");
//        displayTime("t1: all default arguments", t1);
//        displayTime("t2: hour specified; default minute and second", t2);
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

//        displayTime("t4: hour, minute and second specified", t4);
//        displayTime("t5: Time2 object t4 specified", t5);

// attempt to initialize t6 with invalid values
        try

        {
            com.company.Time2.Time2 t6 = new com.company.Time2.Time2(27, 74, 85); // invalid values
        }
        catch(
                IllegalArgumentException e)

        {
            System.out.printf("%nException while initializing t6: %s%n",
                    e.getMessage());
        }

    }
    // displays a Time2 object in 24-hour and 12-hour formats
    private static void displayTime(String header, Time t) {
        System.out.printf("%s%n%s%n", header, t.toUniversalString());
    }
} // end class Time2Test
