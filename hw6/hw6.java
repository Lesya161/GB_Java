/**
 * hw6
 */

 import java.util.HashMap;
 import java.util.HashSet;
 import java.util.List;
 import java.util.Map;
 import java.util.Scanner;
 import java.util.Set;
 
 public class hw6 {


       public static void main(String[] args) {
          note laptop1 = new note("Samsung", "8", "1000", "Windows", "white");
          note laptop2 = new note("Asus", "4", "1000", "Lunex", "black");
          note laptop3 = new note("Toshiba", "6", "2000", "Windows", "blue");
          note laptop4 = new note("Digma", "8", "1000", "Windows", "grey");
      
    
          Set<note> laptops = new HashSet<>(List.of(laptop1, laptop2,
          laptop3, laptop4));
    
          Map<String, String> sel = selectCriteria();
          sort(sel, laptops);
    
       }
    
       public static String scanner() {
          Scanner scanner = new Scanner(System.in);
          String scan = scanner.nextLine();
          return scan;
       }
    
       public static Map<String, String> selectCriteria() {
          Map<String, String> resultCriterias = new HashMap<>();
          while (true) {
             System.out.println("Вы хотите выбрать критерий? Если да введите 'y', если нет введите 'n'");
             String question = scanner();
             if (question.equals("n")) {
                break;
             } else {
    
                System.out.println(
                      "Введите цифру, соответствующую необходимому критерию: \n 1 - Название \n 2 - ОЗУ \n 3 - Объем ЖД \n 4 - Операционная система \n 5 - Цвет");
                String key = scanner();
                System.out.println("Введите значения для выбранного критерия: ");
                String value = scanner();
    
                resultCriterias.put(key, value);
             }
          }
          System.out.println(resultCriterias);
          return resultCriterias;
    
       }
    
       public static void sort(Map<String, String> criterias, Set<note> notebooks) {
    
          Set<note> temp = new HashSet<>(notebooks);
          for (note notebook : notebooks) {
    
             for (Object pair : criterias.keySet()) {
    
                if (pair.equals("1") && !notebook.getName().equals(criterias.get(pair))) {
                   temp.remove(notebook);
                }
                for (Object pair1 : criterias.keySet()) {
    
                   if (pair1.equals("2") && !notebook.getRam().equals(criterias.get(pair1))) {
                      temp.remove(notebook);
    
                   }
                   for (Object pair2 : criterias.keySet()) {
    
                      if (pair2.equals("3") && !notebook.getHardDisk().equals(criterias.get(pair2))) {
                         temp.remove(notebook);
    
                      }
                      for (Object pair3 : criterias.keySet()) {
    
                         if (pair3.equals("4") && !notebook.getOperatingSystem().equals(criterias.get(pair3))) {
                            temp.remove(notebook);
    
                         }
                         for (Object pair4 : criterias.keySet()) {
    
                            if (pair4.equals("5") && !notebook.getColour().equals(criterias.get(pair4))) {
                               temp.remove(notebook);
    
                            }
                         }
                      }
                   }
                }
             }
    
          }
          if (temp.isEmpty()) {
             System.out.println("По введенным критериям ничего не найдено!");
          } else {
             System.out.println("Вот что мы можем предложить: \n" + temp.toString());
          }
    
       }
    
    }