package object_array_exemple;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pen firstPen = new Pen("Green");
        Pen secondPen = new Pen("Red");
        Pen thirtPen = new Pen("Black");

        Pen[] pens = new Pen[3];

        System.out.println(pens[1]);

        pens[0] = firstPen;
        pens[1] = secondPen;
        pens[2] = thirtPen;

        System.out.println("----------------------------------");
        for (Pen pen : pens) {
            System.out.println("Color stift: " + pen.color);

            System.out.println("---------------------");

            System.out.println(Arrays.toString(pens));
        }
    }
}