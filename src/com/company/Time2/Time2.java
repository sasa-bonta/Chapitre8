package com.company.Time2;

public class Time2 {

    private int secondsFromMidNight;

    public Time2(int hour) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        this.secondsFromMidNight = hour * 3600;
    }

    public Time2(int hour, int minutes) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if (minutes < 0 || minutes >= 60)
            throw new IllegalArgumentException("minutes must be 0-59");
        this.secondsFromMidNight = hour * 3600 + minutes * 60;
    }

    public  Time2(int hour, int minutes, int seconds) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if (minutes < 0 || minutes >= 60)
            throw new IllegalArgumentException("minutes must be 0-59");
        if (seconds < 0 || seconds >= 60)
            throw new IllegalArgumentException("seconds must be 0-59");
        this.secondsFromMidNight = hour * 3600 + minutes * 60 + seconds;
    }

    public Time2() {
        this.secondsFromMidNight = 0;
    }

    public Time2(Time2 time2){
        this.secondsFromMidNight = time2.getSecondsFromMidNight();
    }

//    public Time2(Time2 time) {
//        this(time.getHour(), time.getMinute(), time.getSecond());
//    }

    public void setSecondsFromMidNight(int secondsFromMidNight) {
        if (secondsFromMidNight < 0 || secondsFromMidNight >= 24 * 3600)
        throw new IllegalArgumentException("seconds since midnight must be 0-86'400");
        this.secondsFromMidNight = secondsFromMidNight / 3600;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        this.secondsFromMidNight = this.secondsFromMidNight - getHour() * 3600 + hour * 3600;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes >= 60)
            throw new IllegalArgumentException("minutes must be 0-59");
        this.secondsFromMidNight = this.secondsFromMidNight - getMinute() * 60 + minutes * 60;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds >= 60)
            throw new IllegalArgumentException("seconds must be 0-59");
        this.secondsFromMidNight = this.secondsFromMidNight - getSecond() + seconds;
    }

    public int getSecondsFromMidNight() {
        return secondsFromMidNight;
    }

    public int getHour() {
        return secondsFromMidNight / 3600;
    }

    public int getMinute() {
        return (secondsFromMidNight - 3600 * (secondsFromMidNight / 3600)) / 60;
    }
    // get second value

    public int getSecond() {
        return secondsFromMidNight % 60;
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
}