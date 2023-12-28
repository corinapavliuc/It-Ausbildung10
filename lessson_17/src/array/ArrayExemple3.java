package array;

import java.util.Scanner;

public class ArrayExemple3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите длину массива: ");
        int arraySize =scanner.nextInt();

        int[] intArray = new int[arraySize];

        int  minResultIndex=0;

        for (int i =0; i< intArray.length;i++) {
            System.out.println("введите" + i + "ый элнмент массива: ");
            intArray[i] = scanner.nextInt();

            }
        System.out.println("идет поиск минималнова злнмента");
        }


    }


