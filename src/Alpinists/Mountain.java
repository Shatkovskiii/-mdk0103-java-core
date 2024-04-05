package Alpinists;

public class Mountain {
    private String name; // название горы
    private String country; // страна в которой расположена гора
    private int height; // высота горы в метрах

    // конструктор для создания экземпляра горы с указанными параметрами
    public Mountain(String name, String country, int height) {
        this.name = name;
        this.country = country;
        this.height = height;
    }

    // метод для получения названия горы
    public String getName() {
        return name;
    }

    // метод для получения страны в которой расположена гора
    public String getCountry() {
        return country;
    }

    // метод для получения высоты горы
    public int getHeight() {
        return height;
    }
}


