import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод количества элементов массива
        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();

        // Ввод элементов массива
        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Нахождение суммы элементов с четными индексами
        int sum = 0;
        System.out.print("Числа с четными индексами: ");
        for (int i = 0; i < n; i += 2) {
            sum += arr[i];
            System.out.print(arr[i] + " ");
        }

        // Вывод суммы элементов с четными индексами
        System.out.println("\nСумма элементов с четными индексами: " + sum);

        scanner.close();
    }
}