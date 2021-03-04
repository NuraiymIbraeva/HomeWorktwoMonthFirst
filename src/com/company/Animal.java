package com.company;

public class Animal {

    private String name;
    private Zoo zoo;
    private Color color;


    public Animal(String name, Zoo zoo, Color color) {
        this.name = name;
        this.zoo = zoo;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public Color getColor() {
        return color;
    }
    public String getInfo(){
        return "Name"+name+"\nZoo" + zoo + " \nColor"+ color;
    }
}
