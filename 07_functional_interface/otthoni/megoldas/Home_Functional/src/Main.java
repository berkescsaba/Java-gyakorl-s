public class Main {
    public static void main(String[] args) {

        NameCreator nameCreator = new NameCreator() {
            @Override
            public void create(String firstName, String secondName) {
                StringBuilder stringBuilder = new StringBuilder();
                System.out.println(stringBuilder.append(firstName).append(" ").append(secondName));
            }
        };

        NameCreator nameCreatorWithLambda = (firstName, secondName) -> {
            StringBuilder stringBuilder = new StringBuilder();
            System.out.println(stringBuilder.append(firstName).append(" ").append(secondName));
        };

        nameCreator.create("Harry", "Potter");
        nameCreatorWithLambda.create("Ronald", "Weasley");


        CheckNumber checkNumber = new CheckNumber() {
            @Override
            public boolean isEven(int number) {
                return number%2 == 0;
            }
        };

        CheckNumber checkNumberWithLambda = number -> number%2 == 0;

        System.out.println(checkNumber.isEven(402));
        System.out.println(checkNumberWithLambda.isEven(9543));

        CheckTextLength checkTextLength = new CheckTextLength() {
            @Override
            public int getLength(String text) {
                return text.length();
            }
        };

        CheckTextLength checkTextLengthWithLambda = text -> text.length();

        System.out.println(checkTextLength.getLength("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore."));
        System.out.println(checkTextLengthWithLambda.getLength("Consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur."));
    }
}