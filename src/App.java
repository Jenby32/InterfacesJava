public class App {
    public static void main(String[] args) throws Exception {
        // Erstelle Schaf Objekt
        Schaf schaf1 = new Schaf(20, 100, 30, 50, false, false, "Ist ein Schaf.");
        // Erstelle Objekt der Transportklasse um die Funktion -> transportMachbar zu benutzen
        Transport transport1 = new Transport();

        // Hier rufen wir die Funktion trannsportMachbar von dem Transport objekt auf und übergeben der Funktion das Schaf objekt
        System.out.println(transport1.transportMachbar(schaf1));
    }
}
