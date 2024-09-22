import java.util.Random; 
 
public class ArrayNumber { 
    int[] array; 
    int size; 
 
    // создаём массив
    ArrayNumber(int capacity) { 
        array = new int[capacity]; 
        size = capacity; 
        fillArray(); 
    } 
 
    // заполняем массив случайными числами от 0 до 100
    void fillArray() { 
        Random random = new Random(); 
        for (int i = 0; i < size; i++) { 
            array[i] = random.nextInt(101); 
        } 
    } 
 
    // выводим все элементы массива
    void displayArray() { 
        for (int i = 0; i < size; i++) { 
            System.out.print(array[i] + " "); 
        } 
        System.out.println(); 
    } 
 
    // ищем элемент в массиве
    boolean searchElement(int element) { 
        for (int i = 0; i < size; i++) { 
            if (array[i] == element) { 
                System.out.println("Элемент " + element + " найден."); 
                return true; 
            } 
        } 
        System.out.println("Элемент " + element + " не найден."); 
        return false; 
    } 
 
    // удаляем элемент по индексу
    void deleteElement(int index) { 
        if (index < 0 || index >= size) { 
            System.out.println("Индекс нетот."); 
            return; 
        } 
        for (int i = index; i < size - 1; i++) { 
            array[i] = array[i + 1]; 
        } 
        size--; 
        System.out.println("Элемент удалён."); 
    } 
 
    // вставляем элемент в указанный индекс
    void insertElement(int index, int element) { 
        if (index < 0 || index > size) { 
            System.out.println("Индекс нетот."); 
            return; 
        } 
        for (int i = size; i > index; i--) { 
            array[i] = array[i - 1]; 
        } 
        array[index] = element; 
        size++; 
        System.out.println("Элемент добавлен."); 
    } 
}
