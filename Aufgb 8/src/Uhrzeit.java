/**
 * @author sfaniq2s
 */
public class Uhrzeit {
    private int stunde;
    private int minute;
    private static boolean is12h;
    //
    public Uhrzeit(){
        this.stunde = 0;
        this.minute = 00;
    }
    public  Uhrzeit(int s){
        this.stunde = s;
        this.minute = 00;
    }
    public Uhrzeit(int s,int m){
        this.stunde = s;
        this.minute = m;
    }
    public Uhrzeit(Uhrzeit Uhrzeit){
        this.stunde = Uhrzeit.stunde;
        this.minute = Uhrzeit.minute;
    }
    public int stunde(){
        return this.stunde;
    }
    public int minute(){
        return this.minute;
    }
    public boolean equals(Uhrzeit a){
        if(this.stunde == a.stunde & this.minute == a.minute){
            return true;
        }else{
            return false;
        }
    }
    public boolean istFrueher(Uhrzeit a){
        if(this.stunde < a.stunde){
            return true;
        }else if(this.stunde > a.stunde){
            return false;
        }
        if(this.minute < a.minute){
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        String a = Integer.toString(this.stunde);
        String b = Integer.toString(this.minute);
        String apm = "";
        if(is12h){
            if(this.stunde < 12 & this.stunde >= 0){
                apm += " a.m.";
            }else{
                a = Integer.toString(this.stunde % 12);
                apm += " p.m.";
            }
        }
        if(this.stunde < 10){
            a = "0" + a;
        }
        if(this.minute < 10){
            b = "0" + b;
        }
        return a + ":" + b + apm;
    }
    public static void set12h24h(){
            is12h = !is12h;
        }
}

