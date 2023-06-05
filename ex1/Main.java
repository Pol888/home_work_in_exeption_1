package home_work_in_exeption.ex1;

import static home_work_in_exeption.ex1.Ex1.*;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[]{2, 5, 6, 1, 0};
        int [] array2 = new int[] {5, 6, 7, 5, 7, 2};
        //printingAnElementByArrayIndex(9, array); // несуществующий индекс

        //dividingTwoNumbers(1, 0); // деление на 0
//
        //creatingAnArray(-3); // количество элементов со знаком "-"

        //differenceInCells(array, array2); // 'Предупреждение'
        privateElements(array, array2); // Исключение


    }
}
