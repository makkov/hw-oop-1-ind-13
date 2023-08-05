package com.hw.maxim;

public class Hufflepuff extends Hogwarts {

    private int diligence;

    private int loyalty;

    private int honor;

    public Hufflepuff(String name, int powerOfMagic, int transgressionDistance, int diligence, int loyalty, int honor) {
        super(name, powerOfMagic, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honor = honor;
    }

    @Override
    public int calculateSpecificScore() {
        return diligence + loyalty + honor;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honor=" + honor +
                "} " + super.toString();
    }
}
