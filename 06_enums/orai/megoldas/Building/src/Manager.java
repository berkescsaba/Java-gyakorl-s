public class Manager extends Construction {

    @Override
    void useTools(Tool tool) {
        System.out.println("My tools are: " + tool);
    }

    @Override
    void workingArea(String area) {
        System.out.println("My working are is: " + area);
    }
}
