public class Main {
    public static void main(String[] args) {
       Manager manager = new Manager();
       manager.useTools(Tool.BLUEPRINT);
       manager.workingArea(WorkingArea.OFFICE);
       Worker worker = new Worker();
       worker.useTools(Tool.DRILL);
       worker.workingArea(WorkingArea.SECOND_FLOOR);
    }
}