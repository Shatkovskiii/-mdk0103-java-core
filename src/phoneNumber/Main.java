
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // генерация 30 случайных телефонов
        List<Phone> phones = PhoneGenerator.generatePhones(30);

        // коллекция  по цене
        List<Phone> sortedByPrice = new ArrayList<>(phones);
        sortedByPrice.sort(Comparator.comparingDouble(p -> p.price));

        // коллекция  по весу
        List<Phone> sortedByWeight = new ArrayList<>(phones);
        sortedByWeight.sort(Comparator.comparingDouble(p -> p.weight));

        // вывод  по цене
        System.out.println("Телефоны отсортированы по цене:");
        sortedByPrice.forEach(System.out::println);

        // Вывод по весу
        System.out.println("\nТелефоны отсортированы по весу:");
        sortedByWeight.forEach(System.out::println);
    }
}
