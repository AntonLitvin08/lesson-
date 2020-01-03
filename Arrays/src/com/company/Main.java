package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int [] bat;    // обявляем переменную bat для масива
        int sup;       //обявляем переменную sup для вводимого числа
        Scanner flesh = new Scanner(System.in); //создаем обект flesh,типа Scanner для ввода данных
        System.out.println("Enter numbers of array: ");  //текстовая подсказка для ввода данных
        sup = flesh.nextInt();
        bat = new int[sup]; //выдиляем память для масива и количество елементом масива
        for (int i = 0; i < sup; i++){   // пока переменная sup, больше переменной i, продолжаеться цикл
            System.out.println("Enter bat [" + i + "] = "); // подсказка под вывод цифровых данных под каждый масив
            bat [i] = flesh.nextInt(); // вводим цифровые данные под каждый масив

        }
    }
}
