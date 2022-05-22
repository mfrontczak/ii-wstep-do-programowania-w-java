package pl.krakow.up.animalkingdom;

public class Main {
    public static void main(String[] args) {
        AnimalKingdom<Seal> sealsKingdom = new AnimalKingdom<>();

        aquaManAnimalKingdom.addAnimal(
                new Seal(85, "Foka", Animal.REGION.OCEAN));

        aquaManAnimalKingdom.showAnimals();
    }
}
