# Laboratorium 9

## GUI w Swingu

Swing jest zestawem narzędzi do tworzenia GUI w języku Java wydanym w roku 1997. 

Przykład 1:
https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/start/HelloWorldSwingProject/src/start/HelloWorldSwing.java

Swing w swojej bibliotece posiada szereg komponentów z których budujemy nasze GUI.

Listę komponentów oraz ich przykładowe zastosowanie można znaleźć pod adresem https://docs.oracle.com/javase/tutorial/uiswing/examples/components/index.html.


Przykład 2: Zbudowanie ramki
```java
import javax.swing.*;

public class GuiExample0 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(300, 300);

        frame.setLayout(null);

        frame.setVisible(true);
    }
}
```

Przykład 3: Dodanie komponentu JButton
```java
import javax.swing.*;

public class GuiExample1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton btn = new JButton("Click Me!");

        btn.setBounds(100, 10, 100, 40);

        frame.add(btn);

        frame.setSize(300, 300);

        frame.setLayout(null);

        frame.setVisible(true);
    }
}
```

Przykład 4: Dodanie akcji do JButton
```java
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiExample2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton btn = new JButton("Click Me!");

        btn.setBounds(100, 10, 100, 40);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello World!");
            }
        });

        frame.add(btn);

        frame.setSize(300, 300);

        frame.setLayout(null);

        frame.setVisible(true);
    }
}
```

Przykład 5: Akcja na przycisk zamknięcia ramki
```java
public class GuiExample3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton btn = new JButton("Click Me!");

        btn.setBounds(100, 10, 100, 40);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello World!");
            }
        });

        frame.add(btn);

        frame.setSize(300, 300);

        frame.setLayout(null);

        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // <---
    }
}
```

Przykład 6: Zastosowanie JLabel
```java
import javax.swing.*;

public class GuiExample4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel lbl = new JLabel("Nothing Special");

        lbl.setBounds(10, 120, 280, 30);
        lbl.setHorizontalAlignment(JLabel.CENTER);

        frame.add(lbl);

        frame.setSize(300, 300);

        frame.setLayout(null);

        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
```

Przykład 7: Pole tekstowe
```java
import javax.swing.*;

public class GuiExample5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        JTextField jt = new JTextField("");
        
        jt.setBounds(10, 60, 260, 20);
        frame.add(jt);
        
        frame.setSize(300, 300);

        frame.setLayout(null);

        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
```


Przykład 8: Wyświetlanie dialogu
```java
import javax.swing.*;

public class GuiExample6 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello World");
    }
}
```

## Zadania

 ✏️ Zmodyfikuj przykład aby korzystał z lambda-wyrażenia, zamiast klasy anonimowej. 
 
✏️ Dodaj ikonę do przycisku z przykładu.
 
✏️ Stwórz program w którym będą zliczane wciśnięcia przycisku. Aktualna wartość wciśnięć powinna pojawiać się w konsoli.
  
✏️ Stwórz prosty generator formuł matematycznych w Swingu. Dodaj odpowiednie przyciski z akcjami, formuła powinna wyświetlać się w oknie.
 
✏️ Stwórz program w którym użytkownik może wprowadzić swoje imię a następnie po przyciśnięciu przycisku zostanie ono wyświetlone w konsoli.
 
✏️ Stwórz program w którym użytkownik może wprowadzić swoje imię a następnie po przyciśnięciu przycisku zostanie wyświetlone okno dialogowe z "Witaj, " + imie.
 
✏️ Stwórz program który po przyciśnięciu przycisku będzie wyświetlał okno dialogowe ikoną informacyjną, obrazkiem (np. https://www.flaticon.com/free-icons/crab), oraz wiadomością do użytkownika. 

✏️ Znajdź jak stworzyć zakładki. Utwórz program który będzie posiadał dwie zakładki, pierwsza z nich pozwoli użytkownikowi na wybraniu pliku przy pomocy `JFileChooser`, a druga po wciśnięciu przycisku wyświetli jego zawartość.
