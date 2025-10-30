public final class Circle extends Shape {
    @SuppressWarnings("unused") // center not used
    private final Point2D center;
    private final double r;

    public Circle(Point2D c, double r) {
        if (c == null) throw new NullPointerException("center");
        if (r <= 0)  throw new IllegalArgumentException("r must be > 0");
        this.center = c;
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;           // π r²
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;           // 2πr
    }
}
