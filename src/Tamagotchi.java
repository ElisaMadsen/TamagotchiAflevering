import java.util.Random;
import java.util.Scanner;

public class Tamagotchi {
    public String firstname;
    public int age;
    public String color;

    public Tamagotchi(String firstname, int age, String color) {
        this.firstname = firstname;
        this.age = age;
        this.color = color;
    }

    public void playChoices(){
        System.out.println("What would you like to do with your pet?");
        System.out.println("please press the number of your choice");
        System.out.println("1. feed\n2. sleep\n3. play\n4. walk\n5. shopping");
    }

    public void play(){
        System.out.println(this.firstname + " is playing and having fun with a ball!");
    }
    public void feed(){
        System.out.println("yaay! " + this.firstname + " loves food!" + this.firstname + " is full and happy after he ate!");

    }
    public void sleep(){
        System.out.println(this.firstname + " is sleeping nice and safe💤");

    }
    public void walk() {
        Random random = new Random();
        int maximum = 3;
        int randomNumber = random.nextInt(maximum);
        if (randomNumber == 1) {
            System.out.println(this.firstname + " is now out for a walk! Theres alot of funny and different smells. Is that a poop?💩");
        } else if (randomNumber == 2) {
            System.out.println(this.firstname + " is now out for a walk! Theres another cute dog in the park. They are now playing and having fun!");
        } else {
            System.out.println(this.firstname + " is now out for a walk!" + this.firstname + " is in a funny mood. Keep an extra eye out!");
        }
    }

    public void tamagotchiSound(){
        System.out.println("....");
    }

    public void finishPlaying(){
        System.out.println("WAUW! It has been a lovely, eventful day! " + this.firstname + " loved it!");
        System.out.println("Thanks for today! " + this.firstname + " is tired and done for today! Thanks for playing, sleep tight!!👋👋");
    }

    @Override
    public String toString() {
        return "Tamagotchi{" +
                "firstname='" + firstname + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
