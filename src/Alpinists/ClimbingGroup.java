package Alpinists;

public class ClimbingGroup {
    private boolean jointoOpen;  // переменная отвечающая за открытие/закрытие набора в группу
    private  Alpinist[] alpinists;  // массив для хранения альпинистов в группе
    private Mountain mountain;  // гора на которую идет группа
    private int currentIndex;  // текущий индекс массива альпинистов


    public ClimbingGroup(Mountain mountain, int groupsize) { // конструктор для создания объекта гшруппы с заданной горой и размером группы
        this.mountain = mountain;
        this.alpinists = new Alpinist[groupsize];
        this.jointoOpen = false;  // изначально набор в группу закрыт
        this.currentIndex = 0;  // изначально текущий индекс равен 0
    }

    // метод для начала набора в группу
    public void startjoingtogroup() {
        jointoOpen = true;  // устанавливаем переменную в true, говоря, что набор открыт
        System.out.println("Набор в группу на восхождение на " + mountain.name + " начат");
    }

    // метод для добавления альпиниста в группу
    public void addAlpinist(Alpinist alpinist) {
        if (jointoOpen && currentIndex < alpinists.length) {
            alpinists[currentIndex++] = alpinist;  // добавляем альпиниста в массив и увеличиваем текущий индекс
            System.out.println(alpinist.name + " добавлен в группу для восхождения на " + mountain.name);
        } else if (!jointoOpen) {
            System.out.println("Набор в группу на восхождение на " + mountain.name + " не открыт");
        } else {
            System.out.println("Группа полная для восхождения на " + mountain.name);
        }
    }

    // метод показывает сколько альпинистов пойдут на гору
    public void printAlpinists() {
        System.out.println("Альпинисты в группе для восхождения на " + mountain.name + ":");
        for (Alpinist alpinist : alpinists) {
            if (alpinist != null) {
                System.out.println(alpinist.name);
            }
        }
    }
}
