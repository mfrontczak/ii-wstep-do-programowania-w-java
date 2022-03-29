# Laboratorium 5

## Typy generyczne
Typy generyczne pozwalają tworzyć nam szablony klas/metod bez wskazywania konkretnego typu danych.

Na przykład:

```java
public class PrintString {
    private String s;
    PrintString(String s) {
      this.s = s;
    }
    
    void print() {
      System.out.println(this.s);
    }
}
```

```java
public class PrintInteger {
    private Integer i;
    PrintInteger(Integer i) {
      this.i = i;
    }
    
    void print() {
      System.out.println(this.i);
    }
}
```

I tak dalej, moglibyśmy dla każdego typu podstawowego tworzyć kolejne klasy, powtarzając w kółko podobny kod.

Powyższe przykłady moglibyśmy zastąpić klasą generyczną która w diamentowym operatorze przyjmuje jako parametr typ danych jaki ma zostać użyty.

```java
public class Print<T> {
    private T t;
    Print(T t) {
      this.t = t;
    }
    
    void print() {
      System.out.println(this.t);
    }
}
```

Możliwe jest, również umieszczenie dodatkowych parametrów w diamentowym operatorze.

W tym przypadku przyjmuje się pewną regułe stosowaną przez wielu programistów.

Do Tworzenia typów generycznych używamy dużych liter:
* T - reprezentująca typ (Type)
* E - reprezentująca element kolekcji (Element)
* K, V - reprezentujących klucz (Key) i wartość (Value)
* S, U – w przypadku kiedy chcemy zastosować więcej typów danych.


```java
public class Print<T, V> {
    private T t;
    private V v;
    Print(T t, V v) {
      this.t = t;
      this.v = v;
    }
    
    void print() {
      System.out.println(this.t);
    }
    
    V getV() {
      return this.v;
    }
}
```

Klasa generyczna pozwala nam również na ograniczenie typu jaki może być przekazany jako parametr poprzez określenie interfejsu jaki powinien on implementować.

```java
interface Text {
  String getText();
}

class Book implements Text {
  private String text;
  Book(String t) {
    this.text = t;
  }
  
  String getText() {
    return this.text;
  }
}

public class Reader<T extends Text> {
    private T t;
    Reader(T t) {
      this.t = t;
    }
    
    void print() {
      System.out.println(this.t.getText());
    } 
}
```


