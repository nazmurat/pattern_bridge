package com.company;

public class Samsung extends Mobile{

    public Samsung(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Samsung filled with color ");
        color.applyColor();
    }

}
