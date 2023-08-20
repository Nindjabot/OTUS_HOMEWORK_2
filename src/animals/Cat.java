package animals;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(int age, int weight, String color, String name) {
        super(age, weight, color, name);
    }

    @Override
    public void animalSay() {
        System.out.println("Мяу!");
    }
}
