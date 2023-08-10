public class Dog {

    private String name;
    private int age;
    private boolean hasFur;
    private boolean isHungry;

    public Dog(String name, int age, boolean hasFur, int hungerScale) {
        this.name = name;
        this.age = age;
        this.hasFur = hasFur;
        this.isHungry = setHungry(hungerScale);
    }

    public String getName() {
        return name;
    }

    public Dog setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Dog setAge(int age) {
        this.age = age;
        return this;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public Dog setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
        return this;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public boolean setHungry(int hungry) {
        return hungry > 5;

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hasFur=" + hasFur +
                ", isHungry=" + isHungry +
                '}';
    }
}
