import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! Welcome to your tamagotchi! Do you want a dog 🐶 or cat 🐱 to play with?");
        System.out.println("Press 1 for dog and 2 for cat:");
        int catOrDogChoice = scanner.nextInt();

        if (catOrDogChoice == 1){
            System.out.println("You chose dog!");
            String dogName = "fitto";
            Dog fitto = new Dog("fitto", " fit", 4, "black", true, 10);
            System.out.println(fitto.firstname + " is cute.");

            for (int i = 0; i < 10; i++) {

                fitto.playChoices();

                int playChoice = 5;

                if (playChoice == 1){
                    fitto.feed();
                }else if(playChoice == 2){
                    fitto.sleep();
                }else if (playChoice == 3) {
                    fitto.play();
                }else if (playChoice == 4) {
                    fitto.walk();
                }else if (playChoice == 5) {
                    fitto.shopping(3);
                } else {
                    System.out.println("That is not a choice");
                }


            }
        } else if (catOrDogChoice == 2){
            System.out.println("You chose cat!");
        } else {
            System.out.println("please choose 1 or 2");
        }











    }
}
