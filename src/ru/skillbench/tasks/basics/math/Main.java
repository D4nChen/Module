package ru.skillbench.tasks.basics.math;

public class Main {

    public static void main(String[] args) {
	Human [] Warbase = new Human[9];
	Warbase[0] = new Soldier(25, "Ivan");
	Warbase[1] = new Soldier(27, "Oleg");
	Warbase[2] = new Soldier(31, "Victor");
	Warbase[3] = new Soldier(25, "Evgen");
	Warbase[4] = new Soldier(25, "Kostya");
	Warbase[5] = new Soldier(25, "Danil");
	Warbase[6] = new Commander(21, "Lesha");
	Warbase[7] = new Commander(25, "Denis");
	Warbase[8] = new General(25, "Victor");

	Warbase[0].setCommander()
    }
}
