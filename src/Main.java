public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

// task 2
        int clientOS = 0;
        int clientDeviceYear = 2019;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установи облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }
    }
}




