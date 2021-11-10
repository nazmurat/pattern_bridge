package com.company;
public class Apple extends Mobile{

    public Apple(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Apple filled with color ");
        color.applyColor();
    }

}