public class Tamagotchi {
    public String firstname;
    public String lastname;
    public int age;
    public String color;
    public String mood;
    public boolean isHungry;

    public Tamagotchi(String firstname, int age, String color, String mood, boolean isHungry) {
        this.firstname = firstname;
        this.age = age;
        this.color = color;
        this.mood = mood;
        this.isHungry = isHungry;
    }

    public void playWithAFriend(){
        System.out.println(this.firstname + " " + this.lastname + " is playing and having fun with a ball.");
    }
    public void feed(){
        System.out.println(this.firstname + " " + this.lastname + " is now feed");

    }
    public void sleep(){
        System.out.println(this.firstname + " " + this.lastname + " is now sleeping");

    }
    public void walk(){
        System.out.println(this.firstname + " " + this.lastname + " is now out for a walk");

    }
    public void shopping(){
        System.out.println(this.firstname + " " + this.lastname + " is out to get new toys");

    }
    public void tamagotchiSound(){
        System.out.println("....");

    }

    @Override
    public String toString() {
        return "Tamagotchi{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", mood='" + mood + '\'' +
                ", isHungry=" + isHungry +
                '}';
    }
}
