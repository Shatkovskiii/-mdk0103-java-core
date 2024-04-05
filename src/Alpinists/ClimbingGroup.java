package Alpinists;

import Alpinists.Alpinisite;

public class ClimbingGroup {
    // поле, определяющее открыт ли набор в группу
    private boolean openForRecruitment;
    // альпинист в группе
    private Alpinisite alpinisite;
    // гора, на которую планируется восхождение
    private Mountain mountain;

    // конструктор для создания группы на основе указанной горы
    public ClimbingGroup(Mountain mountain) {
        this.openForRecruitment = true;
        this.mountain = mountain;
    }

    // метод для проверки, открыт ли набор в группу
    public boolean isOpenForRecruitment() {
        return openForRecruitment;
    }

    // метод для закрытия набора в группу
    public void closeRecruitment() {
        this.openForRecruitment = false;
    }

    // метод для добавления альпиниста в группу
    public void addAlpinisite(Alpinisite alpinisite) {
        if (openForRecruitment) {
            this.alpinisite = alpinisite;
            System.out.println(alpinisite.getName() + " добавлен в группу");
        } else {
            System.out.println("Набор закрыт");
        }
    }

    // метод для вывода информации о группе
    public void displayGroupInfo() {
        System.out.println("Гора: " + mountain.getName());
        System.out.println("Страна: " + mountain.getCountry());
        System.out.println("Высота: " + mountain.getHeight() + " meters");
        System.out.println("Группа:");
        // вывод информации об альпинисте в группе
        if (alpinisite != null) {
            System.out.println("Имя: " + alpinisite.getName() + ", Возраст: " + alpinisite.getAge() + ", Адрес: " + alpinisite.getAddress());
        } else {
            System.out.println("В группе нет альпинистов");
        }
    }
}
