public class Main {
    public static void main(String[] args) {
        System.out.println(useSummary(3,4));
        System.out.println(useDifference(3,4));
        System.out.println(useMultiply(3,4));
        System.out.println(useSummaryWithLambda(3,4));
        System.out.println(useDifferenceWithLambda(3,4));
        System.out.println(useMultiplyWithLambda(3,4));
    }

    public static int useSummary (int a, int b){
        Summary summary = new Summary() {
            @Override
            public int sumUp(int a, int b) {
                return a + b;
            }
        };
        return summary.sumUp(a, b);
    }

    public static int useDifference (int a, int b){
        Difference difference = new Difference() {
            @Override
            public int showDifference(int a, int b) {
                return a - b;
            }
        };
        return difference.showDifference(a, b);
    }


    public static int useMultiply (int a, int b){
        Multiplication multiplication = new Multiplication() {
            @Override
            public int multiply(int a, int b) {
                return a * b;
            }
        };
        return multiplication.multiply(a, b);
    }

    public static int useSummaryWithLambda (int a, int b){
        Summary summary = (a1, b1) -> a1 + b1;
        return summary.sumUp(a, b);
    }

    public static int useDifferenceWithLambda (int a, int b){
        Difference difference = (a1, b1) -> a1 - b1;
        return difference.showDifference(a, b);
    }


    public static int useMultiplyWithLambda (int a, int b){
        Multiplication multiplication = (a1, b1) -> a1 * b1;
        return multiplication.multiply(a, b);
    }

}