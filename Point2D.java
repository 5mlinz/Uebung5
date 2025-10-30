public final class Point2D {
    // --- Felder ---
    private final double x;
    private final double y;

    // --- Konstruktor ---
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // --- Methoden ---
    /** Berechnet die euklidische Distanz zu einem anderen Punkt p. */
    public double distanceTo(Point2D p) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /** Liefert einen neuen Punkt, der um (dx, dy) verschoben ist. */
    public Point2D translate(double dx, double dy) {
        return new Point2D(this.x + dx, this.y + dy);
    }

    /** Textdarstellung des Punktes */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // --- Getter (optional, da Felder privat sind) ---
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
