package Alpinists;

import Alpinists.Alpinisite;
import Alpinists.ClimbingGroup;
import Alpinists.Mountain;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры гор
        Mountain everest = new Mountain("Everest", "Nepal", 8849);
        Mountain elbrus = new Mountain("Elbrus", "Russia", 5642);
        Mountain kamet = new Mountain("Kamet", "India", 2825);

        // Создаем экземпляры альпинистов с другими именами, странами и возрастом
        Alpinisite alpinisite1 = new Alpinisite("Ivan", 28, "Russia");
        Alpinisite alpinisite2 = new Alpinisite("Jean", 40, "France");
        Alpinisite alpinisite3 = new Alpinisite("Luca", 35, "Italy");

        // Создаем и настраиваем группу восхождения на Эверест
        ClimbingGroup group1 = new ClimbingGroup(everest);
        group1.addAlpinisite(alpinisite1); // Добавляем альпиниста 1
        group1.addAlpinisite(alpinisite2); // Добавляем альпиниста 2
        group1.addAlpinisite(alpinisite3); // Добавляем альпиниста 3
        group1.closeRecruitment(); // Закрываем набор в группу
        group1.addAlpinisite(new Alpinisite("popa", 99, "USA")); // Попытка добавить альпиниста после закрытия набора
        group1.displayGroupInfo(); // Вывод информации о группе

        // Создаем и настраиваем группу восхождения на Эльбрус
        ClimbingGroup group2 = new ClimbingGroup(elbrus);
        group2.addAlpinisite(alpinisite1); // Добавляем альпиниста 1
        group2.addAlpinisite(alpinisite2); // Добавляем альпиниста 2
        group2.addAlpinisite(alpinisite3); // Добавляем альпиниста 3
        group2.displayGroupInfo(); // Вывод информации о группе

        // Создаем и настраиваем группу восхождения на Камет
        ClimbingGroup group3 = new ClimbingGroup(kamet);
        group3.addAlpinisite(alpinisite1); // Добавляем альпиниста 1
        group3.addAlpinisite(alpinisite2); // Добавляем альпиниста 2
        group3.addAlpinisite(alpinisite3); // Добавляем альпиниста 3
        group3.displayGroupInfo(); // Вывод информации о группе
    }
}
