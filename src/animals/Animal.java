package animals;

public abstract class Animal implements IAnimal {

    private int age;

    private int weight;

    private String color;

    private String name;


    public Animal() {
    }

    public Animal(int age, int weight, String color, String name) {
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.name = name;
    }

    @Override
    public void animalSay() {
        System.out.println("Я не знаю как должен разговаривать, пожалуйста помогите");
    }

    @Override
    public void animalGo() {
        System.out.println("Я иду");
    }

    @Override
    public void animalDrink() {
        System.out.println("Я пью");
    }

    @Override
    public void animalEat() {
        System.out.println("Я ем");
    }

    @Override
    public String calculateAge(int age) {
        if (age == 1){
            return "год";
        }
        else if (age >= 2 && age <= 4){
            return "года";
        }
        else return "лет";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +", мне " + age + " " + calculateAge(age) + ", я вешу " + weight +" кг, мой цвет - " + color;
    }
}
