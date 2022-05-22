# Laboratorium 7

## Obsługa wyjątków
Wyjątek zostaje zgłoszony w programie na wskutek nieprzewidzianego błędu. 
Na szczęście istnieje mechanizm pozwalający nam na przechwycenie i obsługę wyjątków.

Przykład:
```java
try {
  // fragment kodu który może spowodować wywołanie wyjątku
} catch(TypWyjątku exc) {
  // obsługa wyjątku
}
```
Zmienna *exc* jest obiektem klasy wyjątku który udostępnia następujące metody:
```java
void printStackTrace()
String getMessage()
String toString()
Throwable getCause()
```

### Kontrola wyjątku
Możemy również poinformować, że dana metoda zwraca wyjątek, jednak nie jest on przechwytywany
i należy go przechwycić lub przekazać w innej parti kodu. Do tego celu używamy deklaracji `throws`.
```java
  ...
  throws Wyj1, Wyj2, ...
```

```java
  public static void main(String[] args) throws Exception {
   ...
 }
```

### Zgłaszanie wyjątku
W celu zgłoszenia wyjątku należy posłużyć się instrukcją `throw`. 
```java
  throw ExcRef; // ExcRef - referencja obiektu klasy wyjątku.
```
Przykład:
```java
  throw new NullPointerException("brak pointera :(");
``` 

### Tworzenie własnych wyjątków
W Javie możemy stworzyć własny wyjątek poprzez utworzenie klasy dziedziczącej po wyjątku który nas interesuje.

Przykład:
```java
public class NotEnoughRoomException extends Exception {
  public NotEnoughRoomException() { }
  public NotEnoughRoomException(String msg) {
    super(msg);
  }
}
```

### Zadania

✏️Uruchom a następnie napraw poniższy program poprzez dodanie obsługi wyjątków.
```java
public class DivideByZero {
  public static void main(String[] main) {
    int w = 0, a = 0, b = 0;
    w = a / b;
    System.out.println(w);
  }
```

✏️Uruchom a następnie napraw poniższy program poprzez dodanie obsługi wyjątków.
```java
public class InvalidParseValue {
  public static void main(String[] main) {
    System.out.println(Integer.parseInt("a"));
  }
```

✏️ Utwórz dowolną klasę, zaimplementuj metodę wywołująca wyjątek ogólny.

✏️ Utwórz dowolną klasę, zaimplementuj metodę przekazującą informację o wyjątkach które mogą się w niej zdarzyć ale nie są przechwytywane.

✏️ Znajdź listę potencjalnych wyjątków. 

✏️ Napisz program pozwalający na użytkownikowi na wprowadzanie liczb do Tablicy np. `int[]`. 
   Udostępnij użytkownikowi metodę w której poda wartość i indeks pod który ma zostać wpisana wartość.
   Dodaj obsługę błędu.
   
✏️ Utwórz klasę KontoBankowe:
   * klasa powinna przyjmować ile środków na koncie się znajduje.
   * klasa powinna implementować metody pozwalająca na dodanie lub wypłacenia środków z konta.
   * klasa powinna zgłaszać wyjątek jeżeli liczba środków na koncie jest niewystarczająca do wypłacenia ich. (Utwórz własny wyjątek)
   
✏️ Dodaj obsługę wyjątku do klasy KontoBankowe.

  
