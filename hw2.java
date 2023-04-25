import java.util.LinkedHashMap;
import java.util.Map;
import java.io.FileWriter;
import java.util.Arrays;

public class hw2 {
// // Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} 
    // public static void main(String[] args) {
    //     Map<String, String> value = new LinkedHashMap<>();
    //     value.put("name","Ivanov");
    //     value.put("country","Russia");
    //     value.put("city","Mosсow");
    //     value.put("age",null);
    //     System.out.println(getQuery(value));
    // }

    // public static String getQuery(Map<String, String> sql) {
    //     StringBuilder result = new StringBuilder();
    //     if (sql == null || sql.isEmpty())
    //         return result.toString();

    //     for (Map.Entry<String, String> couple : sql.entrySet()) {
    //         if (couple.getKey() == null || couple.getValue() == null)
    //             continue;

    //         result.append(couple.getKey()).append(" = '").append(couple.getValue()).append("' and ");
    //     }

    //     if (result.length() > 5)
    //         result.delete(result.length() - 5, result.length());

    //     return result.toString();
    // }
    // }
    

// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

public static void main(String[] args) {

        StringBuilder bubble = new StringBuilder();
        int[] array = {4, 2, 7, 0, 4, 9, 2, 0, 8, 4};
        int temp;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
                bubble.append(Arrays.toString(array)).append("\n");
                try {
                    FileWriter file = new FileWriter("log_for_hw2.txt", false);
                    file.write(bubble.toString());
                    file.close();
                } catch (Exception e) {
                    System.out.println("Ошибка");
                }  
            }
        }
    }
}
