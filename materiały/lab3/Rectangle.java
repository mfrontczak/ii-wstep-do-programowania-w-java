package pl.krakow.up;

public class Rectangle implements Figure, Movable {
    int a;
    int b;
    int x = 0;
    int y = 0;

    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double getArea() {
        return this.a * this.b;
    }

    @Override
    public double getCircumference() {
        return 2 * (this.a + this.b);
    }

    @Override
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
