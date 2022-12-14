/*
Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */

import java.util.HashMap;
import java.util.Map;

public class task_01 {
    public static void main(String[] args) {
//        {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("name", "Ivanov");
        dictionary.put("country", "Russia");
        dictionary.put("city", "Moscow");
        dictionary.put("age", "Null");

        for (Map.Entry<String, String> item : dictionary.entrySet()) {
            if (item.getValue() != "Null") {
                System.out.println(item.getKey() + " = " + item.getValue());
            }
        }
    }
}
