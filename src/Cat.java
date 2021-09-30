public class Cat extends Tamagotchi {
    public boolean kitten;
    public boolean numbered;

    public Cat(String firstname, int age, String color, String mood, boolean isHungry, boolean kitten, boolean numbered) {
        super(firstname, age, color, mood, isHungry);
        this.kitten = kitten;
        this.numbered = numbered;
    }

    @Override
    public void tamagotchiSound(){
        System.out.println("miaaaaw");
    }
}
