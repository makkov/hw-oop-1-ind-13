package com.hw.maxim;

public class Main {

    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Harry Potter", 100, 100, 100, 100, 100);
        Gryffindor hermioneGranger = new Gryffindor("Hermoine Granger", 85, 85, 68, 70, 30);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 85, 85, 90, 70, 90, 80, 100);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 50, 50, 50, 80, 50, 50, 50);

        harryPotter.compare(hermioneGranger);
        dracoMalfoy.compare(gregoryGoyle);

        harryPotter.compare(dracoMalfoy);
        harryPotter.compare(gregoryGoyle);
    }
}
