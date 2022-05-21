package pl.krakow.up.animalkingdom;

public class Animal {
    enum REGION {
        EUROPE,
        AFRICA,
        ASIA,
        AMERICA,
        OCEAN
    }
    private int mass;
    private String name;
    private String kind;
    private REGION region;

    Animal(int mass, String name, String kind, REGION region) {
        this.mass = mass;
        this.name = name;
        this.kind = kind;
        this.region = region;
    }

    public REGION getRegion() {
        return region;
    }

    public void setRegion(REGION region) {
        this.region = region;
    }

    public void setMass(int mass) {
        this.animalIsFat(mass);
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    private void animalIsFat(int mass) {
        if(mass > 10) {
            System.out.println("Uważaj, Twój " + kind + " jest za gruby.");
        }
    }

    public String toString() {
        return kind + " ma na imię " + name +
                " waży " + mass + "kg i pochodzi z " + region;
    }
}
