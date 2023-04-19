public class task1 {
    public static void main(String[] args) {
        int n = 5; // Задаем значение n для вычисления треугольного числа и факториала
        System.out.println("Треугольное число " + n + " = " + calculateTriangleNumber(n));
        System.out.println(n + "! = " + calculateFactorial(n));

        System.out.println("Простые числа от 1 до 1000:");
        printPrimeNumbers(1, 1000);
    }

    // Метод для вычисления треугольного числа
    public static int calculateTriangleNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Метод для вычисления факториала числа
    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Метод для проверки, является ли число простым
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Метод для вывода простых чисел от start до end
    public static void printPrimeNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}