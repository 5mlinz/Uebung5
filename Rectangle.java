public final class Rectangle 
{
    private final Point2D bl; // bottom-left
    private final Point2D tr; // top-right

    public Rectangle(Point2D bl, Point2D tr) 
    {
        if (bl == null || tr == null)
            throw new NullPointerException("Ecken dürfen nicht null sein.");
        if (tr.getX() <= bl.getX() || tr.getY() <= bl.getY())
            throw new IllegalArgumentException("Ungültiges Rechteck: tr.x>bl.x und tr.y>bl.y erforderlich.");
        this.bl = bl;
        this.tr = tr;
    }

    public double width()  { return tr.getX() - bl.getX(); }
    public double height() { return tr.getY() - bl.getY(); }
    public double area()   { return width() * height(); }
    public double perimeter() { return 2 * (width() + height()); }

    /** Punkt-Test: Ränder eingeschlossen (>= und <=). */
    public boolean contains(Point2D p) 
    {
        if (p == null) return false;
        double x = p.getX(), y = p.getY();
        return x >= bl.getX() && x <= tr.getX()
            && y >= bl.getY() && y <= tr.getY();
    }

    /** Fabrikmethode aus Mittelpunkt + Breite/Höhe (w,h > 0). */
    public static Rectangle fromCenter(Point2D c, double w, double h) 
    {
        if (c == null) throw new NullPointerException("Mittelpunkt darf nicht null sein.");
        if (w <= 0 || h <= 0)
            throw new IllegalArgumentException("Breite und Höhe müssen > 0 sein.");
        double hw = w / 2.0, hh = h / 2.0;
        Point2D bl = new Point2D(c.getX() - hw, c.getY() - hh);
        Point2D tr = new Point2D(c.getX() + hw, c.getY() + hh);
        return new Rectangle(bl, tr); // validiert erneut
    }

    // (optional) Zugriff auf die Ecken und String-Darstellung
    public Point2D bottomLeft() { return bl; }
    public Point2D topRight()   { return tr; }

    @Override public String toString() 
    {
        return "Rectangle[bl=" + bl + ", tr=" + tr + "]";
    }
}