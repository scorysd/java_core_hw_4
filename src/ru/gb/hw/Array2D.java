package ru.gb.hw;

public abstract class Array2D {
    protected String[][] array;
    protected int width;
    protected int height;

    /**
     * Метод вывода 2-мерного массива
     */
    public void PrintArray2D() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print(" " + this.array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Метод проверки 2-мерного массива строк на возможность преобразования строк в числа, а также
     * подсчета суммы всех элементов в массиве в вывода результата
     * @throws MyArrayDataException - проброс исключения в случае невозможности каста строк в числа
     */
    public void SumOfArray() throws MyArrayDataException {
        int res = 0;
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                try {
                    this.array[i][j] = String.valueOf(Integer.parseInt(this.array[i][j]));
                    res += Integer.parseInt(this.array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверный символ!", i, j);
                }
            }
        }
        System.out.println("Удачная генерация!");
        System.out.printf("Сумма всех элементов массива = %d", res);
    }
}