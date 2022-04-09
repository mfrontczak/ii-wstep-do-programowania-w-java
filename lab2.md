# Laboratorium 2


## Funkcje

### Metody statyczne
W metodach statycznych nie ma możliwości odwołania się do niestatycznych składowych klasy. 
Możliwe są wyłącznie odwołania do innych statycznych elementów klasy.

```java
public class Example1 {
  public static void main(String[] args) {
    // ...
  }
}
```

```java
public class Example2 {
  public static void main(String[] args) {
    // ...
    sayHello("Java");
  }
  
  static void sayHello(String name) {
    System.out.println("Hello " + name);
  }
}
```

### Metody klasy
```java
public class Example1 {
  public void sayHello(String name) {
    System.out.println("Hello " + name);
  }
}
```

```java
public class Example2 {
  public String makeText(String name) {
    return "Hello " + name;
  }
}
```

### Tworzenie klas
Przykład z wykorzystaniem statycznej klasy.
```java
public class Example1 {
    private static class MyApp {
        public void sayHello() {
            System.out.println("Hello there!");
        }
    }

    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.sayHello();
    }
}
```
Przykład klasy bez konstruktura.
```java
public class MyPoint {
    // składowe
    int x;
    int y;
}
```

Przykład klasy z konstruktorem.
```java
public class MyClass {
    // składowe
    String name;
    public MyClass() {}
    public MyClass(String name) {
        this.name = name;
    }
}
```

#### Hermetyzacja klasy
Hermetyzacja (enkapsulacja) polega na chowaniu (lub udostępnaniu) określonych składowych w danej klasie, 
tak aby były widoczne tylko wewnątrz klasy lub w klasie zaprzyjaśnionej.
```java
public class MyClass {
    // składowe
    private String name;
    public MyClass() {}
    public MyClass(String name) {
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
```

### Tworzenie tablic
Zaalokowanie pamięci:
```java
  int[] numbers = new int[7];
  char[] characters = new char[4];
```

Alokacja z przypisaniem wartości:
```java
  int[] numbers = {1,2,3,4,5,6,7};
  char[] characters = {'a', 'b', 'c', 'd'};
```

### Zadania

✏️ Znajdź informacje na temat hermetyzacji.

✏️ Stwórz metodę obliczającą równanie kwadratowe i zwracającą wynik.

✏️ Stwórz metodę wyświetlającą tablicę o wymiarach N x M.

✏️ Stwórz klasę Vehicle posiadającą atrybuty: `color`, `mileage`, `maxFuel`, `make`, `model`, `fuel`.

✏️ Dodaj do klasy Vehicle metodę `drive(int distance)`. Metoda powinna zmodyfikować odpowiednio wartość `mileage` oraz `fuel`.

✏️ Stwórz metodę wyświetlającą informacje o klasie Vehicle.

✏️ Stwórz metodę zwracającą czy dany punkt znajduje się w prostokącie - stwórz wszystkie potrzebne klasy i metody.

✏️+📧 Znajdź informację na temat mrówki Langtona i zaimplementuj odpowiednią klasę. (proszę wysłać do następnego zjazdu).
