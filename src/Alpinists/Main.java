package Alpinists;

import Alpinists.Mountain;

public class Main {
    public static void main(String[] args) {
        Mountain mountEverest = new Mountain("Эверест", "Непал", 8848);
        ClimbingGroup groupone = new ClimbingGroup(mountEverest, 3);

        Alpinist глад = new Alpinist("Глад", 54, "Самара");
        Alpinist Алексей = new Alpinist("Алексей", 47, "ИК-3");
        Alpinist Арти = new Alpinist("Арти", 24, "Харьков");

        groupone.startjoingtogroup();  // начинаем набор в группу
        groupone.addAlpinist(глад);
        groupone.addAlpinist(Алексей);
        groupone.addAlpinist(Арти);
        groupone.printAlpinists();  // выводим альпинистов в группе
    }
}