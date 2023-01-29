package Java_homework_2;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Task4 {
    public static void main(String[] args) throws SecurityException, IOException {
        Logger log = Logger.getLogger(Task4.class.getName());

        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.print("Введите первое число: ");
        Integer firstNum = scanner.nextInt();
        System.out.print("Введите операцию (+, -, *, /): ");
        scanner = new Scanner(System.in, "Cp866");
        String operation = scanner.nextLine();
        System.out.print("Введите второе число: ");
        scanner = new Scanner(System.in, "Cp866");
        Integer secondNum = scanner.nextInt();
        scanner.close();

        switch (operation)
        {
            case ("+"):
                log.info(firstNum + " " + operation + " " + secondNum + " = " + (firstNum+secondNum));
                break;
            case ("-"):
                log.info(firstNum + " " + operation + " " + secondNum + " = " + (firstNum-secondNum));
                break;
            case ("*"):
                log.info(firstNum + " " + operation + " " + secondNum + " = " + (firstNum*secondNum));
                break;
            case ("/"):
                log.info(firstNum + " " + operation + " " + secondNum + " = " + (firstNum/secondNum));
                break;
            default:
                log.info("Operation is not available!");
        }
    }
}
