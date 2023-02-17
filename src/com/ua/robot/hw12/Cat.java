package com.ua.robot.hw12;

public class Cat {
    private String name;
    private int age;
    private static int numberOfCats;
    private int initializationCatNumber = 0;

    static {
        System.out.println("This is my static block. Let's create cats!");
        numberOfCats = 0;
    }

    {
        name = "Kot";
        age = 1;
        System.out.println("Initialization number of cat: " + (++numberOfCats));
    }

    public Cat() {
        initializationCatNumber = numberOfCats;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        initializationCatNumber = numberOfCats;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getNumberOfCats() {
        return numberOfCats;
    }

    public int getInitializationCatNumber() {
        return initializationCatNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", initializationCatNumber = " + initializationCatNumber +
                '}';
    }
}

class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat1 + "\n" + cat2);
        System.out.println("Number of cats: " + Cat.getNumberOfCats());
        Cat cat3 = new Cat("Kiara", 5);
        Cat cat4 = new Cat("Bred Pitt", 9);
        System.out.println(cat3 + "\n" + cat4);
        System.out.println("Number of cats: " + Cat.getNumberOfCats());
    }

}
