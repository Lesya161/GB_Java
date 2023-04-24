import java.util.Scanner;

/**
 * hw1
 */
// public class hw1 {

//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);

//         print("Введите n: ");
//         int n = iScanner.nextInt();
//         int summa = 0;
//         int factorial = 1;
//         iScanner.close();

//         for (int i = 1; i <= n; i++) {
//             summa = summa + i;
//          }
//          for (int i = 1; i <= n; i++) {
//              factorial = factorial * i;
//          }

//          print(String.valueOf(summa));
//          print(String.valueOf(factorial));

//     }

   // Вывести все простые числа от 1 до 1000

/**
 * hw1
 */
// public class hw1 {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         print("Введите n: ");
//         int n = iScanner.nextInt();
//         iScanner.close();

//         for (int i = 1; i < n+1; i++) {
//             int count = 0;
//             for (int j = 1; j <= i; j++) {
//                 if (i % j == 0) {
//                     count = count + 1;
//                 }
//             }
//             if (count == 2){
//                 print(i + " ");
//             }
//         }
//     }


    // Реализовать простой калькулятор

/**
 * hw1
 */
// public class hw1 {

//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         print("Введите первое число: ");
//         int n1 = iScanner.nextInt();
//         print("Введите операцию: ");
//         String op = iScanner.nextLine();
//         print("Введите второе число: ");
//         int n2 = iScanner.nextInt();

//         iScanner.close();

//         int res = calculator(op, n1, n2);
//         print(String.valueOf(res));
//     }

//     static int calculator(String op, int n1, int n2) {
//         int result = 0;
//         switch (op) {
//             case "+":
//                 result = n1 + n2;
//                 break;
//             case "-":
//                 result = n1 - n2;
//                 break;
//             case "*":
//                 result = n1 * n2;
//                 break;
//             case "/":
//                 result = n1 / n2;
//                 break;
//             default:
//                 print("Введите корректное значение!");
//             }
            
//         return result;

//     }



private static void print(String str){
    System.out.println(str);
}
}