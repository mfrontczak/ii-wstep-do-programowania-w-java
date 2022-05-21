public class LambdaExample1 {
    public static void main(String[] args) {
        List<String> streets = Arrays.asList("Podchorazych",
                "Podbrzezie", "Krolewska", "Karmelicka",
                "Studencka", "Ingardena");
        streets.forEach(street -> System.out.println("Uczelnia ma budynek przy ulicy " + street));
    }
}