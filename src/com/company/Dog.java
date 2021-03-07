package com.company;

public final class Dog extends Lion {
    private int hunger;

    public Dog(String name, Zoo zoo, Color color, int age, String food, int hunger) {
        super(name, zoo, color, age, food);
        this.hunger = hunger;
    }

    public int getHunger() {
        return hunger;
    }

//В классе 3-го уровня перезаписать один из методов родителя
    @Override
    public void makeNoise(int number, String voice) {
        super.makeNoise(number, voice);
        System.out.println("Умею только Гав Гав ");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Dog \n Hunger:" + getHunger();
    }
}