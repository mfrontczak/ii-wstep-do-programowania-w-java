public class LambdaExample3 {
    public static void main(String[] args) {
        List<String> streets = Arrays.asList("Podchorazych", "Podbrzezie",
                "Krolewska", "Karmelicka", "Studencka", "Ingardena");
        Collections.sort(streets, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
    }
}