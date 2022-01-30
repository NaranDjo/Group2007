package HomeMade7;

public class Eating {
    public static void main(String[] args) {
        Cat[] cat = new Cat[3];
        cat[1] = new Cat("Котик первый", 15);
        cat[2] = new Cat("Котик второй", 10);
        cat[3] = new Cat("Котик третий", 20);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        plate.info();

    }
}
