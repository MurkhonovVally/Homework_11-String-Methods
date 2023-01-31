public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void leapYear(int checkYear) {
        if ((checkYear % 400 == 0) || (checkYear % 4 == 0 && checkYear % 100 != 0)) {
            System.out.println(checkYear + " год - високосный год");
        } else {
            System.out.println(checkYear + " год - невисокосный год");
        }
    }

    public static void task1() {
        System.out.println((char) 27 + "[34m----------Задача 1----------" + (char) 27 + "[0m");
        int year = 2024;
        leapYear(year);
    }

    public static void getAppLink(int manufacturingYear, int os) {
        System.out.printf("Установите %s версию приложения для %s по ссылке%n",
                getAppVariant(manufacturingYear), getOsString(os));
    }

    public static String getOsString(int os) {
        if (os == 0) {
            return "iOS";
        } else {
            return "Android";
        }
    }

    public static String getAppVariant(int year) {
        if (year > 2015) {
            return "полную";
        } else {
            return "облегченную";
        }
    }

    public static void task2() {
        System.out.println((char) 27 + "[32m--------Конец задачи--------" + (char) 27 + "[0m");
        System.out.println(" ");
        System.out.println((char) 27 + "[34m----------Задача 2----------" + (char) 27 + "[0m");
        getAppLink(2014, 1);
    }

    public static int amountOfDays(int deliveryDistance) {
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            int days = 1;
            if (deliveryDistance < 20) {
                days = days;
            }
            if (deliveryDistance > 20) {
                days = days + 1;
            }
            if (deliveryDistance > 60) {
                days = days + 1;
            }
            System.out.println("Потребуется дней: " + days);
        }
        return deliveryDistance;
    }
    
    public static void task3() {
        System.out.println((char) 27 + "[32m--------Конец задачи--------" + (char) 27 + "[0m");
        System.out.println(" ");
        System.out.println((char) 27 + "[34m----------Задача 3----------" + (char) 27 + "[0m");
        int distance = 95;
        amountOfDays(distance);
    }
}