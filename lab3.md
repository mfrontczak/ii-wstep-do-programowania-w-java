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

Przykład z wywołaniem konstruktura klasy bazowej.

```java
public class Animal {
    String name = "brak";
    Animal(String name) {
        this.name = name;
    }
}

public class Dog extends Aniaml {
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
Brak 😯

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
    Circle(r) {
        this.r = r;
    }
    
    float getArea() {
        return Math.PI * Math.pow(this.r);
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


