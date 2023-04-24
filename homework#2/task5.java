import java.io.*;
import java.net.URL;
import java.util.logging.*;

public class task5 {
    private static final Logger logger = Logger.getLogger(task5.class.getName());

    public static void main(String[] args) {
        try {
            String url = "https://raw.githubusercontent.com/aksodar/JSeminar_2/master/src/main/resources/example.txt"; // URL файла для скачивания
            String name = "Александр"; // Ваше имя для подстановки
            String localFilePath = "downloaded_file.txt"; // Путь к сохраненному файлу

            // Шаг 1: Скачивание файла и получение его содержимого
            String fileContent = downloadFile(url);

            // Шаг 2: Изменение содержимого файла
            fileContent = replaceName(fileContent, name);

            // Шаг 3: Сохранение файла локально
            saveFile(localFilePath, fileContent);

            // Шаг 4: Чтение сохраненного файла и вывод его содержимого в логгер
            String savedFileContent = readFile(localFilePath);
            logger.info("Содержимое сохраненного файла:");
            logger.info(savedFileContent);

            // Шаг 5: Удаление сохраненного файла
            deleteFile(localFilePath);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Ошибка: " + e.getMessage(), e);
        }
    }

    // Метод для скачивания файла и возврата его содержимого в виде строки
    public static String downloadFile(String url) throws IOException {
        URL fileUrl = new URL(url);
        BufferedReader reader = new BufferedReader(new InputStreamReader(fileUrl.openStream()));
        String line;
        StringBuilder content = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        reader.close();
        return content.toString();
    }

    // Метод для замены маски "%s" на указанное имя в строковом содержимом файла
    public static String replaceName(String fileContent, String name) {
        return fileContent.replaceAll("%s", name);
    }

    // Метод для сохранения файла локально
    public static void saveFile(String localFilePath, String fileContent) throws IOException {
        FileWriter writer = new FileWriter(localFilePath);
        writer.write(fileContent);
        writer.close();
    }

    // Метод для чтения содержимого файла и возврата его в виде строки
    public static String readFile(String localFilePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(localFilePath));
        String line;
        StringBuilder content = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        reader.close();
        return content.toString();
    }

    // Метод для удаления файла
    public static void deleteFile(String localFilePath) {
        File file = new File(localFilePath);
        if (file.delete()) {
            logger.info("Файл успешно удален: " + localFilePath);
        } else {
            logger.warning("Не удалось удалить файл: " + localFilePath);
        }
    }
}