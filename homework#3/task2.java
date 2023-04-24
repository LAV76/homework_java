import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        // Создаем список целых чисел
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(7);
        numbers.add(1);

        System.out.println("Список чисел: " + numbers);

        // Находим минимальное и максимальное значения
        Integer min = Collections.min(numbers);
        Integer max = Collections.max(numbers);

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);

        // Находим среднее арифметическое значение
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.size();

        System.out.println("Среднее арифметическое значение: " + average);
    }
}