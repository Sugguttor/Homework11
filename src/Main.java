public class Main {
    public static void checkingOfTheYear(int year) {
        if (year >= 1584 && (year % 4) == 0) {
            System.out.println(year + " год является високосным");
        } else if (year >= 1584 && (year % 400) == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void chekingfOfTheOs(int clientOS, int clientDeviceYear) {
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void calculatingTheDeliveryDistance(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2021;
        checkingOfTheYear(year);
        System.out.println();

        System.out.println("Задание 2");
        int clientOS = 1;
        int clientDeviceYear = 2012;
        chekingfOfTheOs(clientOS, clientDeviceYear);
        System.out.println();

        System.out.println("Задание 3");
        int deliveryDistance = 95;
        calculatingTheDeliveryDistance(deliveryDistance);
        System.out.println();
    }
}