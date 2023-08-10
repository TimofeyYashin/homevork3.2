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
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Уствновите облегченную версию приложения для IOS по ссылке.");
        }
        else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        }
        else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int year = 2400;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        }
        else {
            System.out.println(year + " год не является високосным.");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 61;
        int day = 1;
        if (deliveryDistance > 0 && deliveryDistance < 20 && day == 1) {
            System.out.println("Потребуется дней: " + day);
        }
        else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            day = 1+1;
            System.out.println("Потребуется дней: " + day);
        }
        else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            day = 1+2;
            System.out.println("Потребуется дней: " + day);
        }
        else {
            System.out.println("Доставки нет!!!");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
        }
    }
    }
