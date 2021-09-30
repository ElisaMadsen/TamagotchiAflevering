import java.util.Scanner;

public class Cat extends Tamagotchi {
    public boolean kitten;
    public boolean numbered;

    public Cat(String firstname, String lastname, int age, String color, boolean kitten, boolean numbered) {
        super(firstname, lastname, age, color);
        this.kitten = kitten;
        this.numbered = numbered;
    }

    @Override
    public String shopping(int toyChoice){
        Scanner scanner = new Scanner(System.in);
        System.out.println(this.firstname + this.lastname + " is out to get new toys. Theres alot of options! What would you like to buy?\nPress the number of your choice:");
        System.out.println("1. garn wrench🧶\n2. fish\n3. drill stick");

        int toyPick = scanner.nextInt();

        if (toyPick == 1){
            System.out.println("A garn wrench!" + this.firstname + " loves garn wrenches! Good choice.");
        }else if (toyPick == 2){
            System.out.println("yummy, fish!" + this.firstname + " loves sticking his teeth in fishes! Good choice.");
        }else if (toyPick == 3){
            System.out.println("A drill stick! Nice! " + this.firstname + " loves running after the feather at the end of the drill stick! Good choice.");
        }else{
            System.out.println("Oh no, you forgot your money at home! Better luck next time..");
        }
        return "";

    }


    @Override
    public void tamagotchiSound(){
        System.out.println("miaaaaw");
    }
}
