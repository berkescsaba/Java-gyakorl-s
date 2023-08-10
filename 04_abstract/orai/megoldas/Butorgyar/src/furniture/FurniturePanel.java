package furniture;

public class FurniturePanel {

    private double width;
    private double length;
    private boolean isFrontal;

    private static final int HOLDER_PRICE_PER_SQUARE_METER = 5000;
    private static final int FRONTAL_PRICE_PER_SQUARE_METER = 500;

    public FurniturePanel(int width, int length, boolean isFrontal) {
        this.width = width / 100.0;
        this.length = length / 100.0;
        this.isFrontal = isFrontal;
    }

    public double getWidth() {
        return width;
    }

    public FurniturePanel setWidth(double width) {
        this.width = width;
        return this;
    }

    public double getLength() {
        return length;
    }

    public FurniturePanel setLength(double length) {
        this.length = length;
        return this;
    }

    public boolean isFrontal() {
        return isFrontal;
    }

    public FurniturePanel setFrontal(boolean frontal) {
        isFrontal = frontal;
        return this;
    }

    public double countPrice(double width, double length, boolean isFrontal) {
        double size = width * length;
        if (isFrontal) {
            return size * FRONTAL_PRICE_PER_SQUARE_METER;
        }
        return size * HOLDER_PRICE_PER_SQUARE_METER;
    }

    @Override
    public String toString() {
        return "furniture.FurniturePanel{" +
                "width=" + width +
                ", length=" + length +
                ", isFrontal=" + isFrontal +
                '}';
    }
}
