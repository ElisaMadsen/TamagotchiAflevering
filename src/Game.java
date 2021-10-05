import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Welcome and choosing between dog or cat
        System.out.println("Hi! Welcome to your tamagotchi! Do you want a dog 🐶 or cat 🐱 to play with?\n");
        System.out.println("Press 1 for dog and 2 for cat:");
        int catOrDogChoice = scanner.nextInt();

        //User creating the dog if that is chosen
        if (catOrDogChoice == 1) {
            System.out.println("You chose dog! What would you like to name your dog?🐶");
            String dogName = scanner.next();

            System.out.println("That's a cute name! How old is " + dogName + "?");
            int dogAge = scanner.nextInt();

            System.out.println("Awesome! What color is " + dogName + "?");
            String dogColor = scanner.next();

            System.out.println("And is " + dogName + " a puppy?");
            String dogOrPuppy = scanner.next();

            System.out.println("Last question! Tell me with a number how long " + dogName + "'s fur length is:");
            int dogFurlength = scanner.nextInt();

            //Creating users dog
            Dog dog = new Dog(dogName, dogAge, dogColor, dogOrPuppy, dogFurlength);
            System.out.println("Nice! Say hello to your new pet: " + dogName + "!");
            dog.petPrintet();
            dog.tamagotchiSound();

            //Rounds of game
            for (int i = 0; i < 10; i++) {

                //Showing the options player can choose from
                dog.playChoices();

                int playChoice = scanner.nextInt();

                if (playChoice == 1) {
                    dog.feed();
                } else if (playChoice == 2) {
                    dog.sleep();
                } else if (playChoice == 3) {
                    dog.play();
                } else if (playChoice == 4) {
                    dog.walk();
                } else if (playChoice == 5) {
                    dog.shopping(3);
                } else if (playChoice == 6) {
                    System.out.println("You quit the game😢");
                    break;
                } else {
                    System.out.println("That is not a choice");
                }
            }

            //Game is finished
            dog.finishPlaying();

            //User creating the cat if that is chosen
        } else if (catOrDogChoice == 2) {
            System.out.println("You chose cat! What would you like to name your cat?🐱");
            String catName = scanner.next();

            System.out.println("That's a cute name! How old is " + catName + "?");
            int catAge = scanner.nextInt();

            System.out.println("Awesome! What color is " + catName + "?");
            String catColor = scanner.next();

            System.out.println("And is " + catName + " a kitten?");
            String catOrKitten = scanner.next();

            System.out.println("Last question! Tell me if " + catName + " is numbered or not - just in case they run away😉:");
            String catNumbered = scanner.next();

            //Creating users cat
            Cat cat = new Cat(catName, catAge, catColor, catOrKitten, catNumbered);
            System.out.println("Nice! Say hello to your new pet: " + catName + "!");
            cat.petPrintet();
            cat.tamagotchiSound();

            //Rounds of game
            for (int i = 0; i < 10; i++) {

                //Showing the options player can choose from
                cat.playChoices();

                int playChoice = scanner.nextInt();

                if (playChoice == 1) {
                    cat.feed();
                } else if (playChoice == 2) {
                    cat.sleep();
                } else if (playChoice == 3) {
                    cat.play();
                } else if (playChoice == 4) {
                    cat.walk();
                } else if (playChoice == 5) {
                    cat.shopping(3);

                } else if (playChoice == 6) {
                    System.out.println("You quit the game😢");
                    break;
                }else {
                    System.out.println("That is not a choice");
                }
            }

            //Game is finished
            cat.finishPlaying();

        } else {
            System.out.println("please choose 1 for dog or 2 for cat!");
        }
    }
}