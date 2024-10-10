package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Employee {
    String name;
    String company;
    int salary;
    int age;


    public Employee(String name, String company, int salary, int age) {
        this.name = name;
        this.company = company;
        this.salary = salary;
        this.age = age;
    }

    // инфа о работнике
    @Override
    public String toString() {
        return name + " | " + company + " | ЗП: " + salary + " | Возраст: " + age;
    }

    // состав работников и компаний
    public static List<Employee> generateEmployees(int count) {
        String[] maleNames = {"Андрей", "Витя", "Леха", "Сатир", "Ян"};
        String[] femaleNames = {"Даша", "Маша", "Оля", "Катя", "Лина"};
        String[] companies = {"Google", "VK", "Яндекс", "Кинопоиск", "Haval", "TicTok", "Магнит"};
        List<Employee> employees = new ArrayList<>();
        Random random = new Random();

        // создаем работников
        for (int i = 0; i < count; i++) {
            //чередование мужских и женских имён
            String name = (i % 2 == 0) ? maleNames[random.nextInt(maleNames.length)] : femaleNames[random.nextInt(femaleNames.length)];
            String company = companies[random.nextInt(companies.length)];
            int salary = 10000 + random.nextInt(50001); // зарплата от 10.000 до 60.000 тугриков
            int age = 18 + random.nextInt(52);          // возраст от 18 до 70
            employees.add(new Employee(name, salary, age, company));
        }
        return employees;
    }

    // сортировка имя
    public static void sortByName(List<Employee> employees) {
        Collections.sort(employees, Comparator.comparing(e -> e.name));
    }
    // сортировка имя и зп
    public static void sortByNameAndSalary(List<Employee> employees) {
        Collections.sort(employees, Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));
    }
    //сортировка имя зп возраст и компания
    public static void sortByAllFields(List<Employee> employees) {
        Collections.sort(employees, Comparator.comparing(Employee::getName)
                .thenComparing(Employee::getSalary)
                .thenComparing(Employee::getAge)
                .thenComparing(Employee::getCompany));
    }

    // геттеры
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getCompany() {
        return company;
    }
}
