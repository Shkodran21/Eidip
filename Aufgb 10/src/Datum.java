/**
 * @author sfaniq2s
 */
public class Datum {
    private int Jahr;
    private int Monat;
    private int Tag;
    private static String reihe = "jmt";
    private static char zeichen = '-';
    public Datum(){
        this.Jahr = 1;
        this.Monat = 1;
        this.Tag = 1;
    }
    public Datum(int Jahr){
        this.Jahr = Jahr;
        this.Monat = 1;
        this.Tag = 1;
        if(Jahr < 0){
            throw new IllegalArgumentException("ungueltiger Wert fuer Jahr: " + Jahr );
        }
    }
    public Datum(int Jahr,int Monat){
        this.Jahr = Jahr;
        this.Monat = Monat;
        this.Tag = 1;
        if(Jahr < 0){
            throw new IllegalArgumentException("ungueltiger Wert fuer Jahr: " + Jahr);
        }
        if(Monat < 1 | Monat > 12){
            throw new IllegalArgumentException("ungueltiger Wert fuer Monat: " + Monat);
        }
    }
    public Datum(int Jahr,int Monat,int Tag){
        this.Jahr = Jahr;
        this.Monat = Monat;
        this.Tag = Tag;
        if(Jahr < 0){
            throw new IllegalArgumentException("ungueltiger Wert fuer Jahr: " + Jahr);
        }
        if(Monat < 1 | Monat > 12){
            throw new IllegalArgumentException("ungueltiger Wert fuer Monat: " + Monat);
        }
        if(Tag > tageInMonat(Jahr,Monat) | Tag < 1){
            throw new IllegalArgumentException("ungueltiger Wert fuer Tag: " + Tag);
        }
    }
    public Datum(Datum Datum){
        this.Jahr = Datum.Jahr;
        this.Monat = Datum.Monat;
        this.Tag = Datum.Tag;
    }
    public int jahr(){
        return this.Jahr;
    }
    public int monat(){
        return this.Monat;
    }
    public int tag(){
        return this.Tag;
    }
    public boolean equals(Datum Datum){
        if( this.Jahr == Datum.Jahr & this.Monat == Datum.Monat & this.Tag == Datum.Tag){
            return true;
        }else{
            return false;
        }
    }
    public boolean istFrueher(Datum Datum){
        if(this.Jahr < Datum.Jahr){
            return true;
        }if( this.Jahr > Datum.Jahr) {
            return false;
        }else if(this.Monat < Datum.Monat){
            return true;
        }if (this.Monat > Datum.Monat){
            return false;
        } else if( this.Tag < Datum.Tag){
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        String a = Integer.toString(Jahr);
        String b = Integer.toString(Monat);
        String c = Integer.toString(Tag);
        if(this.reihe == "tmj") {
            if(zeichen == '0'){
                b = monatFuerName(Monat);
                return c + ". " + b + " " + a;
            }else if(this.Monat < 10 & this.Tag < 10){
                return "0" + c + zeichen + "0" + b + zeichen + a;
            }
            if(this.Monat < 10 & this.Tag > 9){
                return c + zeichen + "0" + b + zeichen + a;
            }
            if(this.Monat > 9 & this.Tag < 10){
                return "0" + c + zeichen + b + zeichen + a;
            }else{
                return c + zeichen + b + zeichen + a;
            }
        }
        else if(this.reihe == "mtj"){
            if(zeichen == '0') {
                b = monatFuerName(Monat);
                return b + " " + c + ". " + a;
            }else if(this.Monat < 10 & this.Tag < 10){
                return "0" + b + zeichen + c + zeichen + "0" + a;
            }
            if(this.Monat < 10 & this.Tag > 9){
                return "0" + b + zeichen + c + zeichen + a;
            }
            if(this.Monat > 9 & this.Tag < 10){
                return b + zeichen + "0" + c + zeichen + a;
            }else{
                return b + zeichen + c + zeichen + a;
            }
        }else if(this.reihe == "jmt"){
            if(zeichen == '0') {
                b = monatFuerName(Monat);
                return a + " " + b + " " + c + ".";
            }else if(this.Monat < 10 & this.Tag < 10){
                return a + zeichen + "0" + b + zeichen + "0" + c;
            }
            if(this.Monat < 10 & this.Tag > 9){
                return a + zeichen + "0" + b + zeichen + c;
            }
            if(this.Monat > 9 & this.Tag < 10){
                return a + zeichen + b + zeichen + "0" + c;
            }else{
                return a + zeichen + b + zeichen + c;
            }
        }
        return "";
    }
    public static void setFormatRF(String s){
        if(s.equals("") | s != "jmt" & s != "tmj" & s != "mtj"){
            throw new IllegalArgumentException("ungueltiger Wert fuer Format-Reihenfolge: " +'\"' + s + '\"');
        }
        if(s.equals("jmt")){
            reihe = "jmt";
        }
        if(s.equals("tmj")){
            reihe = "tmj";
        }if(s.equals("mtj")){
            reihe = "mtj";
        }
    }
    public static void setFormatTZ(char Zeichen){
        zeichen = Zeichen;
    }
    public static String monatFuerName(int n){
        switch(n){
            case 1:
                return "Januar";
            case 2:
                return "Februar";
            case 3:
                return "Maerz";
            case 4:
                return "April";
            case 5:
                return "Mai";
            case 6:
                return "Juni";
            case 7:
                return "Juli";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "Oktober";
            case 11:
                return "November";
            case 12:
                return "Dezember";
        }
        return "";
    }
    public static int nameFuerMonat(String n){
        switch(n){
            case "Januar":
                return 1;
            case "Februar":
                return 2;
            case "Maerz":
                return 3;
            case "April":
                return 4;
            case "Mai":
                return 5;
            case "Juni":
                return 6;
            case "Juli":
                return 7;
            case "August":
                return 8;
            case "September":
                return 9;
            case "Oktober":
                return 10;
            case "November":
                return 11;
            case "Dezember":
                return 12;
        }
        return 0;
    }
    public static boolean istSchaltjahr(int Datum) {
        if(Datum <= 0) {
            throw new IllegalArgumentException("ungueltiger Wert fuer Jahr: " + Datum);
        }
        if (Datum < 1583) {
            if (Datum % 4 == 0 & Datum > 0) {
                return true;
            } else {
                return false;
            }
        } else {
            if (Datum % 4 == 0 & (Datum % 100 > 0 | (Datum % 100 == 0 & Datum % 400 == 0))) {
                return true;
            } else {
                return false;
            }
        }
    }
    public static int tageInMonat(int jahr, int monat) {
        if(monat < 1 | monat > 12){
            throw new IllegalArgumentException("ungueltiger Wert fuer Monat: " + monat);
        }
        if (!istSchaltjahr(jahr)) {
            switch (monat) {
                case 2:
                    return 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return 31;
            }
        }
        if (istSchaltjahr(jahr)) {
            switch (monat) {
                case 2:
                    return 29;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return 31;
            }
        }
        return 0;
    }
}