public class FemaleEmployee extends Employee {

    private boolean isPregnant;

    public boolean isPregnant() {
        return isPregnant;
    }

    public FemaleEmployee setPregnant(boolean pregnant) {
        isPregnant = pregnant;
        return this;
    }

    public FemaleEmployee(String id, String name, int age, boolean isPregnant) {
        super(id, name, age);
        this.isPregnant = isPregnant;
    }

    @Override
    public String toString() {
        return "Female employee " + "id: " + getId() + ", name: " + getName() + ", age: " + getAge();
    }

    public void introduce(){
        System.out.println("I'm a female employee!!!");
    }
}
