public class Example4 {
    static class Animal {
        static enum REGION {
            EUROPE,
            AFRICA,
            AMERICA,
            ASIA,
            SEA,
            OCEANIC
        }
        private int mass;
        private String name;
        private String kind;
        private REGION region;

        Animal(String name, String kind, int mass, REGION region) {
            this.mass = mass;
            this.name = name;
            this.kind = kind;
            this.region = region;
        }

        public int getMass() {
            return mass;
        }

        public void setMass(int newMass) {
            this.mass = newMass;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String newName) {
            this.name = newName;
        }

        public String getKind() {
            return this.kind;
        }

        public void setKind(String newKind) {
            this.kind = newKind;
        }

        public REGION getRegion() {
            return region;
        }

        public void setRegion(REGION newRegion) {
            this.region = newRegion;
        }

        public String toString() {
            return name + " waży " + mass + "kg i pochodzi z " + region;
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Maksio", "Pies", 50, Animal.REGION.OCEANIC);
        System.out.println(animal);
    }
}
