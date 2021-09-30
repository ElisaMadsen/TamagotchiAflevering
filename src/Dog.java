import java.util.Scanner;

public class Dog extends Tamagotchi {
    public boolean puppy;
    public int furLength;

    public Dog(String firstname, String lastname, int age, String color, boolean puppy, int furLength) {
        super(firstname, lastname, age, color);
        this.puppy = puppy;
        this.furLength = furLength;
    }

    @Override
    public String shopping(int toyChoice){
        Scanner scanner = new Scanner(System.in);
        System.out.println(this.firstname + this.lastname + " is out to get new toys. Theres alot of options! What would you like to buy?\nPress the number of your choice:");
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

        @Override
        public void tamagotchiSound() {
            System.out.println("Woof");
        }
    }




