package ru.skillbench.tasks.basics.math;

public class General extends Human {

    public General(int age, String name) {
        super(age, name);
    }

    @Override
    public void report() {
        System.out.println("I am general!");
    }

    @Override
    public void fight() {
        System.out.println("I am ready to fight");
    }
}
