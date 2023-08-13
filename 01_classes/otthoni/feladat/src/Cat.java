public class Cat {
    public Cat(String name, int age, String color, Dog play) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.wantsToPlay = setWantsToPlay(play);
    }

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    private String name;
    private int age;
    private String color;
    private boolean wantsToPlay;
}
