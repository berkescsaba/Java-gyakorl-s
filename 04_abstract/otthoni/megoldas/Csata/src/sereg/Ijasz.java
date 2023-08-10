package sereg;

public class Ijasz extends Katona {

    private int lotav;

    public int getLotav() {
        return lotav;
    }

    public Ijasz setLotav(int lotav) {
        this.lotav = lotav;
        return this;
    }

    public Ijasz(int lotav, int x, int y) {
        super(x, y);
        this.lotav = lotav;
    }

    @Override
    public String toString() {
        return "Ijasz{" +
                "lotav=" + lotav +
                ", tamadoEro=" + tamadoEro +
                ", eletPont=" + eletPont +
                ",pozíció: " + x +
                ", " + y +
                "} ";
    }

    @Override
    public void tamad(Katona celpont) {
        double distance=Math.sqrt(Math.pow((celpont.x- this.x),2)+Math.pow((celpont.y-this.y),2));
        if (distance<lotav) {
            int sebzesUtaniEletero = celpont.getEletPont() - this.tamadoEro;
            celpont.setEletPont(sebzesUtaniEletero);
        }
    }

    private int tavolsag(int ijasz, int celpont) {
        if (ijasz >= celpont) {
            return ijasz - celpont;
        } else return celpont - ijasz;
    }
}
