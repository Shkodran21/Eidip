public class Auto {
    private String fahrer; // Objekt Eigenschafft
    private String marke; // Objekt Eigenschaft
    private int anzahlMitFahrende; // Objekt Eigenschaft
    private boolean männlich; // Objekt Eigenschaft -> für den Fahrer in dem Fall

    public Auto(){ // Wenn ein Objekt ohne direkten Werte erzeugt wird -> Standard "Auto"
        this.fahrer = "Shkodran";
        this.marke = "bmw";
        this.anzahlMitFahrende = 4;
        this.männlich = true;
    }
    public Auto (String Fahrer){ // Wenn ein Objekt erzeugt wird und nur Fahrer als Wert gegeben ist -> Fahrer + Standard Auto
        this.fahrer = Fahrer;
        this.marke = "bmw";
        this.anzahlMitFahrende = 4;
    }
    public Auto (String Fahrer,String marke) { // Wenn ein Objekt erzeugt wird und Fahrer und marke als Wert gegeben ist -> Fahrer + marke + Standard Auto
        this.fahrer = Fahrer;
        this.marke = marke;
        this.anzahlMitFahrende = 4;
    }
    public Auto (String Fahrer,String marke,int anzahlMitFahrende) { // wird ein Auto mit individuellen Werten erzeugt
        if(anzahlMitFahrende > 4){
            throw new ArithmeticException("Auto ist ein 5sitzer also nur 4 mitfahrer!"); //wirft einen JavaFehler aus wenn zahl der mitfahrenden unlogisch bzw falsch ist
        }
        this.fahrer = Fahrer;
        this.marke = marke;
        this.anzahlMitFahrende = anzahlMitFahrende;
    }
    public Auto(Auto Auto1){ // Hier wird eine Auto referenz erstellt und als Objekt kopiert
        if(Auto1.anzahlMitFahrende > 4) {
            throw new ArithmeticException("Auto ist ein 5sitzer also nur 4 mitfahrer!"); //wirft einen JavaFehler aus wenn zahl der mitfahrenden unlogisch bzw falsch ist
        }
        this.fahrer = Auto1.fahrer;
        this.marke = Auto1.marke;
        this.anzahlMitFahrende = Auto1.anzahlMitFahrende;
    }
    public String fahrer(){ // gibt den Fahrer wieder
        return this.fahrer;
    }
    public String marke(){ // gibt die marke des Autos wieder
        return this.marke;
    }
    public int anzahlMitFahrende(){ // gibt die Anzahl der mitfahrenden weiter
        if(anzahlMitFahrende > 4) {
            throw new ArithmeticException("Auto ist ein 5sitzer also nur 4 mitfahrer!"); // wirft einen JavaFehler aus wenn zahl der mitfahrenden unlogisch bzw falsch ist
        }
        return this.anzahlMitFahrende;
    }
    public boolean istFahrerMännlich(){ // gibt zurück ob Fahrer Männlich ist
        if(männlich){
            return true;
        }else{
            return false;
        }
    }
    public Auto fahrerWechsel(String neuerFahrer){ // eine Methode die den Fahrer wechselt
        return new Auto(neuerFahrer,this.marke,this.anzahlMitFahrende);
    }
    public static boolean istFahrtSicher(Auto Auto2){ // Klassenmethode die Sicherheit der Fahrgelegenheit prüft
        if(Auto2.fahrer.equals("Shkodran")){
            System.out.println("Die Fahrt ist besonders sicher");
        }
        if(Auto2.istFahrerMännlich()){ // prüft ob fahrer Männlich ist
            return true;
        }else{
            return false;
        }
    }
    public int rauswerfen(int n) { // eine Methode die n viele Leute aus dem Auto wirft und die Anzahl der nach dem rauswerfen mitfahrenden wiedergibt
        if (this.anzahlMitFahrende - n < 0) {
            throw new ArithmeticException("es kann nicht negativ viele mitfahren"); // wirft einen JavaFehler wenn weniger als 0 mitfahren weil unlogisch
        } else {
            return this.anzahlMitFahrende = this.anzahlMitFahrende - n;
        }
    }
}

/**
 * Im Grunde erstellt man am Anfang eine Klasse und die werte die ein Objekt definieren
 * dann geht man die Fälle durch für falls ein Objekt ohne Werte oder nicht mit allen Werten erzeugt wird
 * dann die Methoden ( static Methoden = Klassenmethoden aber in diesen kann man nicht auf das allgemeine Objekt zugreifen also zB this.fahrer)
 * throw new ... ist eine selbstgemachte Fehlermeldung das wenn etwas logisch falsch ist aber es allgemein fürs Programm nicht falsch wäre
 * -> zB wenn man sagt Shkodran = weiblich das ist eig richtig aber logisch also für uns die wissen Shkodran = männlich falsch
 */