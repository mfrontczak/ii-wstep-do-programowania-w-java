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

