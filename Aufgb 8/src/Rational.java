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
        int ggt = Mathe.ggT(zähler,nenner);
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
}
