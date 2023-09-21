public class Schaf implements Transportierbar{
    int gewicht;
    int laenge;
    int breite;
    int hoehe;

    boolean zerbrechlich;
    boolean stapelbar;
    String beschriftung;
    public Schaf(int g, int l, int b, int h, boolean z, boolean s, String bes) {
        this.gewicht = g;
        this.laenge = l;
        this.breite = b;
        this.hoehe = h;
        this.zerbrechlich = z;
        this.stapelbar = s;
        this.beschriftung = bes;
    }
    public int gewicht(){
        return this.gewicht;
    }
    public int laenge(){
        return this.laenge;
    }
    public int breite(){
        return this.breite;
    }
    public int hoehe(){
        return this.hoehe;
    }

    public boolean zerbrechlich(){
        return this.zerbrechlich;
    }
    public boolean stapelbar(){
        return this.stapelbar;
    }
    public String beschriftung(){
        return this.beschriftung;
    }
}
