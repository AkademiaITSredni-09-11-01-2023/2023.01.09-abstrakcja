package pl.comarch.it.akademia.random;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(50);

        System.out.println(randomNumber);

        Scanner scanner = new Scanner(System.in);
        String linijka = scanner.nextLine();
        System.out.println(linijka);
    }
}
