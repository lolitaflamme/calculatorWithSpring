package bean.impl;

import aop.LogAnnotation;
import bean.api.ConsoleReader;

import java.util.Scanner;

public class ConsoleReaderImpl implements ConsoleReader {
    @LogAnnotation
    @Override
    public double getNumber() {
        double number = 0;
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
        } else {
            System.out.println("You have to enter a number. Retry please");
            number = getNumber();
        }
        return number;
    }

    @LogAnnotation
    @Override
    public char getOperation() {
        char operation = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the operation");
        operation = scanner.next().charAt(0);
        return operation;
    }
}
