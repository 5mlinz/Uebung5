public class MathUtils
{
    /** Rundet x auf n Nachiommastellen. n>=0.  */
    public static double roundTo(double x, int n)
    {
        // verschiebe das Komma n Stellen nach rechts
        double faktor = Math.pow(10, n);
        // runde auf Ganzzahl und verschiebe Komma n Stellen nach links
        return Math.round(x * faktor) / faktor;
    }

    /** Euklidische Norm sqrt(x^2+y^2). */
    public static double norm2(double x, double y)
    {
        double euklidNorm = Math.sqrt(x * x + y * y);
        return euklidNorm;
    }

    /** true, falls year ein Schaltjahr ist (Gregorianisch). */
    public static boolean isLeapYear(int year)
    {
        // Schaltjahr wenn durch 4 teilbar, aber nicht durch 100, auszer es ist auch durch 400 teilbar
        return (year > 0 && year % 4 == 0 && (!(year % 100 == 0) || year % 400 == 0));
    }
}