import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! Welcome to your tamagotchi! Do you want a dog 🐶 or cat 🐱 to play with?");
        System.out.println("Press 1 for dog and 2 for cat:");
        int catOrDogChoice = scanner.nextInt();

        if (catOrDogChoice == 1){
            System.out.println("You chose dog! What would you like to name your dog?");
            String dogName = scanner.next();

            System.out.println("That's a cute name! How old is " + dogName + "?");
            int dogAge = scanner.nextInt();

            System.out.println("Awesome! What color is " + dogName + "?");
            String dogColor = scanner.next();

            System.out.println("And is " + dogName + " a puppy?");
            String dogOrPuppy = scanner.next();

            System.out.println("Last question! Tell me with a number how long " + dogName + "'s fur length is:");
            int dogFurlength = scanner.nextInt();

            Dog dog = new Dog(dogName, dogAge, dogColor, dogOrPuppy, dogFurlength);
            dog.tamagotchiSound();

            for (int i = 0; i < 10; i++) {

                dog.playChoices();

                int playChoice = scanner.nextInt();

                if (playChoice == 1){
                    dog.feed();
                }else if(playChoice == 2){
                    dog.sleep();
                }else if (playChoice == 3) {
                    dog.play();
                }else if (playChoice == 4) {
                    dog.walk();
                }else if (playChoice == 5) {
                    dog.shopping(3);
                } else {
                    System.out.println("That is not a choice");
                }

            }

            dog.printFinishPlaying();

        } else if (catOrDogChoice == 2){
            System.out.println("You chose cat!");



        } else {
            System.out.println("please choose 1 or 2");
        }














    }
}
