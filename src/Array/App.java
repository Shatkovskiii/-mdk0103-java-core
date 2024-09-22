import java.util.Scanner; 
 
public class App { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        ArrayNumber arrayNumber = new ArrayNumber(100); // массив
        Person[] people = new Person[100]; // массив для людей
        int personCount = 0; // сколько людей добавлено
 
        while (true) { 
            // меню
            System.out.println("Меню:"); 
            System.out.println("1. Показать массив чисел"); 
            System.out.println("2. Искать элемент в массиве"); 
            System.out.println("3. Удалить элемент из массива"); 
            System.out.println("4. Вставить элемент в массив"); 
            System.out.println("5. Добавить человека"); 
            System.out.println("6. Показать всех людей"); 
            System.out.println("7. Выход");
            System.out.print("Выберите действие: "); 
 
            int choice = scanner.nextInt(); // выбор пользователя
 
            switch (choice) { 
                case 1: 
                    arrayNumber.displayArray(); // показать массив чисел
                    break; 
                case 2: 
                    System.out.print("Введите элемент для поиска: "); 
                    int elementToFind = scanner.nextInt();
                    arrayNumber.searchElement(elementToFind); // искать элемент
                    break; 
                case 3: 
                    System.out.print("Введите индекс для удаления: "); 
                    int indexToDelete = scanner.nextInt();
                    arrayNumber.deleteElement(indexToDelete); // удалить элемент
                    break; 
                case 4: 
                    System.out.print("Введите индекс для вставки: "); 
                    int insertIndex = scanner.nextInt(); 
                    System.out.print("Введите элемент: "); 
                    int elementToInsert = scanner.nextInt();
                    arrayNumber.insertElement(insertIndex, elementToInsert); // вставить элемент
                    break; 
                case 5: 
                    if (personCount < people.length) { 
                        System.out.print("Введите имя: "); 
                        String name = scanner.next(); 
                        System.out.print("Введите фамилию: "); 
                        String surname = scanner.next(); 
                        System.out.print("Введите возраст: "); 
                        int age = scanner.nextInt();
                        people[personCount++] = new Person(name, surname, age); // добавить человека
                    } else { 
                        System.out.println("Массив для людей заполнен."); 
                    } 
                    break; 
                case 6: 
                    for (int i = 0; i < personCount; i++) { 
                        System.out.println(people[i]); // показать всех людей
                    } 
                    break; 
                case 7: 
                    System.out.println("Выход."); 
                    scanner.close(); // закрываем меню
                    return; 
                default: 
                    System.out.println("Неверный выбор."); 
            } 
        } 
    } 
}
