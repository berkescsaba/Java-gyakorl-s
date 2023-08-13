public class Dog {
    private String name;
    private int age;
    private boolean hasFur;
    private boolean isHungry;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public boolean setHungry(int hungry) {
        return hungry > 5;
    }


    public Dog(String name, int age, boolean hasFur, int Hungry) {
        this.name = name;
        this.age = age;
        this.hasFur = hasFur;
        this.isHungry = setHungry(Hungry);
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
