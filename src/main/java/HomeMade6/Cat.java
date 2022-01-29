package HomeMade6;

public class Cat extends Animal {
    int distanceOfCat;
    int catMaxDistance = 200;
    String name;
    private int String;

    public void run() {
        if (distanceOfCat <=catMaxDistance && distanceOfCat >=0) {
            System.out.println("Кошка " + name + " пробежала " + distanceOfCat + " метров" );
        } else if (distanceOfCat >catMaxDistance) {
            System.out.println("Кошка " + name + "не смогла пробежать, так как устала" +distanceOfCat + "метров");
        }
    }
    public void swim() {
        String catSwim = "Кошка не может плыть";
        System.out.println(String);
    }
}
