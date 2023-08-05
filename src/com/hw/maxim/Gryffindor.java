package com.hw.maxim;

public class Gryffindor extends Hogwarts {

    private int nobility;

    private int honor;

    private int courage;

    public Gryffindor(String name, int powerOfMagic, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    public int calculateSpecificScore() {
        return nobility + honor + courage;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                "} " + super.toString();
    }
}
