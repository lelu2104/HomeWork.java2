package ru.geekbrains;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        try {
            String str = "10 3 1 2 \n2 five 2 2 \n5 6 7 1 \n300 3 1 0"; // исходные данные, строка
            transformStrInArray(str);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }
    public static int transformStrInArray(String x)  {
        String[] array = x.split("\n"); // создаём одномерный массив из четырёх строк
            System.out.println(Arrays.toString(array));
            // выводим элементы одномерного массива построчно
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
            // делим каждую строку одномерного массива на одномерный массив
            String[] array0 = array[0].split(" ");
            System.out.println(Arrays.toString(array0));
            String[] array1 = array[1].split(" ");
            System.out.println(Arrays.toString(array1));
            String[] array2 = array[2].split(" ");
            System.out.println(Arrays.toString(array2));
            String[] array3 = array[3].split(" ");
            System.out.println(Arrays.toString(array3));
            String[][] readyArray = {array0, array1, array2, array3};
            System.out.println(Arrays.deepToString(readyArray));
            // получаем двумерный массив типа String
            for (int i = 0; i < readyArray.length; i++) {
                for (int j = 0; j < readyArray[i].length; j++) {
                    System.out.print(" " + readyArray[i][j] + " ");
                }
                System.out.println();
            }


        //перевод массива типа String в тип int

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите количество строк:");
            int a = sc.nextInt();
            System.out.println("Введите количество столбцов:");
            int y = sc.nextInt();
        int[][] intArray = new int[a][y];
        for (int i = 0; i < readyArray.length; i++) {
            for (int j = 0; j < readyArray[i].length; j++) {
                intArray[i][j] = Integer.parseInt(readyArray[i][j]);
//                throw new NumberFormatException("Не валидное значение в массиве");
            }
        }

        //сумма всех элементов массива
        int result = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                result += intArray[i][j];
            }
        }
        System.out.println(result);
        int result1 = result / 2;
        System.out.println(result1);
        return result1;
    }




}
