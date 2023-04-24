import java.io.*;
import java.util.*;

public class tsak3{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));

        // Ввод количества строк в книге
        System.out.print("Введите количество строк в книге: ");
        int n = Integer.parseInt(reader.readLine());

        // Ввод строк книги
        System.out.println("Введите строки книги:");
        String[] cookbook = new String[n];
        for (int i = 0; i < n; i++) {
            cookbook[i] = reader.readLine();
        }

        // Ввод количества продуктов, на которые у человека аллергия
        System.out.print("Введите количество продуктов, на которые у человека аллергия: ");
        int m = Integer.parseInt(reader.readLine());

        // Создание словаря для хранения замен продуктов
        Map<String, String> replacements = new HashMap<>();
        System.out.println("Введите замены продуктов:");
        for (int i = 0; i < m; i++) {
            String[] replacement = reader.readLine().split(" - ");
            replacements.put(replacement[0], replacement[1]);
        }

        // Замена продуктов в книге
        for (int i = 0; i < n; i++) {
            String[] words = cookbook[i].split(" ");
            for (int j = 0; j < words.length; j++) {
                if (replacements.containsKey(words[j])) {
                    words[j] = replacements.get(words[j]);
                }
            }
            cookbook[i] = String.join(" ", words);
        }

        // Вывод измененных строк книги
        System.out.println("Измененные строки книги Васи:");
        for (String line : cookbook) {
            System.out.println(line);
        }
    }
}