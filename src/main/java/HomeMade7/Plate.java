package HomeMade7;

public class Plate {
    private int food;

   public void setFood(int food) {
        if (food>=0) {
            this.food = food;
        } else {
            System.out.println(" Упс, в миске нет корма :(");
        }
    }

    public Plate(int food) {
        this.food = food;

    }

    public void decreaseFood(int appetite) {
        if(food >= appetite) {
            food -=appetite;
        }

    }
    public void increaseFood(int amount) {
       food += amount;
    }
    public void info() {
        System.out.println("В миске: " + food);
    }
}
