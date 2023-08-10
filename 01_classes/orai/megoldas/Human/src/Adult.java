public class Adult {

    private String name;
    private String nationality;
    private int age;
    private boolean hasJob;
    private double salary;
    private Child child;

    public Adult(String name, String nationality, int age, boolean hasJob, double salary, Child child) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.hasJob = hasJob;
        this.salary = salary;
        this.child = child;
    }

    public Adult() {
    }

    public String getName() {
        return name;
    }

    public Adult setName(String name) {
        this.name = name;
        return this;
    }

    public String getNationality() {
        return nationality;
    }

    public Adult setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Adult setAge(int age) {
        this.age = age;
        return this;
    }

    public boolean isHasJob() {
        return hasJob;
    }

    public Adult setHasJob(boolean hasJob) {
        this.hasJob = hasJob;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public Adult setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public Child getChild() {
        return child;
    }

    public Adult setChild(Child child) {
        this.child = child;
        return this;
    }

    @Override
    public String toString() {
        return "Adult{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", age=" + age +
                ", hasJob=" + hasJob +
                ", salary=" + salary +
                ", child=" + child +
                '}';
    }
}
