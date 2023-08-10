import sereg.Ijasz;
import sereg.Kardos;
import sereg.Katona;

import java.util.Random;

public class Main {

    static int seregMeret = 10;
    static Random random = new Random();

    public static void main(String[] args) {

        Katona[] vorosSereg = new Katona[seregMeret];
        Katona[] kekSereg = new Katona[seregMeret];

        addIjasz(vorosSereg);
        addIjasz(kekSereg);
        addKardos(vorosSereg);
        addKardos(kekSereg);
        describe("voros sereg", vorosSereg);
        describe("kek sereg", kekSereg);
        csata(vorosSereg, kekSereg);
        describe("voros sereg", vorosSereg);
        describe("kek sereg", kekSereg);
        countWinner(vorosSereg, kekSereg);
    }

    public static void csata(Katona[] vorosSereg, Katona[] kekSereg) {
        for (int i = 0; i < seregMeret; i++) {
            if (vorosSereg[i] instanceof Ijasz) {
                Ijasz ijasz = (Ijasz) vorosSereg[i];
                ijasz.tamad(kekSereg[i]);
            } else if (vorosSereg[i] instanceof Kardos) {
                Kardos kardos = (Kardos) vorosSereg[i];
                kardos.tamad(kekSereg[i]);
            }
            if (kekSereg[i] instanceof Ijasz) {
                Ijasz ijasz = (Ijasz) kekSereg[i];
                ijasz.tamad(vorosSereg[i]);
            } else if (kekSereg[i] instanceof Kardos) {
                Kardos kardos = (Kardos) kekSereg[i];
                kardos.tamad(vorosSereg[i]);
            }
        }
    }

    static void countWinner(Katona[] vorosSereg, Katona[] kekSereg) {
        int vorosEletero = 0;
        for (int i = 0; i < seregMeret; i++) {
            vorosEletero += vorosSereg[i].getEletPont();
        }
        int kekEletero = 0;
        for (int i = 0; i < seregMeret; i++) {
            kekEletero += kekSereg[i].getEletPont();
        }
        System.out.println("Kékek: " + kekEletero);
        System.out.println("Vörösek: " + vorosEletero);

        if (kekEletero > vorosEletero) {
            System.out.println("Kék csapat nyert!!!");
        } else if (vorosEletero > kekEletero) {
            System.out.println("Vörös csapat nyert!!!");
        } else System.out.println("Döntetlen");
    }

    public static void addIjasz(Katona[] sereg) {
        for (int i = 0; i < seregMeret / 2; i++) {
            int randomLotav = random.nextInt(11 - 1) + 1;
            int randomX = random.nextInt(11 - 1) + 1;
            int randomY = random.nextInt(11 - 1) + 1;
            Ijasz ijasz = new Ijasz(randomLotav, randomX, randomY);
            sereg[i] = ijasz;
        }
    }

    public static void addKardos(Katona[] sereg) {
        for (int i = 0; i < seregMeret; i++) {
            if (sereg[i] == null) {
                int randomX = random.nextInt(11 - 1) + 1;
                int randomY = random.nextInt(11 - 1) + 1;
                Kardos kardos = new Kardos(randomX, randomY);
                sereg[i] = kardos;
            }
        }
    }

    static void describe(String seregnev, Katona[] sereg) {
        System.out.println(seregnev);
        for (int i = 0; i < sereg.length; i++) {
            System.out.println(i + 1 + "    " + sereg[i]);
        }
    }
}