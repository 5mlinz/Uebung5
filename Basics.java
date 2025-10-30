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
    }
}