public class Money {

    private String value;
    private String color;
    private int printAge;

    public Money(String value, String color, int printAge) {
        this.value = value;
        this.color = color;
        this.printAge = printAge;
    }

    public String getValue() {
        return value;
    }

    public Money setValue(String value) {
        this.value = value;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Money setColor(String color) {
        this.color = color;
        return this;
    }

    public int getPrintAge() {
        return printAge;
    }

    public Money setPrintAge(int printAge) {
        this.printAge = printAge;
        return this;
    }

    @Override
    public String toString() {
        return "Money{" +
                "value='" + value + '\'' +
                ", color='" + color + '\'' +
                ", printAge=" + printAge +
                '}';
    }
}
