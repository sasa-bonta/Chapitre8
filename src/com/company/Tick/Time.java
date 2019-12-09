package com.company.Tick;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(0, 0, 0); // invoke constructor with three arguments
    }
    // Time2 constructor: hour supplied, minute and second defaulted to 0
    public Time(int hour) {
        this(hour, 0, 0); // invoke constructor with three arguments
    }
    // Time2 constructor: hour and minute supplied, second defaulted to 0
    public Time(int hour, int minute) {
        this(hour, minute, 0); // invoke constructor with three arguments
    }
    // Time2 constructor: hour, minute and second supplied
    public Time(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    // Time2 constructor: another Time2 object supplied
    public Time(Time time) {
// invoke constructor with three arguments
        this(time.getHour(), time.getMinute(), time.getSecond());
    }
    // Set Methods
// set a new time value using universal time;
// validate the data
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
// validate
    public void setHour(int hour) {
        if (hour < 0 || hour > 24)
        throw new IllegalArgumentException("hour must be 0-23");
        this.hour = hour;
    }

    // validate and set minute
    public void setMinute(int minute) {
        if (minute < 0 && minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        this.minute = minute;
    }

    // validate and set second
    public void setSecond(int second) {
        if (second < 0 && second > 60)
            throw new IllegalArgumentException("second must be 0-59");
        this.second = second;
    }

    // Get Methods
// get hour value
    public int getHour() {
        return hour;
    }
    // get minute value
    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

// convert to String in universal-time format (HH:MM:SS)

    public String toUniversalString() {
        return String.format(
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }


// convert to String in standard-time format (H:MM:SS AM or PM)

    public String toString() {
        return String.format("%d:%02d:%02d %s",
        ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
        getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

    public void tick() {
        setSecond(getSecond() + 1);
        if (second > 59) {
            setSecond(0);
            setMinute(getMinute() + 1);
        }
        if (getMinute() > 59) {
            setMinute(0);
            setHour(getHour() + 1);
        }
        if (getHour() > 23) {
            setHour(0);
        }
    }

    public void addMitute() {
        setMinute(getMinute() + 1);
        if (getMinute() > 59) {
            setMinute(0);
            setHour(getHour() + 1);
        }
        if (getHour() > 23) {
            setHour(0);
        }
    }

    public void addHour() {
        setHour(getHour() + 1);
        if (getHour() > 23) {
            setHour(0);
        }
    }
 } // end class Time2