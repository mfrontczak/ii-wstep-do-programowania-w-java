public class LambdaExample2 {
    public static void main(String[] args) {
        List<String> streets = Arrays.asList("Podchorazych",
                "Podbrzezie", "Krolewska", "Karmelicka",
                "Studencka", "Ingardena");
        Collections.sort(streets, (String o1, String o2) -> o1.compareToIgnoreCase(o2));
    }
}