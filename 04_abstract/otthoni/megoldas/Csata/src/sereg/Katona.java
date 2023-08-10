package sereg;

public abstract class Katona {

    protected int tamadoEro;
    protected int eletPont;
    protected int x;
    protected int y;

    public Katona(int x, int y) {
        this.eletPont = 100;
        this.tamadoEro = (int) Math.abs(Math.random() * (20 - 10) + 10);
        this.x = x;
        this.y = y;
    }

    public int getTamadoEro() {
        return tamadoEro;
    }

    public Katona setTamadoEro(int tamadoEro) {
        this.tamadoEro = tamadoEro;
        return this;
    }

    public int getEletPont() {
        return eletPont;
    }

    public Katona setEletPont(int eletPont) {
        this.eletPont = eletPont;
        return this;
    }

    public int getX() {
        return x;
    }

    public Katona setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return y;
    }

    public Katona setY(int y) {
        this.y = y;
        return this;
    }

    abstract void tamad(Katona celpont);

    @Override
    public String toString() {
        return "Katona{" +
                "tamadoEro=" + tamadoEro +
                ", eletPont=" + eletPont +
                ",pozíció: " + x +
                ", " + y +
                '}';
    }
}
