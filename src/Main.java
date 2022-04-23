public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

// task 3
        int Year = 2021;
        if ((Year % 4 == 0) && (Year % 100 != 0) || (Year % 400 == 0)) {
            System.out.println(Year + " високосный год");
        } else {
            System.out.println(Year + " не високосный год");
        }



    }
}




