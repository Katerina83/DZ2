package homework1.lessonMassivy;
import java.util.Arrays;
public class lessonMassivy {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args){
        task1();
        task2();
        task3();
        task4();
        task5();
      }

    private static void task1() {
        int[] costs = new int[30];
        int sum = 0;
        for (int element: generateRandomArray()) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    private static void task2() {
        Arrays.sort(generateRandomArray());
        System.out.println("Минимальная сумма трат за день составила " + generateRandomArray()[0] + " рублей. Максимальная сумма трат за день составила " + generateRandomArray()[generateRandomArray().length - 1] + " рублей.");
    }

    private static void task3(){
        int[] costs = new int[30];
        int sum = 0;
        for (int element: generateRandomArray()) {
            sum += element;
        }
        double averageMonthlyAmount = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageMonthlyAmount + " рублей.");
    }

    private static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
                    System.out.print(reverseFullName[i]);
        }
    }

    private static void task5() {
        System.out.println();
        int [][] matrix = {{1,0,1}, {0,1,0}, {1,0,1}};
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}



