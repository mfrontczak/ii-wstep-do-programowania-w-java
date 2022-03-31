# Laboratorium 4

## Kolekcje danych
Java udostępnia gotową bibliotekę (Java Collections Framework - JCF) implementującą wybrane abstrakcyjne struktury danych.

### Kolekcje
Java udostępnia interfejs który określa wymagane metody które następnie są implementowane przez odpowiednie klasy.

#### List i Queue

Dostępne implementacje dla list: `ArrayList`, `LinkedList`.

Dostępne implementacje dla kolejek: `LinkedList`, `ArrayDeque`, `PriorityQueue`.

##### Zadania

✏️ Utwórz `ArrayList` z 1 000 000 losowych liczb. Zanotuj czas tworzenia listy.

✏️ Utwórz `LinkedList` z 1 000 000 losowych liczb. Zanotuj czas tworzenia listy.

✏️ Porównaj czas dostępu do dowolnego elementu w obu listach.

✏️ Porównaj czas usuwania dowolnego elementu w obu listach.

✏️ Porównaj czas sprawdzenia czy dany element znajduje się w liście dla obu list.

✏️ Wykonaj ponownie porównanie z klasą `Vector`.

#### Set i Map

Dostępne implementacje dla zbiorów: `HashSet`, `TreeSet`, `LinkedHashSet`.

Dostępne implementacje dla map: `HashMap`, `TreeMap`, `LinkedHashMap`.

##### Zadania

✏️ Utwórz `HashSet` z 1 000 000 losowych liczb. Zanotuj czas tworzenia zbioru.

✏️ Utwórz `TreeSet` z 1 000 000 losowych liczb. Zanotuj czas tworzenia zbioru.

✏️ Porównaj czas dostępu do dowolnego elementu w obu zbiorach.

✏️ Porównaj czas usuwania dowolnego elementu w obu zbiorach.

✏️ Porównaj czas sprawdzenia czy dany element znajduje się w zbiorze dla obu zbiorów.


#### Iterator
Iterator jest obiektem klasy Iterator służącym do wykonywania iteracji na zbiorach danych oraz operacji na danym elemencie. 

```java
Iterator<T> iter = c.iterator();

ListIterator<T> listIter = l.listIterator();
```

gdzie:

T - typ elementu kolekcji.

c - obiekt klasy implementującej interfejs `Collection`.

l - obiekt klasy implementującej interfejs `List`.

### Zadania

✏️ Utwórz tablicę dwu wymiarową (np. o wymiarach 3x3), zaimplementuj metodę wyświetlającą jej elementy w formie tabeli.

✏️ Wczytaj plik do rożnych implementacji zbiorów i wyświetl je na ekranie.

✏️ Zbuduj histogram z tekstu (https://www.gutenberg.org/cache/epub/67098/pg67098.txt lub dowolnego innego).

✏️ Znajdź różnicę między `iterator`'em a `listIterator`'em.

✏️ Przeiteruj po dowolnej liście.

✏️ Korzystając z iteratora usuń z listy co drugi element.

✏️ Utwórz obiekt ArrayList wraz z zdeklarowanymi wartościami (Poszukaj o `Arrays.asList(...)`)

✏️ Zaimplementuj metodę przyjmującą dowolną listę i wyświetlającą jej elementy na ekranie.
