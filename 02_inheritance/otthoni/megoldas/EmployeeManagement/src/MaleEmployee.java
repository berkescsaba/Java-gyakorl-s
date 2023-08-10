public class MaleEmployee extends Employee {


    public MaleEmployee(String id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void introduce() {
        System.out.println("I'm a male employee!!!");
    }

    @Override
    public String toString() {
        return "MaleEmployee " + "id: " + getId() + ", name: " + getName() + ", age: " + getAge();
    }

    public boolean canLift() {
        return getAge() <= 45;
    }
}
