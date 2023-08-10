public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("emplyeeid", "Mr. Employee", 55);
        MaleEmployee maleEmployee = new MaleEmployee("myId", "George", 34);
        FemaleEmployee femaleEmployee = new FemaleEmployee("myId", "Susan", 29, true);

        System.out.println(maleEmployee.getName());
        System.out.println(maleEmployee);
        maleEmployee.introduce();
        System.out.println("He can lift: " + maleEmployee.canLift());
        maleEmployee.setAge(88);
        System.out.println("He can lift: " + maleEmployee.canLift());
        

        System.out.println(femaleEmployee.getName());
        System.out.println(femaleEmployee.isPregnant());
        System.out.println(femaleEmployee);
        femaleEmployee.introduce();

        System.out.println(employee.getName());
        System.out.println(employee);
        employee.introduce();

    }
}