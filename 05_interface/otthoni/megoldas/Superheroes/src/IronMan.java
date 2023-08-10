import java.util.Random;

public class IronMan extends Avengers implements Billionare{

    public IronMan() {
        super();
        this.hasWeakness = true;
        this.superPower = 150;

    }

    public IronMan(double superPower, boolean hasWeakness) {
        super(superPower, hasWeakness);
    }

    @Override
    public boolean savesWorld() {
        return this.superPower > 1000;
    }

    @Override
    public void createGadget() {
        this.superPower += Math.floor(new Random().nextInt(11));
    }

    @Override
    public String toString() {
        return "IronMan{" +
                "superPower=" + superPower +
                ", hasWeakness=" + hasWeakness +
                "} ";
    }
}
