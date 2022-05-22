package pl.krakow.up.animalkingdom;

public class Main {
    public static void main(String[] args) {
        AnimalKingdom<Seal> sealsKingdom = new AnimalKingdom<>();

        sealsKingdom.addAnimal(
                new Seal(85, "Foka", Animal.REGION.OCEAN));

        sealsKingdom.showAnimals();
    }
}
