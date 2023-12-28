package cars;

public class RidingCar Car {
    private final int maxSpeed;

    public RidingCar(int maxSpeed, double price, String model) {

        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void ride(){
        System.out.println("ea idu nmaksimalnii scorosti"+ maxSpeed);
    }
}
