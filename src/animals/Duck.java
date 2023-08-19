package animals;

public class Duck extends Animal implements IFlying {
    public Duck() {
    }

    public Duck(int age, int weight, String color, String name) {
        super(age, weight, color, name);
    }

    @Override
    public void animalSay() {
        System.out.println("Кря!");
    }

    @Override
    public void animalFly() {
        System.out.println("Я лечу!");
    }
}
