public class AnonymousClassExample {
    public static void main(String[] args) {
        Animal a = new Animal();

        Animal dog = new Animal() {
            @Override
            public void speak() {
                System.out.println("Wooh!");
            }
        };

        Animal cat = new Animal() {
            @Override
            public void speak() {
                System.out.println("Meow!");
            }
        };

        a.speak();
        dog.speak();
        cat.speak();
    }
}