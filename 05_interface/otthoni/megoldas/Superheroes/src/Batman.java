public class Batman implements Superhero, Billionare{

    double resourcefulness;

    public Batman() {
        this.resourcefulness = 100;
    }

    @Override
    public void createGadget() {
        this.resourcefulness += 50;
    }

    @Override
    public boolean isDefeating(Superhero superhero) {
        return superhero.getPower() < this.resourcefulness;
    }

    @Override
    public double getPower() {
        return resourcefulness * 2;
    }

    @Override
    public String toString() {
        return "Batman{" +
                "resourcefulness=" + resourcefulness +
                '}';
    }
}
