package ru.skillbench.tasks.basics.math;

public class Commander extends Human{

    private General general;

    public Commander(int age, String name) {
        super(age, name);
    }

    @Override
    public void setCommander(Human human) {
        this.general = human;
    }

    @Override
    public void report() {
        System.out.println("I obey to " + general.getName());
    }

    @Override
    public void fight() {
        System.out.println("I am ready to fight");
    }

    public General getGeneral() {
        return general;
    }

    public void setGeneral(General general) {
        this.general = general;
    }
}
