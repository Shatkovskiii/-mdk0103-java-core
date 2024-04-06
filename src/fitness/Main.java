package fitness;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FitnessClub fitnessClub = new FitnessClub();

        // добавляем по 20 клиентов в каждую зону
        addCustomersToZone(fitnessClub, FitnessZone.GYM);
        addCustomersToZone(fitnessClub, FitnessZone.SWIMMING_POOL);
        addCustomersToZone(fitnessClub, FitnessZone.GROUP_CLASSES);

        // вывод информации о посетителях в зонах
        fitnessClub.printCustomersInFitnessZones();
    }

    private static void addCustomersToZone(FitnessClub fitnessClub, FitnessZone zone) {
        fitnessClub.enterFitnessZone(zone, createMembership("Иван", "Иванов", 1980));
        fitnessClub.enterFitnessZone(zone, createMembership("Петр", "Петров", 1985));
        fitnessClub.enterFitnessZone(zone, createMembership("Александр", "Сидоров", 1978));
        fitnessClub.enterFitnessZone(zone, createMembership("Елена", "Смирнова", 1992));
        fitnessClub.enterFitnessZone(zone, createMembership("Мария", "Кузнецова", 1987));
        fitnessClub.enterFitnessZone(zone, createMembership("Дмитрий", "Попов", 1975));
        fitnessClub.enterFitnessZone(zone, createMembership("Ольга", "Васильева", 1983));
        fitnessClub.enterFitnessZone(zone, createMembership("Андрей", "Петров", 1990));
        fitnessClub.enterFitnessZone(zone, createMembership("Светлана", "Михайлова", 1979));
        fitnessClub.enterFitnessZone(zone, createMembership("Виктор", "Морозов", 1988));
        fitnessClub.enterFitnessZone(zone, createMembership("Евгений", "Новиков", 1982));
        fitnessClub.enterFitnessZone(zone, createMembership("Анна", "Федорова", 1976));
        fitnessClub.enterFitnessZone(zone, createMembership("Наталья", "Макарова", 1991));
        fitnessClub.enterFitnessZone(zone, createMembership("Сергей", "Николаев", 1984));
        fitnessClub.enterFitnessZone(zone, createMembership("Алексей", "Козлов", 1977));
        fitnessClub.enterFitnessZone(zone, createMembership("Екатерина", "Ильина", 1989));
        fitnessClub.enterFitnessZone(zone, createMembership("Ирина", "Степанова", 1981));
        fitnessClub.enterFitnessZone(zone, createMembership("Максим", "Крылов", 1974));
        fitnessClub.enterFitnessZone(zone, createMembership("Олег", "Алексеев", 1993));
        fitnessClub.enterFitnessZone(zone, createMembership("Татьяна", "Куликова", 1973));
        fitnessClub.enterFitnessZone(zone, createMembership("Иван", "Смирнов", 1980));
        fitnessClub.enterFitnessZone(zone, createMembership("Павел", "Иванов", 1985));
        fitnessClub.enterFitnessZone(zone, createMembership("Егор", "Сидоров", 1978));
        fitnessClub.enterFitnessZone(zone, createMembership("Ольга", "Смирнова", 1992));
        fitnessClub.enterFitnessZone(zone, createMembership("Марина", "Кузнецова", 1987));
        fitnessClub.enterFitnessZone(zone, createMembership("Денис", "Попов", 1975));
        fitnessClub.enterFitnessZone(zone, createMembership("Евгения", "Васильева", 1983));
        fitnessClub.enterFitnessZone(zone, createMembership("Антон", "Петров", 1990));
        fitnessClub.enterFitnessZone(zone, createMembership("Анжелика", "Михайлова", 1979));
        fitnessClub.enterFitnessZone(zone, createMembership("Владислав", "Морозов", 1988));
        fitnessClub.enterFitnessZone(zone, createMembership("Маргарита", "Новикова", 1982));
        fitnessClub.enterFitnessZone(zone, createMembership("Григорий", "Федоров", 1976));
        fitnessClub.enterFitnessZone(zone, createMembership("Маргарита", "Макарова", 1991));
        fitnessClub.enterFitnessZone(zone, createMembership("Артем", "Николаев", 1984));
        fitnessClub.enterFitnessZone(zone, createMembership("Лариса", "Козлова", 1977));
        fitnessClub.enterFitnessZone(zone, createMembership("София", "Ильина", 1989));
        fitnessClub.enterFitnessZone(zone, createMembership("Екатерина", "Степанова", 1981));
        fitnessClub.enterFitnessZone(zone, createMembership("Марина", "Крылова", 1974));
        fitnessClub.enterFitnessZone(zone, createMembership("Игорь", "Алексеев", 1993));
        fitnessClub.enterFitnessZone(zone, createMembership("Татьяна", "Куликова", 1973));
        fitnessClub.enterFitnessZone(zone, createMembership("вв", "вв", 1974));
    }

    private static Membership createMembership(String firstName, String lastName, int birthYear) {
        Customer customer = new Customer(firstName, lastName, birthYear);
        LocalDate registrationDate = LocalDate.now();
        LocalDate expiryDate = registrationDate.plusMonths(1); //  абонемент на месяц
        return new Membership(customer, registrationDate, expiryDate);
    }
}