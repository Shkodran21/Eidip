/**
 * @author sfaniq2s
 */
public class RechteckXYPerEcke {
    private Punkt2D links;
    private Punkt2D rechts;
    public RechteckXYPerEcke(double linksX,double rechtsX,double linksY,double rechtsY){
        this.links = new Punkt2D(linksX,linksY);
        this.rechts = new Punkt2D(rechtsX,rechtsY);
    }
    public RechteckXYPerEcke(Punkt2D links,Punkt2D rechts){
        this.links = new Punkt2D(links.x(),links.y());
        this.rechts = new Punkt2D(rechts.x(),rechts.y());
    }
    public RechteckXYPerEcke(RechteckXYPerEcke kopie){
        this.rechts = new Punkt2D(kopie.rechts);
        this.links = new Punkt2D(kopie.links);
    }
    public boolean equals(RechteckXYPerEcke kopie) {
        if (kopie.links.x() - links.x() < 0.1 & kopie.links.x() - links.x() > - 0.1 & kopie.links.y() - links.y() < 0.1 & kopie.links.y() - links.y() > - 0.1) {
            if (kopie.rechts.x() - rechts.x() < 0.1 & kopie.rechts.x() - rechts.x() > - 0.1 & kopie.rechts.y() - rechts.y() < 0.1 & kopie.rechts.y() - rechts.y() > - 0.1) {
                return true;
            }
        }
        return false;
    }
    public double breite(){
        return rechts.x() - links.x();
    }
    public double hoehe(){
        if(rechts.y() > links.y()){
            return rechts.y() - links.y();
        }else{
            return links.y() - rechts.y();
        }
    }
    public Punkt2D ecke(boolean istRechts,boolean istOben){
        if( istRechts & istOben){ // obenRechts
            return new Punkt2D(rechts.x(),Math.max(links.y(),rechts.y()));
        }else if(istRechts & !istOben){ // untenRechts
            return new Punkt2D(rechts.x(),Math.min(links.y(),rechts.y()));
        }else if(!istRechts & istOben){ // obenLinks
            return new Punkt2D(links.x(),Math.max(links.y(),rechts.y()));
        }else{ // untenLinks
            return new Punkt2D(links.x(),Math.min(links.y(),rechts.y()));
        }
    }
    public Punkt2D ecke(int x){
        if(x == 0){
            return new Punkt2D(links.x(),Math.min(links.y(),rechts.y()));
        }else if( x == 1){
            return new Punkt2D(rechts.x(),Math.min(links.y(),rechts.y()));
        }else if( x == 2){
            return new Punkt2D(rechts.x(),Math.max(links.y(),rechts.y()));
        }else{
            return new Punkt2D(links.x(),Math.max(links.y(),rechts.y()));
        }
    }
    public Punkt2D mitte(){
        return new Punkt2D((ecke(2).x() - ecke(0).x()) / 2 + ecke(0).x(), (ecke(2).y() - ecke(0).y()) / 2 + ecke(0).y());
    }
    public double durchmesser(){
        return ecke(0).abstand(ecke(2));
    }
    public double umfang(){
        return hoehe() * 2 + breite() * 2;
    }
    public double flaeche(){
        return hoehe() * breite();
    }
    public RechteckXYPerEcke verschiebe(double x,double y){
        links.verschiebe(x,y);
        rechts.verschiebe(x,y);
        return this;
    }
    public String toString(){
        return "[" + ecke(0) + "," + ecke(2) + "]";
    }
}