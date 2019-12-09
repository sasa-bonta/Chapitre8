package com.company.Rectangle;

public class Rectangle {
    private float lenght;
    private float width;

    //Constructor
    public Rectangle(float lenght, float width) {
        this.lenght = lenght;
        this.width = width;
    }

    public Rectangle() {
        this.lenght = 1.0f;
        this.width = 1.0f;
    }

    //Getter and setter
    public float getLenght() {
        return lenght;
    }

    public void setLenght(float lenght) {
        if (lenght > 0 && lenght < 20)
            this.lenght = lenght;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if (lenght > 0 && lenght < 20)
            this.width = width;
    }

    public float findPerimeter(Rectangle rectangle) {
        return 2 * (rectangle.getLenght() + rectangle.getWidth());
    }

    public float findAria(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getLenght();
    }
}
