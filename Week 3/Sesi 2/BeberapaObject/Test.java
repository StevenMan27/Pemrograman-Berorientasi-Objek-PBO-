/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BeberapaObject;

/**
 *
 * @author Steven
 */
class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class Test {

    public static void main(String[] args) {

        Animal obj = new Dog();

        System.out.println("Object pertama: "
                + obj.getClass().getSimpleName());

        obj = new Cat();

        System.out.println("Object kedua: "
                + obj.getClass().getSimpleName());
    }
}