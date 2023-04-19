
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Простой калькулятор");

        // Ввод первого числа
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        // Ввод второго числа
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        // Ввод операции
        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.print("Введите номер операции: ");
        int operation = scanner.nextInt();

        // Выполнение операции и вывод результата
        double result = 0.0;
        switch (operation) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль!");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Ошибка: неверный номер операции!");
                return;
        }

        System.out.println("Результат: " + result);

        scanner.close();
    }
}
