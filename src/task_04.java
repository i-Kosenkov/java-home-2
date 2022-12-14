//Реализовать простой калькулятор
//лог пишется в файл log.log

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class task_04 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task_04.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh;
        fh = new FileHandler("log.log", true);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.setUseParentHandlers(false);

        Scanner input = new Scanner(System.in);

        //Калькулятор принимает 1-ое число, 2-ое число, знак операции (+ - * /),
        float a = getFloat("Input first number: ");
        logger.info("Введен символ " + a);
        float b = getFloat("Input second number: ");
        logger.info("Введен символ " + b);

        while (true) {
            System.out.print("Input sign (+, -, *, /): ");
            switch (input.nextLine()) {
                case ("+"):
                    System.out.println(a + " + " + b + " = " + (a + b));
                    logger.info("Введен символ +");
                    return;
                case ("-"):
                    System.out.println(a + " - " + b + " = " + (a - b));
                    logger.info("Введен символ -");
                    return;
                case ("*"):
                    System.out.println(a + " * " + b + " = " + (a * b));
                    logger.info("Введен символ *");
                    return;
                case ("/"):
                    System.out.println(a + " / " + b + " = " + (a / b));
                    logger.info("Введен символ /");
                    return;
                default:
                    System.out.println("Input error. Try again.");
            }
        }
//        input.close();
    }

    public static float getFloat(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        while (!input.hasNextFloat()) {
            System.out.println("Input error. Try again.");
            System.out.print(prompt);
            input.next();
        }
        return input.nextFloat();
    }
}

