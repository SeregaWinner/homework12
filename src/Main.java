import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным!");
        } else {
            System.out.println(year + " год не являеться високосным");
        }
    }

    public static void determineVersionIOS(int versionOS) {
        int currentYear = LocalDate.now().getYear();
        int yearIssue = 2024;
        if (versionOS == 0 && yearIssue >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static void determineVersionAndroid(int versionOS) {
        int currentYear = LocalDate.now().getYear();
        int yearIssue = 2018;
        if (versionOS == 1 && yearIssue >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static int deliveryCard(int deliveryDistance) {
        int day = 0;
        if (deliveryDistance > 0) {
            day += 1;
        }
        if (deliveryDistance > 20) {
            day += 1;
        }
        if (deliveryDistance > 60) {
            day += 1;
        }
        if (deliveryDistance > 100) {
            day = -1;
        }
        return day;

    }


    public static void task1() {
        System.out.println("Задание 1");
        int year = 2021;
        checkYear(year);
    }

    public static void task2() {
        System.out.println("Задание 2");
        int versionOS = 1;
        if (versionOS == 0) {
            determineVersionIOS(versionOS);
        } else {
            determineVersionAndroid(versionOS);
        }

    }

    public static void task3() {
        System.out.println("Задание 3");
        int deliveryDistance = 10;
        int day = deliveryCard(deliveryDistance);
        if (day>0){
            System.out.println("Потребуется дней: " + day);
        }else {
            System.out.println("Доставки нет");
        }






    }
}