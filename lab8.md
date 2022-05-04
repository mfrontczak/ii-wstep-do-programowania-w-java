# Laboratorium 8

## Wyrażenia Lambda
Wyrażeniem lambda nazywamy funkcję która nie posiada nazwy, 
które są traktowane jak obiekt, można je przypisać do zmiennej lub przekazać jako argument do metody.

Przykład 1:
```java
 (n) -> n * n;
 ```
 
 Przykład 2:
 ```java
 public class Main {
    public static void main(String[] args) {
        List<String> streets = Arrays.asList("Podchorazych", "Podbrzezie", "Krolewska", "Karmelicka", "Studencka", "Ingardena");
        streets.forEach( street -> System.out.println("Uczelnia ma budynek przy ulicy " + street) );
    }
}
```
 
 Przykład 3:
 ```java
 public class Main {
    public static void main(String[] args) {
        List<String> streets = Arrays.asList("Podchorazych", "Podbrzezie", "Krolewska", "Karmelicka", "Studencka", "Ingardena");
        Collections.sort(streets, (String o1, String o2) -> o1.compareToIgnoreCase(o2));
    }
}
```
 
 Przykład 4:
 ```java
 public class Main {
    public static void main(String[] args) {
        List<String> streets = Arrays.asList("Podchorazych", "Podbrzezie", "Krolewska", "Karmelicka", "Studencka", "Ingardena");
        Collections.sort(streets, new Comparator<String>() {
  	        @Override
  	        public int compare(String o1, String o2) {
  		          return o1.compareToIgnoreCase(o2);
  	        }
        });
    }
}
```


## Klasy anonimowe
Dzięki zastosowaniu lambda-wyrażen możemy generować klasy anonimowe, czyli klasy w których w trakcie inicjalizacji nowego obiektu nadpisujemy jego metody.

Przykład 1:

```java
public interface Speak {
  void speak();
}
```

```java
public class Animal implements Speak {
    @Override
    public void speak() {
        System.out.println("????");
    }
}
```

```java
public class Main {
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
```

Interface można również wykorzystać do utworzenia klasy anonimowej która będzie go implementować.

Przykład:
```java
public class Main {
    public static void main(String[] args) {
      Speak s = () -> System.out.println("Speaking"); // w tym miejscu zostanie utworzony obiekt klasy anonimowej.
      s.speak();
    }
}
```

Niestety powyższy sposób działa jedynie w wypadku kiedy interfejs udostępnia jedną metodą. W celu zapewnienia, że nasz interfejs spełnia to wymaganie używamy dekoratora `@FunctionalInterface`.
  
 W javie istnieje już interfejs funkcyjny `Consumer` posiadający metodę `accept`. Przyjmuje ona jeden parametr oraz nie zwraca żadnej wartości.
 
 ```java
 @FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
```
  
 Przykład 1:
 ```java
 ...
     public static void main(String[] args) {
        Consumer<String> printEcho = (val) -> System.out.print(val + " " + val);
        
        printEcho.accept("Hello World");
        printEcho.accept("Echo, Echo!");
     }
 ...
 ```

Przykład 2:
```java
@FunctionalInterface
public interface Filter<V> {
    boolean test(V v);
}
```

Taki interfejs możemy użyć jako typ argumentu w innej metodzie.

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<String> strings = Arrays.asList("aaa", "bbb", "ccccc", "dddddd", "eeeeeee");

        List<Integer> filteredIntegers = matches(integers, (v) -> v % 2 == 0);
        List<String> filteredStrings = matches(strings, (v) -> v.length() > 3);

        System.out.println(filteredIntegers);
        System.out.println(filteredStrings);
    }

    public static <V> List<V> matches(List<V> values, Filter<V> f) {
        List<V> output = new ArrayList<>();
        for(V value : values) {
            if(f.test(value)) {
                output.add(value);
            }
        }
        return output;
    }
}
```



 ### Zadania
 
 ✏️ Utwórz interfejs Info z metodą describe, utwórz klasę Employee implementującą interfejs Info, a następnie napisz dla różnych obiektów metodę describe.
 
 ✏️ Utwórz klasę Fish posiadającą atrybut Color (enum) i name (String). Utwórz metodę search przyjmującą jako parametr listę obiektów dowolnego typu oraz interfejs Filter. Utwórz listę ryb z losowymi kolorami (utwórz enum z kolorami) a następnie znajdź wszystkie czerwone ryby.
 
 ✏️ Utwórz metodę order przyjmującą jako parametr listę obiektów dowolnego typu oraz interfejs Filter. Posortuj listę czerwonych ryb po imieniu, a listę wszystkich ryb po kolorze. 
 
 ✏️ Utwórz metodę update przyjmującą jako parametr listę obiektów dowolnego typu, interfejs Filter oraz interfejs Modifier. Interfejs Modifier powinien posiadać metodę modify nie zwracającą żadnej wartości. 
 
 ✏️ Wykorzystująca już z istniejącego interfejsu funkcyjnego `Predicate`, napisz metodę findAll wyszukującą w liście ryby o imieniu "Bogdan" lub kolorze żółtym.

