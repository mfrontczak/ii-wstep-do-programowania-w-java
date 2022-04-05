package pl.krakow.up;

class Circle implements Figure, Movable {
    float r;
    int x = 0;
    int y = 0;

    Circle(float r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.r, 2);
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * this.r;
    }

    @Override
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
