import java.util.LinkedList;
import java.util.Iterator;

public class task3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int sum = 0;

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            sum += value;
        }

        System.out.println("Сумма элементов списка: " + sum);
    }
}