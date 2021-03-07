package com.company;

import java.util.zip.ZipEntry;

public class Lion extends Animal {
    private int age;
    private String food;

    public Lion(String name, Zoo zoo, Color color, int age, String food) {
        super(name, zoo, color);
        this.age = age;
        this.food = food;
    }

    public int getAge() {
        return age;
    }

    public String getFood() {
        return food;
    }

    //Добавить перегруженные методы (2-3 шт.) в класс 2-го уровня иерархии, один из них сделать неперезаписываемым

    public void makeNoise(int number, String voice) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }

    public final void makeNoise(String voice) {
        System.out.println(voice);
    }

    public void makeNoise(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }


    public String getInfo() {
        return super.getInfo() + "\nAge =" + age + "\nFood" + food;
    }
    // Через метод getInfo получаем
    //Возвращаемое значение: этот метод возвращает описание поставщика и его услуг.

}