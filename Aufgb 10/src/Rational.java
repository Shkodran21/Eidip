/**
 * @author sfaniq2s
 */
public class Rational {
    private int zähler;
    private int nenner;
    public Rational(){
        this.zähler = 0;
        this.nenner = 1;
    }
    public Rational(int zähler){
        this.zähler = zähler;
        this.nenner = 1;
    }
    public Rational(int zähler,int nenner){
        if(nenner == 0){
            throw new ArithmeticException("ungültiger Bruch mit 0 im Nenner");
        }
        int ggt = Mathe2.ggT(zähler,nenner);
        this.zähler = zähler / ggt;
        this.nenner = nenner / ggt;
        if(nenner < 0){
            this.nenner = Math.abs(this.nenner);
            this.zähler = this.zähler * -1;
        }
    }
    public Rational(Rational Rational){
        this.zähler = Rational.zähler;
        this.nenner = Rational.nenner;
    }
    public int zaehler(){
        return this.zähler;
    }
    public int nenner(){
        return this.nenner;
    }
    public boolean equals(Rational Rational){
        if(this.zähler == Rational.zähler & this.nenner == Rational.nenner){
            return true;
        }else{
            return false;
        }
    }
    public boolean istKleiner(Rational Rational){
        int zähler1 = this.zähler * Rational.nenner;
        int nenner1 = this.nenner * Rational.nenner;
        int zähler2 = Rational.zähler * this.nenner;
        int nenner2 = Rational.nenner * this.nenner;
        if(zähler1 < zähler2){
            return true;
        }
        if(zähler1 > zähler2){
            return false;
        }
        else if(nenner1 < nenner2){
            return true;
        }else{
            return false;
        }
    }
    public Rational abs(){
        return new Rational(Math.abs(this.zähler),this.nenner());
    }
    public Rational rez(){
        return new Rational(this.nenner,this.zähler);
    }
    public Rational add(Rational Rational){
        return new Rational(this.zähler * Rational.nenner + Rational.zähler * this.nenner,this.nenner * Rational.nenner);
    }
    public Rational sub(Rational Rational){
        return new Rational(this.zähler * Rational.nenner - Rational.zähler * this.nenner,this.nenner * Rational.nenner);
    }
    public Rational mul(Rational Rational){
        return new Rational(this.zähler * Rational.zähler,this.nenner * Rational.nenner);
    }
    public Rational div(Rational Rational){
        return new Rational(this.zähler * Rational.nenner,this.nenner * Rational.zähler);
    }
    public String toString(){
        String zähler = Integer.toString(this.zähler);
        String nenner = Integer.toString(this.nenner);
        return zähler + "/" + nenner;
    }
    public static Rational parse(String n){
        String zähler = "";
        String nenner = "";
        int s = 0;
        for(int i = 0;i < n.length();i++){
            if('/' == n.charAt(i)){
                s = i;
                i = n.length()-1;
            }
            zähler += n.charAt(i);
        }
        nenner = n.substring(s+1,n.length());
        int zähler2 = Integer.valueOf(zähler.substring(0,zähler.length()-1));
        int nenner2 = Integer.valueOf(nenner);
        if(nenner2 == 0){
            throw new ArithmeticException("ungültiger Bruch mit 0 im Nenner");
        }
        Rational Bruch = new Rational(zähler2,nenner2);
        return Bruch;
    }
}
