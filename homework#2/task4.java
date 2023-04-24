import java.io.*;
import java.util.logging.*;

public class task4 {
    private static final Logger logger = Logger.getLogger(task4.class.getName());

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
            // Ввод числа в формате byte
            System.out.print("Введите число в формате byte: ");
            byte number = Byte.parseByte(reader.readLine());

            // Запись числа в файл
            FileWriter writer = new FileWriter("result.txt");
            writer.write(String.valueOf(number));
            writer.close();
            
            System.out.println("Число успешно записано в файл \"result.txt\".");
        } catch (NumberFormatException e) {
            logger.log(Level.SEVERE, "Ошибка: Введено некорректное число. Ожидается число в формате byte.", e);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Ошибка при записи числа в файл.", e);
        }
    }
}