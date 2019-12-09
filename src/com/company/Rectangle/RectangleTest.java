package com.company.Rectangle;

import com.company.Rectangle.Rectangle;

public class RectangleTest {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10f, 15f);
        Rectangle rectangle2 = new Rectangle();

        System.out.println(rectangle1.findPerimeter(rectangle1));
        System.out.println(rectangle1.findAria(rectangle1));

        System.out.println(rectangle2.findPerimeter(rectangle2));
        System.out.println(rectangle2.findAria(rectangle2));
    }
}
