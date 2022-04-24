public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

// task 4
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance <=20) {
            System.out.println("Потребуется дней " + deliveryDay);
        } if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + (deliveryDay + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + (deliveryDay +1+1));
        }
        }



    }





