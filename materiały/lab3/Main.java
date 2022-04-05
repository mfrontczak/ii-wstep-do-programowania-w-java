package pl.krakow.up;

public class Main {
    public static void main(String... args) {
       Figure f = new Circle(5.0f);
       Figure f2 = new Triangle(1, 2, 3, 2);

       System.out.println(
               "Pole powierzchni koła: " + f.getArea()
       );
       System.out.println(
               "Obwód koła: " + f.getCircumference()
       );

       System.out.println(
               "Pole powierzchni trójkąta: " + f2.getArea()
       );
       System.out.println(
               "Obwód trójkąta: " + f2.getCircumference()
       );


       if(f instanceof Circle) {
           System.out.println("f jest klasy koło");
       }

       if(f2 instanceof Triangle) {
           System.out.println("f2 jest klasy trójkąt");
       }

       Car c = new Car(
               "ford",
               "fiesta",
               "KR 12NMA",
               12334,
               47,
               32);

       System.out.println(c);

        Circle c = new Circle(10);
        Rectangle r = new Rectangle(5, 10);
        Triangle t = new Triangle(1,2,3, 1);

        Figure[] figures = {
            c, r, t
        };

        for(Figure figure : figures) {
            System.out.println(figure);
            System.out.println(figure.getArea());
            System.out.println(figure.getCircumference());
            Movable m = (Movable) figure;
            m.moveTo(1, 2);
        }

        for(int i = 0; i < figures.length; i++) {
            System.out.println(figures[i]);
        }
    }
}
