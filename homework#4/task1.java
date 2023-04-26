import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println("Исходный список: " + linkedList);
        LinkedList<Integer> reversedList = reverse(linkedList);
        System.out.println("Перевернутый список: " + reversedList);
    }

    public static <T> LinkedList<T> reverse(LinkedList<T> list) {
        LinkedList<T> reversedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}