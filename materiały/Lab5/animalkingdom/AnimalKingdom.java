package pl.krakow.up.animalkingdom;

import java.util.ArrayList;

public class AnimalKingdom <T extends Animal> {
    private ArrayList<T> animals;

    public AnimalKingdom() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(T a) {
        this.animals.add(a);
    }

    public void showAnimals() {
        for(T a : this.animals) {
            System.out.println(a);
        }
    }
}
