package com.company;

public class Main {

    public static void main(String[] args) {
        Lion lion = new Lion("Король лев","Африка",Color.WHITE)

    }
}
//Основное

//b)  Создать иерархию из 3х классов (1й -> 2й -> 3й уровень иерархии), последний 3й класс сделать не наследуемым
//c)  Все поля классов должны быть приватными, одно из полей должно быть сложного типа созданного вами же (4й класс), одно из полей сделать сложного типа (enum)
//d)  В классах не должно быть setter-ов, только getter-ы и конструкторы
//e)  Добавить перегруженные методы (2-3 шт.) в класс 2-го уровня иерархии, один из них сделать неперезаписываемым
//f)  В классе 3-го уровня перезаписать один из методов родителя
//g)  В главном классе (Main) Создать объект класса 2-го уровня (objectA) и 2 объекта класса 3-го уровня (objectB, objectC), также распечатать все свойства объектов и вызвать перегруженные методы через каждый из экземпляров ваших объектов.
//На сообразительность
//h)  Написать метод в классе 3-го уровня который бы копировал некоторые свойства из себеподобного объекта
//i)  Затем скопировать несколько свойств из objectB в objectC и распечатать информацию по objectC