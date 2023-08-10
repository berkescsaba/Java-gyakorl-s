public abstract class Avengers implements Superhero {

    double superPower;
    boolean hasWeakness;

    public Avengers(double superPower, boolean hasWeakness) {
        this.superPower = superPower;
        this.hasWeakness = hasWeakness;
    }

    public Avengers() {

    }

    public double getSuperPower() {
        return superPower;
    }

    public Avengers setSuperPower(double superPower) {
        this.superPower = superPower;
        return this;
    }

    public boolean isHasWeakness() {
        return hasWeakness;
    }

    public Avengers setHasWeakness(boolean hasWeakness) {
        this.hasWeakness = hasWeakness;
        return this;
    }

    public abstract boolean savesWorld();

    @Override
    public double getPower() {
        return this.superPower;
    }

    @Override
    public boolean isDefeating(Superhero superhero) {
        if (superhero instanceof Avengers) {
            if (((Avengers) superhero).hasWeakness && superhero.getPower() > this.getPower()) {
                return true;
            }
        }
        if (superhero instanceof Batman) {
            return this.superPower >= superhero.getPower() * 2;
        }
        return superhero.getPower() < this.getPower();
    }

    @Override
    public String toString() {
        return "Avengers{" +
                "superPower=" + superPower +
                ", hasWeakness=" + hasWeakness +
                '}';
    }

}
