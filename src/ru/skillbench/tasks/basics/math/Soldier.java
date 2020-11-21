package ru.skillbench.tasks.basics.math;

public class Soldier extends Human {

    private Commander commander;

    public Soldier(int age, String name) {
        super(age, name);
    }

    @Override
    public void report() {
        System.out.println("I obey to " + commander.getName());
    }

    @Override
    public void fight() {
        System.out.println("I am ready to fight");
    }

    public Commander getCommander() {
        return commander;
    }

    public void setCommander(Commander commander) {
        this.commander = commander;
    }
}
