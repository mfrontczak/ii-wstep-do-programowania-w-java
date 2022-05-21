package pl.krakow.up.animalkingdom;

import java.util.ArrayList;

public class SeaKingdom<T extends SeaCreature, S extends Animal> extends AnimalKingdom<S>  {
    private ArrayList<T> animals;

    public SeaKingdom() {
        this.animals = new ArrayList<>();
    }

    @Override
    public void addAnimal(S a) {
        this.animals.add((T) a);
    }

    @Override
    public void showAnimals() {
        System.out.println("Morskie stworzonka: ");
        for(T a : this.animals) {
            System.out.println(a);
            a.swimming();
        }
    }
}
