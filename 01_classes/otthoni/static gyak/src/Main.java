public class Main {
    public static void main(String[] args) {
        //code here
        Tree treeOne = new Tree(TreeTypes.FA1);
        Tree treeTwo = new Tree(TreeTypes.FA2);
        Tree treeThree = new Tree(TreeTypes.FA3);
        Tree treeFour = new Tree(TreeTypes.FA4);
        Tree treeFive = new Tree(TreeTypes.FA1);

        System.out.println(String.valueOf(treeOne));
        System.out.println(String.valueOf(treeTwo));
        System.out.println(String.valueOf(treeThree));
        System.out.println(String.valueOf(treeFour));
        System.out.println(String.valueOf(treeFive));

        System.out.println("Fak szama: " + Forest.numberOfTrees);
    }
}