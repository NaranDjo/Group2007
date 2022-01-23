public class HomeWorkApp {

// Задание 1

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
// Задание 2


    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

 // Задание 3
    public static void checkSumSign() {
        int a = 38;
        int b = 31;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");

        } else {
            System.out.println("Сумма отрицательная");
        }
    }
// Задание 4
    public static void printColor() {
        int value;
        value = (int)(Math.random()*300)-150;
        System.out.println("value = " + value);
        if (value <= 0 ) {
            System.out.println("Красный");
        } else if ((value>0) && (value<=100)){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
// Задание 5
    public static void compareNumbers() {
        int a = 22;
        int b = 11;
        if (a>=b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}