package pl.krakow.up.animalkingdom;

public class Seal extends Animal implements SeaCreature {
    Seal(int mass, String name, REGION region) {
        super(mass, name, "Seal", Animal.REGION.);
    }

    @Override
    public void swimming() {
        System.out.println("I love swimming.");
    }
}
