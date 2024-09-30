
public class Phone {
    String serialNumber, model;
    double weight, price;

    // конструктор для инициализации
    public Phone(String serialNumber, String model, double weight, double price) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.weight = weight;
        this.price = price;
    }

    // вывод информации о телефоне
    @Override
    public String toString() {
        return "serialNumber: " + serialNumber + ", Model: " + model + ", Weight: " + weight + ", Price: " + price;
    }
}
