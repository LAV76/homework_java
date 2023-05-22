import java.util.*;

public class Notebook {
    private String brand;
    private int ram;
    private int storage;
    private String operatingSystem;
    private String color;

    public Notebook(String brand, int ram, int storage, String operatingSystem, String color) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    // Геттеры и сеттеры для полей

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Создание множества ноутбуков
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("Brand1", 8, 500, "OS1", "Red"));
        notebooks.add(new Notebook("Brand2", 16, 1000, "OS2", "Blue"));
        notebooks.add(new Notebook("Brand3", 8, 500, "OS1", "Black"));
        notebooks.add(new Notebook("Brand4", 16, 2000, "OS3", "Silver"));

        // Фильтрация и вывод ноутбуков по критериям
        Map<Integer, Object> filters = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объём ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        System.out.println("0 - Выход");

        int criterion;
        do {
            System.out.print("Введите цифру: ");
            criterion = scanner.nextInt();
            if (criterion == 0) {
                break;
            }

            System.out.print("Введите минимальное значение: ");
            Object value;
            if (criterion == 1 || criterion == 2) {
                value = scanner.nextInt();
            } else {
                scanner.nextLine();
                value = scanner.nextLine();
            }

            filters.put(criterion, value);
        } while (true);

        List<Notebook> filteredNotebooks = filterNotebooks(notebooks, filters);

        System.out.println("Результаты фильтрации:");
        for (Notebook notebook : filteredNotebooks) {
            System.out.println(notebook);
        }
    }

    public static List<Notebook> filterNotebooks(Set<Notebook> notebooks, Map<Integer, Object> filters) {
        List<Notebook> filteredNotebooks = new ArrayList<>();

        for (Notebook notebook : notebooks) {
            boolean passFilter = true;

            for (Map.Entry<Integer, Object> entry : filters.entrySet()) {
                int criterion = entry.getKey();
                Object value = entry.getValue();

                if (!matchesCriterion(notebook, criterion, value)) {
                    passFilter = false;
                    break;
                }
            }

            if (passFilter) {
                filteredNotebooks.add(notebook);
            }
        }

        return filteredNotebooks;
    }

    private static boolean matchesCriterion(Notebook notebook, int criterion, Object value) {
        switch (criterion) {
            case 1:
                return notebook.getRam() >= (int) value;
            case 2:
                return notebook.getStorage() >= (int) value;
            case 3:
                return notebook.getOperatingSystem().equalsIgnoreCase((String) value);
            case 4:
                return notebook.getColor().equalsIgnoreCase((String) value);
            default:
                return false;
        }
    }
}