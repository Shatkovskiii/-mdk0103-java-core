
import java.util.*;

public class PhoneGenerator {
    static String[] models = {"Model Samsung", "Model Iphone", "Model Poco", "Model Digma", "Model BlackBerry"};
    static Random random = new Random();

    //  метод для генерации 30 случайных телефонов
    public static List<Phone> generatePhones(int count) {
        List<Phone> phones = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            String serialNumber = "serialNumber" + i; // серийный номер
            String model = models[random.nextInt(models.length)]; // рандом модель
            double weight = 100 + random.nextDouble() * 200; // случайный вес от 100 до 300 г
            double price = 100 + random.nextDouble() * 1100; // случайная цена от 100 до 1200 денег
            phones.add(new Phone(serialNumber, model, weight, price)); // добавляем мобилу
        }
        return phones;
    }
}
