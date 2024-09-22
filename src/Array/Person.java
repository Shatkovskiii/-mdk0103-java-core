public class Person { 
    String name; 
    String surname; 
    int age; 
 
    // конструктор
    Person(String name, String surname, int age) { 
        this.name = name; 
        this.surname = surname; 
        this.age = age; 
    } 
 
    // метод для отображения данных о человеке
    public String toString() { 
        return name + " " + surname + ", возраст: " + age; 
    } 
} 
