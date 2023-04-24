import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task3 {
    public static void main(String[] args) {
        // Создаем список названий планет
        List<String> planetList = new ArrayList<>();
        planetList.add("Меркурий");
        planetList.add("Венера");
        planetList.add("Земля");
        planetList.add("Марс");
        planetList.add("Юпитер");
        planetList.add("Сатурн");
        planetList.add("Уран");
        planetList.add("Нептун");
        planetList.add("Плутон"); // Плутон уже не считается планетой, но включим его в список

        // Добавляем повторения в список
        planetList.add("Земля");
        planetList.add("Марс");
        planetList.add("Юпитер");

        System.out.println("Список планет: " + planetList);

        // Создаем Map для подсчета количества повторений
        Map<String, Integer> planetCountMap = new HashMap<>();
        for (String planet : planetList) {
            if (planetCountMap.containsKey(planet)) {
                planetCountMap.put(planet, planetCountMap.get(planet) + 1);
            } else {
                planetCountMap.put(planet, 1);
            }
        }

        // Выводим названия планет и количество повторений
        for (String planet : planetCountMap.keySet()) {
            System.out.println("Планета: " + planet + ", Количество повторений: " + planetCountMap.get(planet));
        }
    }
}