public class Child {

    private String name;
    private int age;

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Child() {
    }

    public String getName() {
        return name;
    }

    public Child setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Child setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
