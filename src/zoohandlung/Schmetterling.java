
package zoohandlung;


public class Schmetterling  extends Tier implements Laufen, Fliegen {

    @Override
    public void laufe() {
       System.out.println("Ich laufe!");
    }

    @Override
    public int getAnzahlBeine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAnzahlBeine(int anzahl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fliegLos() {
        System.out.println("Ich fliege los!");
       
    }

    @Override
    public void lande() {
        System.out.println("Ich lande!");
    }

    
    
}
