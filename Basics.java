public class Basics
{
    public static void main(String[] args)
    {
        //1.1
        byte fensterOffenAnzahl = 2;
        short anzahlLampen = 14;
        int verbrauchHeuteWh = 3260;
        long gesamtVerbrauchWh = 124875L;
        float temperaturInnen = 21.5f;
        double temperaturAussen = 16.73;
        char modusSymbol = 'h';
        boolean bewegungErkannt = true;
        String raumName = "Wohnzimmer";
        System.out.println("Aufgabe 1.1:\nfensterOffenAnzahl = " + fensterOffenAnzahl + "\n" +
            "anzahlLampen = " + anzahlLampen + "\n" +
            "verbrauchHeuteWh = " + verbrauchHeuteWh + "\n" +
            "gesamtVerbrauchWh = " + gesamtVerbrauchWh + "\n" + 
            "temperaturInnen = " + temperaturInnen + "\n" +
            "temperaturAussen = " + temperaturAussen + "\n" +
            "modusSymbol = " + modusSymbol + "\n" +
            "bewegungErkannt = " + bewegungErkannt + "\n" +
            "raumName = " + raumName + "\n");

        //1.2
        //a)
        double temperaturDifferenz = temperaturInnen - temperaturAussen;
        System.out.println("Aufgabe 1.2.a)\ntemperaturDifferenz betraegt " + temperaturDifferenz + " Grad.\n");
        //b)
        gesamtVerbrauchWh += verbrauchHeuteWh;
        System.out.println("Aufgabe 1.2.b)\nNeuer gesamtVerbrauchWh betraegt " + gesamtVerbrauchWh + " Wh.\n");

        //1.3
        //a)
        if(temperaturInnen > 22)
        {
            System.out.println("Aufgabe 1.3.a)\nDie Innenraumtemperatur liegt ueber 22°C\n");
        }
        else
        {
            System.out.println("Aufgabe 1.3.a)\nDie Innenraumtemperatur liegt NICHT ueber 22°C\n");
        }
        //b)
        if(temperaturAussen < temperaturInnen)
        {
            System.out.println("Aufgabe 1.3.b)\nAussentemperatur ist kleiner als die Innentemperatur\n");
        }
        else if (temperaturAussen == temperaturInnen)
        {
            System.out.println("Aufgabe 1.3.b\nAussen und Innentemperatur sind gleich\n");
        }
        else
        {
            System.out.println("Aufgabe 1.3.b\nAussentemperatur ist groeszer als die Innentemperatur\n");
        }

        //Aufgabe 1.4
        //a)
        if(temperaturInnen < 20 && !(fensterOffenAnzahl != 0))
        {
            System.out.println("Aufgabe 1.4.a)\nHeizung wird eingeschaltet\n");
        }
        else
        {
            System.out.println("Aufgabe 1.4.a)\nHeizung aus\n");
        }
        //b)
        int uhrzeit = 19;
        if(bewegungErkannt || uhrzeit > 18)
        {
            System.out.println("Aufgabe 1.4.b)\nLicht wird eingeschaltet\n");
        }
        else
        {
            System.out.println("Aufgabe 1.4.b)\nLicht aus\n");
        }

        //Aufgabe 1.5
        //a)
        String statusMeldung = "Raum: " + raumName + ", Innen: " + temperaturInnen + " °C, Außen: " + temperaturAussen + " °C";
        System.out.println("Aufgabe 1.5.a)\n" + statusMeldung);
        //b)
        String modusMeldung = modusSymbol + ": Heizung aktiv";
        System.out.println("Aufgabe 1.5.b)\n" + modusMeldung);

        //Aufgabe 2.1
        double gerundeteAussenTemperatur = MathUtils.roundTo(temperaturAussen, 1);
        //Grad angaben mit mehreren Nachkommastellen sind unueblich, meistens nennt man maximal eine Nachkommastelle.
        System.out.println("Aussentemperatur " + temperaturAussen + " gerundet auf eine Nachkommastelle wird zu: " + gerundeteAussenTemperatur);

        // keine ahnung wofuer man norm2 verwenden sollte, distanzberechnung zwischen Sensoren?

        // isLeapYear zum richtigen zaehlen des Gesamtverbrauchs
        int actualYear = 2025;
        if(MathUtils.isLeapYear(actualYear))
        {
            System.out.println("Dieses Jahr ist ein Schaltjahr");
        }
        else
        {
            System.out.println("Dieses Jahr ist kein Schaltjahr");
        }

        //Aufgabe 2.2
        //roundTo hat limitationen bei vielen Nachkommastellen, wegen den Rundungsfehlern von Gleitkommazahlen in binaerdarstellung
        //norm2 kp
        //isLeapYear kp

        //Aufgabe 2.3
        //static funktionen muessen keine Objekte erzeugen um aufgerufen zu werden.
        //ohne static muesste erst ein Objekt erzeugt werden mit MathUtils m = new MathUtils();

        //Aufgabe 3.
        //immutable bedeutet, dass nach der Erstellung eines Objekts, dessen Werte nicht mehr geaendert werden koennen.
        //Vorteile von immutable ist u.a. die Sicherheit, dass diese Objekte nicht mehr ausversehentlich geaendert werden.
        Point2D p1 = new Point2D(2.0, 3.0);
        Point2D p2 = p1.translate(1.0, -1.0); // neuer Punkt bei (3.0, 2.0)

        System.out.println("P1: " + p1);
        System.out.println("P2 (verschoben): " + p2);

        double dist = p1.distanceTo(p2);
        System.out.println("Abstand zwischen P1 und P2: " + dist);

        //Aufgabe 4.
        System.out.println("\nAufgabe 4:");

        Point2D c = new Point2D(2, 3);
        Rectangle r = Rectangle.fromCenter(c, 4, 2); // bl=(0,2), tr=(4,4)
        System.out.println(r.area());        // 8.0
        System.out.println(r.perimeter());   // 12.0
        System.out.println(r.contains(new Point2D(0, 3))); // true (Rand)

    }
}