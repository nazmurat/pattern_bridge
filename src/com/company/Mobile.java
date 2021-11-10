package com.company;

public abstract class Mobile {
    //Composition - implementor
    protected Color color;

    //constructor with implementor as input argument
    public Mobile(Color c){
        this.color=c;
    }

    abstract public void applyColor();
}
