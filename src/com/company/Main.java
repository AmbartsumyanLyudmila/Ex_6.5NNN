package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.print("Введите число, кол-во чисел в массиве: ");
        Scanner n = new Scanner(System.in);
        int symbol = n.nextInt();
        int[] num1 = new int[symbol];
        System.out.println("Введите " + symbol + " чисел в формате NNN через пробел, и затем нажмите Enter");

        int a1, a2, a3 = 0;
        for(int i = 0; i < symbol; ++i) {
            num1[i] = n.nextInt();
            a3 = num1[i] % 100 % 10;
            a2 = num1[i] / 10 % 10;
            a1 = num1[i] / 100;
            if (a1 != a2 && a2 != a3 && a3 != a1) {
                System.out.println("Уникальные числа в формате NNN: "+num1[i]);
            }
        }
    }
}
