import java.util.Scanner;

public class Cat extends Tamagotchi {
    public String kitten;
    public String numbered;

    public Cat(String firstname, int age, String color, String kitten, String numbered) {
        super(firstname, age, color);
        this.kitten = kitten;
        this.numbered = numbered;
    }

    public String shopping(int toyChoice){
        Scanner scanner = new Scanner(System.in);
        System.out.println(this.firstname + " is out to get new toys. Theres alot of options! What would you like to buy?\nPress the number of your choice:");
        System.out.println("1. ball of yarn🧶\n2. fish🐟\n3. drill stick🎣");

        int toyPick = scanner.nextInt();

        if (toyPick == 1){
            System.out.println("Yarn! " + this.firstname + " loves balls of yarn! Good choice.");
        }else if (toyPick == 2){
            System.out.println("yummy, fish! " + this.firstname + " loves sticking their teeth in fishes! Good choice.");
        }else if (toyPick == 3){
            System.out.println("A drill stick! Nice! " + this.firstname + " loves running after the feather at the end of the drill stick! Good choice.");
        }else{
            System.out.println("Oh no, you forgot your money at home! Better luck next time..");
        }
        return "";
    }
    public void petPrintet(){
        System.out.println("   /\\_/\\   ");
        System.out.println("  / o o \\  ");
        System.out.println(" (   \"   ) ");
        System.out.println("  \\~(*)~/  ");
        System.out.println("   // \\\\   ");
    }

    @Override
    public void tamagotchiSound(){
        System.out.println("'Miaaaaw'\n");
    }
}
