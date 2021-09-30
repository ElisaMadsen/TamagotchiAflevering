import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! Welcome to your tamagotchi! Do you want a dog 🐶 or cat 🐱 to play with?");
        System.out.println("Press 1 for dog and 2 for cat:");
        int catOrDogChoice = scanner.nextInt();

        if (catOrDogChoice == 1){
            System.out.println("You chose dog!");
        } else if (catOrDogChoice == 2){
            System.out.println("You chose cat!");
        } else {
            System.out.println("please choose 1 or 2");
        }

    }
}
