public class task2 {
    public static void main(String[] args) {
        String s = "cba";
        int[] index = {2, 1, 0};
        String result = shuffleString(s, index);
        System.out.println("Результат: " + result);
    }

    public static String shuffleString(String s, int[] index) {
        char[] chars = s.toCharArray();
        char[] shuffled = new char[chars.length];

        // Проход по каждому символу в строке s
        for (int i = 0; i < chars.length; i++) {
            // Перемещение символа на позицию, указанную в массиве index
            shuffled[index[i]] = chars[i];
        }

        return new String(shuffled);
    }
}
