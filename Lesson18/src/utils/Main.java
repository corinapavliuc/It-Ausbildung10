/*Создайте 5 объектов типа Car
        Сохраните объекты в массив
                Объект Car должен содержать поля
                    private double price;
                    private String model;
                    и конструктор с этими полями
        Распечатайте результат
            Результат печати одного авто должен выглядеть
        Применив метод “сортировка пузырьком” отсортируйте массив по стоимости
        Распечатайте результат
        Применив метод “сортировка пузырьком” отсортируйте массив по модели (первая буква из модели)
        Распечатайте результат*/





import cars.RidingCar;
import org.telran.pavel.lesson18Pavel.CarsArrays.cars.Car;
import org.telran.pavel.lesson18Pavel.CarsArrays.utils.Sorter;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car ridingCar = new RidingCar(120,12.2,"Ferarii");
 ridingCar.comparareTo(new Car 2.2,"Vagna")
        Car[] cars = new Car[5];
        cars[0] = new Car(2.3, "BMW");
        cars[1] = new Car(5.1, "Volvo");
        cars[2] = ridingCar;
        cars[3] = new Car(0.5, "Toyota");
        cars[4] = new Car(7.2, "Audi");

        long firstCurrentTime = System.currentTimeMillis();
        Arrays sort(cars);

        Sorter.sortCars(cars);

        long secondCurrentTime = System.currentTimeMillis();

        long difference=secondCurrentTime -firstCurrentTime;

        System.out.println("Metod  pusirkov nasi masina " + difference+ "iillisekund");




        for (Car car: cars) {
            System.out.println(car);
        }
    }
}