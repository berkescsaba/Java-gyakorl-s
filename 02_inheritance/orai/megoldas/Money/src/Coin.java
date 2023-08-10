public class Coin extends Money{

    public Coin(String value, String color, int printAge){
        super(value, color, printAge);
    }

    @Override
    public String toString() {
        return "Coin ==> value: " + getValue() + ", color: " + getColor() + ", print age: " + getPrintAge() ;
    }
}