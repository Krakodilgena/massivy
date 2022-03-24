package ru.skypro;

public class Main {

    public static void main(String[] args) {
	//Задание 1
        int[] costs = generateRandomArray;
        int sum = 0;
        for (int i = 0; i < costs.length; i++) {
            sum += costs[i];
        }
        for (int cost : costs) {
            sum += cost;
        }
        System.out.println("Сумма трат за месяц " + sum + " рублей ");
    }

    public static void main(String[] args) {
        //Задание 2
        int[] costs = generateRandomArray;
        int min = costs[0];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < costs.length; i++) {
            if (min > costs[i]) {
                min = costs[i];
            }
            if (max < costs[i]) {
                max = costs[i];
            }
        }
        for (int cost : costs) {
            if (min > cost) {
                min = cost;
            }
            if (max < cost) {
                max = cost;
            }
        }
        System.out.println("Минимальная сумма трат за день " + min + "рублей. Максимальная сумма трат за день " + max + " рублей");
    }

    public static void main(String[] args) {
    //Задание 3
      int[] costs = generateRandomArray;
      int sum = 0;
      for (int cost : costs) {
          sum += cost;
      }
      double avg = (double) sum / costs.length;
      avg = sum / (costs.length * 1.0);

        System.out.println("Средняя сумма трат за месяц " + avg + " рублей");
    }

    public static void main(String[] args) {
    //Задание 4
      char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

      for (int i = reverseFullName.length - 1; i >= 0; i--) {
          System.out.println(reverseFullName[i]);
      }
        System.out.println();
    }

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
