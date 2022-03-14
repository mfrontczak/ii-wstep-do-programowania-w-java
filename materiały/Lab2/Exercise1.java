package pl.krakow.up;

public class Exercise1 {
    static class Point {
        public int x;
        public int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class Figure {
        Point tl;
        Point tr;
        Point bl;
        Point br;

        Figure(Point tl, Point tr, Point bl, Point br) {
            this.tl = tl;
            this.tr = tr;
            this.bl = bl;
            this.br = br;
        }

        Boolean isFigureOverlaying(Figure other) {
            return ( pointInBoundries(this.tl, other) ||
                    pointInBoundries(this.tr, other) ||
                    pointInBoundries(this.bl, other) ||
                    pointInBoundries(this.br, other) );
        }

        static Boolean pointInBoundries(Point p, Figure other) {
            if (other.tl.x <= p.x && p.x <= other.tr.x) {
                if (other.bl.y <= p.y && p.y <= other.tr.y) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Figure f1 = new Figure(
                new Point(1, 4),
                new Point(4, 4),
                new Point(1, 2),
                new Point(4, 2)
        );

        Figure f2 = new Figure(
                new Point(1, 4),
                new Point(4, 4),
                new Point(1, 2),
                new Point(4, 2)
        );

        Boolean isOverlaying = f1.isFigureOverlaying(f2);
        System.out.println("Czy figury się pokrywają? " + isOverlaying);
    }
}