import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Duck;
import config.AnimalTypes;
import config.Commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        int tempAge = 0;
        int tempWeight = 0;
        String tempColor = "";
        String tempName = "";
        System.out.println("Добрый день, добро пожаловать в приложение Зоопарк v 0.0.0.1 beta");
        while (1 == 1) {
            System.out.println("Пожалуйста, введите команду. " + Commands.ADD + " для добавления нового объекта, " + Commands.LIST + " для вывода списка созданных объектов, " + Commands.EXIT + " для выхода из приложения.");
            try {
                Scanner scanner = new Scanner(System.in);
                Commands command = Commands.valueOf(scanner.nextLine().trim().toUpperCase());
                switch (command) {
                    case ADD: {
                        System.out.println("Какое животное вы хотите добавить? Введите CAT для добавления кошки, DOG - собаки, DUCK - утки");
                        AnimalTypes animalCase = AnimalTypes.valueOf(scanner.nextLine().trim().toUpperCase());

                        System.out.println("Укажите имя животного");
                        tempName = scanner.nextLine();

                        System.out.println("Укажите цвет животного");
                        tempColor = scanner.nextLine();

                        System.out.println("Укажите возраст животного");
                        tempAge = scanner.nextInt();

                        System.out.println("Укажите вес животного");
                        tempWeight = scanner.nextInt();

                        switch (animalCase) {
                            case CAT: {
                                Cat newCat = new Cat(tempAge, tempWeight, tempColor, tempName);
                                newCat.animalSay();
                                animals.add(newCat);
                                break;
                            }
                            case DOG: {
                                Dog newDog = new Dog(tempAge, tempWeight, tempColor, tempName);
                                newDog.animalSay();
                                animals.add(newDog);
                                break;
                            }
                            case DUCK: {
                                Duck newDuck = new Duck(tempAge, tempWeight, tempColor, tempName);
                                newDuck.animalSay();
                                animals.add(newDuck);
                                break;
                            }
                        }
                        break;

                    }
                    case LIST: {
                        System.out.println("Список добавленных животных:");
                        System.out.println("");
                        for (Animal element : animals) {
                            System.out.println(element.toString());
                            System.out.println("");
                        }
                        break;
                    }
                    case EXIT: {
                        System.exit(0);
                    }
                }
            } catch (Exception error) {
                System.out.println("Input error! Try again!");
            }
        }
    }
}