public class task3 {
    public static void main(String[] args) {
        // Заданное уравнение
        String equation = "2? + ?5 = 69";
        solveEquation(equation);
    }

    public static void solveEquation(String equation) {
        // Разделение уравнения на части (q, w, e)
        String[] parts = equation.split("[+=]");
        String qPart = parts[0].trim();
        String wPart = parts[1].trim();
        String ePart = parts[2].trim();

        // Перебор всех возможных значений от 0 до 9 для заменяемых знаков вопроса
        for (int q = 0; q <= 9; q++) {
            for (int w = 0; w <= 9; w++) {
                // Копирование и замена знаков вопроса в уравнении
                String eq = equation.replace("?", String.valueOf(q)).replace("?", String.valueOf(w));

                // Вычисление значения e с учетом замененных значений q и w
                int e = Integer.parseInt(ePart);
                eq = eq.replace(qPart, String.valueOf(q)).replace(wPart, String.valueOf(w));
                try {
                    e = eval(eq);
                } catch (Exception ex) {
                    continue; // Пропустить комбинацию, если не удалось вычислить выражение
                }

                // Проверка условия задачи
                if (e == q + w) {
                    System.out.println("Решение найдено: " + eq);
                    return;
                }
            }
        }

        System.out.println("Решение не найдено.");
    }

    // Метод для вычисления значения арифметического выражения
    public static int eval(String expression) throws Exception {
        return (int) new javax.script.ScriptEngineManager()
                .getEngineByName("js")
                .eval(expression);
    }
}