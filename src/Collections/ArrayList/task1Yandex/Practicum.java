package Collections.ArrayList.task1Yandex;

import java.util.ArrayList;
import java.util.List;

public class Practicum {
    public static void main(String[] args) {
        var animals = new ArrayList<String>(){{ // ordered collection
            add("Шиншила");
            add("Крокодил");
            add("Лев");
            add("Медведь");
            add( "Слон");
        }};

        System.out.println("Сегодня в зоопарке можно " +
                "увидеть кормления " + animals.size() + " животных.");
        System.out.println("Это будут:");
        printAllAnimals(animals);

        swapAnimals(animals, "Крокодил", "Шиншила");
        swapAnimals(animals, "Слон", "Шиншила");
        swapAnimals(animals, "Лев", "Шиншила");
        swapAnimals(animals, "Медведь", "Лев");

        System.out.println("Расписание кормлений:");
        for (int i = 9; i <=13; i++) {
            System.out.println("В "+ i +":00 - " + animals.get(i-9));
        }
    }

    public static void printAllAnimals(List animals){
        for (Object animal : animals) {
            System.out.println(animal);
        }
    }

    public static boolean swapAnimals(List<String> animals, String animal1,
                                      String animal2){
        if (!(animals.contains(animal1)
                && animals.contains(animal2))) {
            return false;
        }
        int indexA1 =  animals.indexOf(animal1);
        int indexA2 =  animals.indexOf(animal2);
        String tmp = animals.set(indexA1, animals.get(indexA2));
        animals.set(indexA2, tmp);
        return true;
    }
}
