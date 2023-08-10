public class Cash extends Money{

    public Cash(String value, String color, int printAge) {
        super(value, color, printAge);
    }

    @Override
    public String toString() {
        return "Cash ==> value: " + getValue() + ", color: " + getColor() + ", print age: " + getPrintAge() ;
    }
}
