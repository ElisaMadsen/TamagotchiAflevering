import java.util.Random;
import java.util.Scanner;

public class Tamagotchi {
    public String firstname;
    public String lastname;
    public int age;
    public String color;

    public Tamagotchi(String firstname, String lastname, int age, String color) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.color = color;
    }

    public void playChoices(){
        System.out.println("What would you like to do with your pet?");
        System.out.println("please press the number of your choice");
        System.out.println("1. feed\n2. sleep\n3. play\n4. walk\n5. shopping");
    }

    public String getTamagotchiName(String firstname, String lastname){
        return this.firstname + this.lastname;
    }

    public void play(){
        System.out.println(this.firstname + " is playing and having fun with a ball!");
    }
    public void feed(){
        System.out.println("yaay! " + this.firstname + " loves food!" + this.firstname + "is full and happy after he ate!");

    }
    public void sleep(){
        System.out.println(this.firstname + " is sleeping nice and safe💤");

    }
    public void walk() {
        Random random = new Random();
        int mininmum = 1;
        int maximum = 3;
        int randomNumber = random.nextInt(maximum);
        if (randomNumber == 1) {
            System.out.println(this.firstname + this.lastname + " is now out for a walk! Theres alot of funny and different smells. Is that a poop?💩");
        } else if (randomNumber == 2) {
            System.out.println(this.firstname + this.lastname + " is now out for a walk! Theres another cute dog in the park. They are now playing and having fun!");
        } else {
            System.out.println(this.firstname + this.lastname + " is now out for a walk!" + this.firstname + this.lastname + " is in a funny mood. Keep an extra eye out!");
        }
    }

    public String shopping(int toyChoice){
        Scanner scanner = new Scanner(System.in);
        System.out.println(this.firstname + this.lastname + " is out to get new toys. Theres alot of options! What would you like to get your pet?\nPress the number of your choice:");
        System.out.println("1. stuffed animal\n2. bone\n3. ball");

        int toyPick = scanner.nextInt();

        if (toyPick == 1){
            System.out.println("A stuffed animal!" + this.firstname + " loves stuffed animals! Good choice.");
        }else if (toyPick == 2){
            System.out.println("yummy, a bone!" + this.firstname + " loves sticking his teeth in bones! Good choice.");
        }else if (toyPick == 3){
            System.out.println("A ball! Nice! " + this.firstname + " loves running after the ball! Good choice.");
        }else{
            System.out.println("Oh no, you forgot your money at home! Better luck next time..");
        }
        return "";

    }

    public void tamagotchiSound(){
        System.out.println("....");
    }

    public void printFinishPlaying(){
        System.out.println("WAUW! It has been a lovely, eventful day! " + this.firstname + this.lastname + " loved it!");
        System.out.println("Thanks for today! " + this.firstname + this.lastname + " is tired and done for today! Thanks for playing, sleep tight!!👋👋");
    }

    @Override
    public String toString() {
        return "Tamagotchi{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
