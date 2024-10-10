
// Решил попробовать использовать метод forEach для разнообразия, вроде упрощает код
// Так же попробовал лямбда- выражения


package sorting;

import java.util.List;

public class App {
    public static void main(String[] args) {
        // генерируем список сотрудников
        List<Employee> employees = Employee.generateEmployees(10);



        System.out.println("Список работников:");
        employees.forEach(System.out::println);

        // сортировка по имени
        Employee.sortByName(employees);
        System.out.println("\nСортировка по имени:");
        employees.forEach(System.out::println);

        // сортировка по имени и зп
        Employee.sortByNameAndSalary(employees);
        System.out.println("\nСортировка по имени и зп:");
        employees.forEach(System.out::println);

        // сортировка имя за возраст и компания
        Employee.sortByAllFields(employees);
        System.out.println("\nСортировка по имени, зп , возрасту и компании:");
        employees.forEach(System.out::println);
    }
}
