package com.company;

public enum TraficLight {
    GREEN(40),
    YELLOW(5),
    RED(45);

    private final int durationOfTheLight;

    TraficLight(int durationOfTheLight) {
        this.durationOfTheLight = durationOfTheLight;
    }

    public int getDurationOfTheLight() {
        return durationOfTheLight;
    }
}
