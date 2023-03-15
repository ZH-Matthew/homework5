public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        boolean clientOS = true;
        if (clientOS) {               //0 — iOS, 1 — Android
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        boolean clientOS = false;
        int clientDeviceYear = 2015;

        if (clientOS) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        /* ничего не понял по поводу условия вложенности не больше двух этажей, но напишу сразу второй вариант на всякий:
        if (clientOS==1 && clientDeviceYear<2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS==1 && clientDeviceYear>=2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS==0 && clientDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS==0 && clientDeviceYear>=2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
         */
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if (year%400==0 || (year%4==0 && year%100!=0)) {
            System.out.println("Год високосный!");
        } else {
            System.out.println("Год не високосный!");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95 ;
        if (deliveryDistance <=20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance >20 && deliveryDistance<=60){
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance>60 && deliveryDistance<=100){
            System.out.println("Потребуется 3 дня");
        } else {
            System.out.println("Упс! Так далеко мы не возим");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
                System.out.println("Зима");
                break;
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
    }
}