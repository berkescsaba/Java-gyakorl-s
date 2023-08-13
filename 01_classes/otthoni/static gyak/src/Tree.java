public class Tree {
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Tree(String type) {
        this.type = type;
        Forest.numberOfTrees++;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "type='" + type + '\'' +
                '}';
    }

    private String type;
}
