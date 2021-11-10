package com.company;

public class Main {
    public static void main(String[] args) {
        Mobile apple = new Apple(new WhiteColor());
        apple.applyColor();

        Mobile samsung = new Samsung(new BlackColor());
        samsung.applyColor();
    }

}
