//Задача написать калькулятор для расчёта пошлины для провоза товара.

import java.util.Scanner;

public class DutyCalculator{

    public static void main(String[] args) {
        //Открытие скана консоли
        Scanner scanner = new Scanner(System.in);

        //Ввод цены товара
        System.out.print("Введите цену товара (в руб.): ");
        int price = scanner.nextInt();

        //Ввод веса товара
        System.out.print("Введите вес товара (в кг.): ");
        int weight = scanner.nextInt();

        //Вызываем метод для рассчета пошлины
        int duty = calculateDatu(price, weight);

        System.out.print("Размер пошлины (в руб.) составит: " + duty);

    }

    //Метод для рассчета пошлины
    private static int calculateDatu(int price, int weight) {
        // 1 копейка за каждый рубль цены товара
        int dutyFromPrice = price;
        // 100 рублей за каждый килограмм товара
        int dutyFromWeight = weight * 100;
        // Общая сумма пошлины
        return dutyFromPrice + dutyFromWeight;
    }

}