package pl.krakow.up;

public class Triangle implements Figure, Movable {
    int a;
    int b;
    int c;
    int h;
    int x = 0;
    int y = 0;

    public Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double getArea() {
        return (this.a * this.h) / 2.0;
    }

    @Override
    public double getCircumference() {
        return this.a + this.b + this.c;
    }

    @Override
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", h=" + h +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
