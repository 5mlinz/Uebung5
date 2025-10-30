public final class RectShape extends Shape {
    private final Rectangle rect;

    public RectShape(Rectangle r) {
        if (r == null) throw new NullPointerException("rect");
        this.rect = r;
    }

    @Override
    public double area() {
        return rect.area();                // Delegation
    }

    @Override
    public double perimeter() {
        return rect.perimeter();           // Delegation
    }
}
