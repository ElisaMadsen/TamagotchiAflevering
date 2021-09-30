public class Dog extends Tamagotchi {
    public boolean puppy;
    public int furLength;

    public Dog(String firstname, int age, String color, String mood, boolean isHungry, boolean puppy, int furLength) {
        super(firstname, age, color, mood, isHungry);
        this.puppy = puppy;
        this.furLength = furLength;
    }

    @Override
    public void tamagotchiSound(){
        System.out.println("Woof");
    }


}
