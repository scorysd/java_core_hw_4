package ru.gb.hw;

import java.util.Random;

public class CreateArray2D extends Array2D {
    /**
     * Класс, создающий и заполняющий 2-мерный массив псевдослучайными символами, преобразовывая их предварительно
     * в строки. Значения псевдослучайных чисел взяты из таблицы ASCII
     * @param width - ширина 2-мерного массива
     * @param height - высота 2-мерного массива
     * @throws MyArraySizeException - пробросит исключение в случае ввода неправильной размерности массива.
     * Принимается только 4х4
     */
    public CreateArray2D(int width, int height) throws MyArraySizeException {
        if (height != 4) {
            throw new MyArraySizeException("Неверная высота массива!", width, height);
        }
        if (width != 4) {
            throw new MyArraySizeException("Неверная ширина массива!", width, height);
        } else {
            Random rnd = new Random();
            super.array = new String[super.height = height][super.width = width];
            for (int i = 0; i < super.height; i++) {
                for (int j = 0; j < super.width; j++) {
                    int rand = rnd.nextInt(57 - 47) + 1 + 46;
                    super.array[i][j] = String.valueOf((char) rand);
                }
            }
        }
    }
}