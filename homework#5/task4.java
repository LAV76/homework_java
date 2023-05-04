public class EightQueens {

    private static final int BOARD_SIZE = 8;
    private static final char QUEEN_SYMBOL = 'Q';
    private static final char EMPTY_SYMBOL = '_';

    // Расположение ферзей в виде массива координат
    private static int[] queens = new int[BOARD_SIZE];

    // Счетчик количества решений
    private static int solutionCount = 0;

    // Рекурсивная функция для расстановки ферзей на доске
    private static void placeQueens(int row) {
        if (row == BOARD_SIZE) { // Успешно расставили всех ферзей, сохраняем решение
            solutionCount++;
            printBoard();
            return;
        }

        for (int col = 0; col < BOARD_SIZE; col++) {
            boolean safe = true;

            // Проверяем, не бьет ли новый ферзь уже стоящих
            for (int i = 0; i < row; i++) {
                int otherCol = queens[i];

                if (col == otherCol || row - i == Math.abs(col - otherCol)) {
                    safe = false;
                    break;
                }
            }

            // Если новый ферзь безопасен, ставим его на доску и продолжаем рекурсию
            if (safe) {
                queens[row] = col;
                placeQueens(row + 1);
            }
        }
    }

    // Вывод доски в консоль
    private static void printBoard() {
        System.out.println("Solution #" + solutionCount + ":");

        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                if (queens[row] == col) {
                    System.out.print(QUEEN_SYMBOL + " ");
                } else {
                    System.out.print(EMPTY_SYMBOL + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        placeQueens(0);
        System.out.println("Found " + solutionCount + " solutions.");
    }
}