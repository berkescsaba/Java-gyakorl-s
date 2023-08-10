import java.util.Random;

public class Comics {

    public static void main(String[] args) {
        Superhero[] superheroes = new Superhero[10];
        createSuperHeroes(superheroes);
        printSuperheroes(superheroes);
        fight(superheroes);
    }

    public static void createSuperHeroes(Superhero[] superheroes) {
        int i = 0;
        while (i < 5) {
            superheroes[i] = new Batman();
            i++;
        }
        while (i < 10) {
            superheroes[i] = new IronMan();
            i++;
        }
        for (Superhero superheroe : superheroes) {
            if (superheroe instanceof Batman) {
                double batmanRandom = Math.random() * 2 + 3;
                for (int j = 0; j < batmanRandom; j++) {
                    ((Batman) superheroe).createGadget();
                }
            } else if (superheroe instanceof IronMan) {
                double vasemberRandom = Math.random() * 2 + 3;
                for (int j = 0; j < vasemberRandom; j++) {
                    ((IronMan) superheroe).createGadget();
                }
            }
        }
    }

    public static void printSuperheroes(Superhero[] superheroes){
        for (Superhero superhero: superheroes) {
            System.out.println(superhero);
        }
    }

    public static void fight(Superhero[] superheroes){
        Random random = new Random();
        Superhero superhero1 = superheroes[random.nextInt(10)];
        Superhero superhero2 = superheroes[random.nextInt(10)];
        System.out.println("Fighters: " + superhero1 + ", and " + superhero2);
        System.out.println("superhero1 defeating superhero2?: " + superhero1.isDefeating(superhero2));

    }
}