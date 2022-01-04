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
    }
    public Datum(int Jahr,int Monat){
        this.Jahr = Jahr;
        this.Monat = Monat;
        this.Tag = 1;
    }
    public Datum(int Jahr,int Monat,int Tag){
        this.Jahr = Jahr;
        this.Monat = Monat;
        this.Tag = Tag;
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
        if(this.reihe == "tmj"){
            if(this.Monat < 10 & this.Tag < 10){
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
            if(this.Monat < 10 & this.Tag < 10){
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
            if(this.Monat < 10 & this.Tag < 10){
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
}