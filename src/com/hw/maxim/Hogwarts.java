package com.hw.maxim;

public abstract class Hogwarts {

    private String name;

    private int powerOfMagic;

    private int transgressionDistance;

    public Hogwarts(String name, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    abstract public int calculateSpecificScore();

    public void compare(Hogwarts hogwarts) {
        //проверяем, что ученики учатся на одном факультете
        if (this.getClass().equals(hogwarts.getClass())) {
            compareSpecificScore(hogwarts);
        } else {
            compareGeneralScore(hogwarts);
        }
    }

    private void compareSpecificScore(Hogwarts hogwarts) {
        System.out.println("Сравнение учеников одного факультета:");
        int thisScore = this.calculateSpecificScore();
        int otherScore = hogwarts.calculateSpecificScore();

        if (thisScore > otherScore) {
            System.out.println(this.getName() + " сильнее чем " + hogwarts.getName());
        } else if (thisScore < otherScore) {
            System.out.println(hogwarts.getName() + " сильнее чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + hogwarts.getName() + " равны по силе");
        }
    }

    private void compareGeneralScore(Hogwarts hogwarts) {
        System.out.println("Сравнение учеников разных факультетов:");
        int thisScore = this.getPowerOfMagic() + this.getTransgressionDistance();
        int otherScore = hogwarts.getPowerOfMagic() + hogwarts.getTransgressionDistance();

        if (thisScore > otherScore) {
            System.out.println(this.getName() + " сильнее чем " + hogwarts.getName());
        } else if (thisScore < otherScore) {
            System.out.println(hogwarts.getName() + " сильнее чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + hogwarts.getName() + " равны по силе");
        }
    }

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
