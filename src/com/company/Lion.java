package com.company;

public class Lion extends Animal {
    private int age;
    private String food;

    public Lion(String name, Zoo zoo, Color color, int age, String food) {
        super(name, zoo, color);
        this.age = age;
        this.food = food;
    }

    public Lion(String король_лев, String африка, Color white) {
        super();
    }

    public int getAge() {
        return age;
    }

    public String getFood() {
        return food;
    }

    public void makeNoise(int number, String voice) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);

        }
    }

    public final void makeVoice(String voice) {
        System.out.println(voice);
    }
    public String getInfo(){
        return super.getInfo()+"\nAge =" + age + "\nFood" + food;
    }

}