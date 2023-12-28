package object_exemple;

public class Main {
    public static void main(String[] args) {
        Water water = new Water(10, "Жидкая", false);

        System.out.println("Температура первой воды: " + water.getTemperature());

        water.setTemperature(250);

        System.out.println("Температура первой воды: " + water.getTemperature());

        water.setTemperature(75);

        System.out.println("Температура первой воды: " + water.getTemperature());
    }
}