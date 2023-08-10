public class Cat {

    private String name;
    private int age;
    private String color;
    private boolean wantsToPlay;

    public Cat(String name, int age, String color, Dog dog) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.wantsToPlay = setWantsToPlay(dog);
    }

    public String getName() {
        return name;
    }

    public Cat setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Cat setAge(int age) {
        this.age = age;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Cat setColor(String color) {
        this.color = color;
        return this;
    }

    public boolean isWantsToPlay() {
        return wantsToPlay;
    }

    public boolean setWantsToPlay(Dog dog) {
        return dog.isHungry();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", wantsToPlay=" + wantsToPlay +
                '}';
    }
}
