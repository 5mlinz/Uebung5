public abstract class Shape {
    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        // Zweck: „Name + Kennwerte“, z. B. "Circle(area=..., perimeter=...)"
        return getClass().getSimpleName()
               + "(area=" + area() + ", perimeter=" + perimeter() + ")";
    }
}
