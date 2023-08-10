package sereg;

public class Kardos extends Katona{

    public Kardos(int x, int y) {
        super(x, y);
    }

    @Override
    public void tamad(Katona celpont) {
        this.x = celpont.getX();
        this.y = celpont.getY();
        this.eletPont -= 10;
        celpont.setEletPont(celpont.eletPont - this.tamadoEro);
    }

    @Override
    public String toString() {
        return "Kardos{" +
                "tamadoEro=" + tamadoEro +
                ", eletPont=" + eletPont +
                ", x=" + x +
                ", y=" + y +
                "} ";
    }
}
