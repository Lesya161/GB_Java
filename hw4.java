import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

// Реализовать консольное приложение, которое:

// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.
// Если введено exit, завершаем программу
// Пример:
// java
// python
// c#
// print > [c#, python, java]
// revert
// print > [python, java]
// kotlin
// print > [kotlin, python, java]
// revert
// revert
// revert
// print > []
// revert > Ошибка!
// exit -> (Программа завершилась)

public class hw4 {
    public static void main(String[] args) {
            List<String> linkedList = new LinkedList<>();
            Scanner scanner = new Scanner(System.in);
            String temp = "";
            while (!temp.toLowerCase().equals("quit")) {
                System.out.println("Введите :");
                temp = scanner.nextLine();
                if (temp.toLowerCase().equals("print")) {
                    Collections.reverse(linkedList);
                    System.out.println(linkedList);
                    Collections.reverse(linkedList);
                } else if (temp.toLowerCase().equals("revert")) {
                    if (!linkedList.isEmpty()) {
                        linkedList.remove(linkedList.size() - 1);
                    } else {
                        System.out.println("Список пуст.");
                    }
                } else {
                    linkedList.add(temp);
                }
                if (temp.toLowerCase().equals("exit")) {
                    break;
                }
            }
            scanner.close();
        }
    
    }
    
