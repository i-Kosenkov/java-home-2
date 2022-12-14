import java.io.*;
import java.util.Objects;
import java.util.Scanner;

/*
Дана json строка (sample.json)
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */
public class task_03 {
    public static void main(String[] args) throws Exception {
        FileReader file = new FileReader("sample.json");
        Scanner scan = new Scanner(file);
        String name = null, mark = null, lesson = null;
        StringBuilder result = new StringBuilder();
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            line = line.replaceAll("[,{\"\\[\\]}]", "");
            String[] cols = line.split(":");
            if (Objects.equals(cols[0], "фамилия")) {
                name = cols[1];
            }
            if (Objects.equals(cols[0], "оценка")) {
                mark = cols[1];
            }
            if (Objects.equals(cols[0], "предмет")) {
                lesson = cols[1];
                result = new StringBuilder("Студент " + name + " получил " + mark + " по предмету " + lesson);
                System.out.println(result);
            }
        }
        file.close();
    }
}