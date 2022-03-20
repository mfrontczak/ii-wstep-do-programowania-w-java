# Laboratorium 3

## Dziedziczenie

```java
public class Vector1D {
    int x;
}


public class Vector2D extends Vector1D {
    int y;
}


public class Vector3D extends Vector2D {
    int z;
}

public class Example {
    public static void main() {
        Vector3D v3 = new Vector3D();
        v3.x = 10;
        v3.y = 15;
        v3.z = -10;
    }
}
```

Do zainicjowania pól z klasy bazowej (nadklasy) wykorzystujemy 
```java
super(arg1, arg2, ...., argN);
```
Podana składnia wywoła konstruktor klasy bazowej, należy umieścić ją na samym początku wywołania konstruktora klasy pochodnej. 

Przykład z wywołaniem konstruktura klasy bazowej.

```java
public class Animal {
    String name = "brak";
    Animal(String name) {
        this.name = name;
    }
}

public class Dog extends Animal {
    String breed;
    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
}
```    

### Zadania

✏️ Stwórz klasę bazową `Vehicle` (ustal bazowe atrybuty i metody).

✏️ Stwórz klasę `Car` dziedziczącą po Vehicle.


### Wielodziedziczenie

Brak 😯. Problem ten jest posiada rozwiązanie w języku Java.

## Abstrakcyjne klasy i metody 
**Metoda abstrakcyjną** nie posiada implementacji, jest jedynie deklaracją metody.

```java
abstract float getArea(); 
```

Klasa z zdefiniowaną metodą abstrakcyjną, staje się klasą abstrakcyjną.
```java
abstract class Figure {
    abstract float getArea();
}
```

```java
class Circle extends Figure {
    float r;
    Circle(float r) {
        this.r = r;
    }

    float getArea() {
        return (float) (Math.PI * Math.pow(this.r, 2));
    }
}
```


### Zadania

✏️ Zaimplementuj klasę `Rectangle` i `Triangle` dziedziczącą po klasie `Figure`.

✏️ Dodaj nową abstrakcyjną metodę `getCircumference` i zaimplementuj ją dla wszystkich rodzajów figur. 

## Interfejsy

Interfejs służy do zdeklarowania publicznych metod i stałych abstrakcyjnych, w tym celu używamy słowa kluczowego `interface`.

Deklaracja:
```java
public interface Speakable {
    String LANGUAGE = "PL"; // <-> public final static String language = "PL";
    String saySomething(); // już jest to metoda publiczna i abstrakcyjna. 
}
```
Implementacja:
```java
public class Person implements Speakable {
    public String saySomething() {
        return "Hello";
    }
}
```

### Zadania

✏️ Zamień klasę abstrakcyjną `Figure` na interfejs.

✏️ Zaimplementuj interfejs `Figure3D`, Zaimplementuj klasę `Rectangle3D`.

✏️ Zaproponuj i zdeklaruj interfejs `Moveable`, Utwórz nową klasę która będzie go implementować.

✏️ Stwórz tablicę figur a następnie po nich przeiteruj i wyświetl rozmiar każdej z figur.


