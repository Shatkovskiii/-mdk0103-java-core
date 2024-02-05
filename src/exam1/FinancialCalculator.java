package exam1;

import java.util.Scanner;



public class FinancialCalculator {

    private static final int[] expenses = new int[30 + 1];
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            printMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    enterExpenses();
                    break;
                case 2:
                    displayExpenses();
                    break;
                case 3:
                    displayMaxExpenseDay();
                    break;
                case 0:
                    System.out.println("благодарим за использование программы, спасибо!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n" + "неправильный выбор. Пожалуйста, сделайте новый.");
            }
        } while (choice != 0);
    }

    private static void printMenu() {
        System.out.println("""
                Меню:
                1 – в какой день ввести траты
                2 – общие траты за месяц
                3 – самая большая сумма за месяц
                0 – выход""");
        System.out.print("ыыберите пункт меню: ");
    }

    private static void enterExpenses() { //ввести расходы за день
        System.out.print("Введите день (от 1 до 30): ");
        int day = scanner.nextInt();

        if (day < 1 || day > 30){
            System.out.println("неправильный выбор. пожалуйста, сделайте новый.");
            return;
        }

        if (expenses[day] > 0) {
            System.out.print("за " + day + " день уже указана сумма " + expenses[day] +
                    " руб. хотите перезаписать? (1 – Да, 0 – Нет): ");
            int overwriteChoice = scanner.nextInt();
            if (overwriteChoice == 0) {
                return;
            }
        }

        System.out.print("введите сумму трат за " + day + " день: ");
        int amount = scanner.nextInt();

        expenses[day] = amount;


        System.out.print("[хотите ввести траты за другой день? (1 – Да, 0 – Вернуться в меню): ");
        int continueChoice = scanner.nextInt();
        if (continueChoice == 1) {
            enterExpenses();
        }
    }


    private static void displayExpenses() { //отображение трат за месяц
        System.out.println("траты за месяц:");
        for (int day = 1; day <= 30; day++) {
            System.out.println(day+ " день – " + expenses[day] + " руб");
        }
        System.out.println();
    }

    private static void displayMaxExpenseDay() { //самая большая трата за месяц
        int maxExpense = 0;
        int maxExpenseDay = 0;

        for (int day = 1; day <= 30; day++) {
            if (expenses[day] > maxExpense) {
                maxExpense = expenses[day];
                maxExpenseDay = day;
            }
        }

        System.out.println("самая большая сумма за месяц:");
        System.out.println(maxExpenseDay + " день – " + maxExpense + " руб\n");
    }
}
