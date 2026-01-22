import java.util.ArrayList;
import java.util.Scanner;

public class zadachi {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Меню:");
            System.out.println("1 Показать задачи");
            System.out.println("2 Добавить задачу");
            System.out.println("3 Удалить задачу");
            System.out.println("0 Выход");
            System.out.print("Ввод: ");

            choice = Integer.parseInt(scanner.nextLine());

            if (choice == 1) {
                if (tasks.isEmpty()) {
                    System.out.println("Нет задач");
                } else {
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                }
            } else if (choice == 2) {
                System.out.print("Ввод задачи: ");
                String task = scanner.nextLine();
                tasks.add(task);
            } else if (choice == 3) {
                if (tasks.isEmpty()) {
                    System.out.println("Нет задач");
                } else {
                    System.out.print("Номер задачи которую нужно удалить: ");
                    int num = Integer.parseInt(scanner.nextLine());
                    if (num >= 1 && num <= tasks.size()) {
                        tasks.remove(num - 1);
                        System.out.println("Задача удалена");
                    } else {
                        System.out.println("Неверный номер");
                    }
                }
            } else if (choice == 0) {
                System.out.println("Выход");
            }
        }
        scanner.close();
    }
}