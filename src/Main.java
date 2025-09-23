//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача 2
        short clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача 3
        short year = 2021;
        if (year < 1584) {
            System.out.println("Год должен быть больше 1584 для проверки високосного года");
        } else {
            boolean leapYear = false;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                leapYear = true;
            } else {
                leapYear = false;
            }
            if (leapYear == true) {
                System.out.println("Данный год является високосным");
            } else {
                System.out.println("Данный год не является високосным");
            }
        }

        //Задача 4
        byte deliveryDistance = 95;
        byte daysToDelivery;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");
            return;
        } else {
            daysToDelivery = 1;
            if (deliveryDistance > 20) {
                daysToDelivery += 1;
            }
            if (deliveryDistance > 60) {
                daysToDelivery += 1;
            }
            System.out.println("Потребуется дней до доставки: " + daysToDelivery);
        }

        //Задача 5
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Этот месяц относится к зиме");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц относится к весне");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц относится к лету");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Этот мессяц относится к осени");
                break;

            default:
                System.out.println("Некорректный номер месяца");
                break;
        }


        }



    }
