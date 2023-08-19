package animals;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, int weight, String color, String name) {
        super(age, weight, color, name);
    }

    @Override
    public void animalSay() {
        System.out.println("Гав!");
    }
}
