package ru.gb.hw;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws MyArrayException {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nВведите высоту и ширину 2-мерного массива:");
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            try {
                Array2D arr = new CreateArray2D(w, h);
                arr.PrintArray2D();
                arr.SumOfArray();
                break;
            } catch (MyArraySizeException e) {
                System.out.printf("%s Вы ввели %d на %d", e.getMessage(), e.getHeight(), e.getWidth());
            } catch (MyArrayDataException e) {
                System.out.printf("%s Обратите внимание на позицию %d на %d",
                        e.getMessage(), e.getHeight() + 1, e.getWidth() + 1);
            }
        }
    }
}
