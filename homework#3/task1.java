import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        // Создаем произвольный список целых чисел
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Исходный список чисел: " + numbers);

        // Удаляем четные числа
        removeEvenNumbers(numbers);

        System.out.println("Список чисел после удаления четных чисел: " + numbers);
    }

    // Метод для удаления четных чисел из списка
    public static void removeEvenNumbers(List<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
    }
}