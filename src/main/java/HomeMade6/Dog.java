package HomeMade6;

public class Dog extends Animal {
    int distanceOfDog;
    int distanceMaxForDog = 500;
    int distanceMaxForDogSwim = 10;
    String name;
    private int String;

    public void run() {
        if (distanceOfDog<=distanceMaxForDog && distanceOfDog>=0) {
            System.out.println("Собака " + name + " пробежала " + distanceOfDog + " метров" );
        } else if (distanceOfDog>distanceMaxForDog) {
            System.out.println("Собака " + name + "не мог пробежать " + distanceMaxForDog + "метров");
        }
    }
    public void swim() {
        if (distanceOfDog <= distanceMaxForDogSwim && distanceOfDog >= 0) {
            System.out.println("Собака " + name + " проплыла " + distanceOfDog + " метров");
        } else if (distanceOfDog>distanceMaxForDogSwim) {
            System.out.println("Собака " + name + " не мог проплыть " + distanceOfDog + " метров");
        }
    }
}
