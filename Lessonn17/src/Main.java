public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];// // создан и проинициализирован массив стандартным способом.
        // Каждая ячейка внутри
        // массива numbers имеет значение 0.
        int[] anotherNumbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};

        System.out.println(numbers.length);
        System.out.println(anotherNumbers.length);
        System.out.println("----------------------------");
        System.out.println(numbers[1]);
        System.out.println(anotherNumbers[1]);
        System.out.println("----------------------------");
        System.out.println(numbers[numbers.length - 1]);
        System.out.println(anotherNumbers[anotherNumbers.length - 1]);
        System.out.println("----------------------------");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2; // мы МОЖЕМ менять элементы,
            // то есть мы можем
            // ЗАПИСЫВАТЬ элементы (read/write)

        }
        for (int n: numbers) {
            System.out.println(n);
        }
    }
}
