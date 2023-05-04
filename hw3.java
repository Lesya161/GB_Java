// 1.Реализовать алгоритм сортировки слиянием




import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
// 2.Пусть дан произвольный список целых чисел, удалить из него чётные числа

public class hw3 {
    public static void main(String[] args) {
//         Random rnd = new Random();
//         ArrayList<Integer> array = new ArrayList<Integer>();
//         for (int i = 0; i < 10; i++) {
//             int value = rnd.nextInt(-100, 100);
//             array.add(value);
//         }
//         System.out.printf(" %s\n", array);
//         int i = 0;
//         while (i < array.size()) {
//             if (array.get(i) % 2 == 0) {
//                 array.remove(i);
//             }
//             else {
//                 i++;
//             }
//         }
//         System.out.printf(" %s", array);
//     }
// }


// 3.Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка



        Scanner iScanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
      

        System.out.println("Введите число");
        int input = 1;
        while (input != 0) {
            input = iScanner.nextInt();
            if (input != 0) {
                list.add(input);
            }

        }
        iScanner.close();
        int min = list.get(0);
        int max = list.get(0);
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            if (current < min) {
                min = current;
            }
            if (current > max) {
                max = current;
            }
            sum += current;
        }
        double average = sum / list.size();
        System.out.println("Минимальное: " + min + ", максимальное: " + max + ", среднее: " + average);
    }
}