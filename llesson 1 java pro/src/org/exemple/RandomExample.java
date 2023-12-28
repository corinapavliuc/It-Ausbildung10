package org.exemple;

import java.util.Random;
import java.util.Scanner;

public class RandomExample {
    public static void main (String[]args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("введите отченку Enter mark");
        int mark =scan.nextInt();
        Random ran =new Random();
        int compMark =ran.nextInt(101);
        System.out.println(compMark);
        System.out.println("sredni znacenia ");
        System.out.println("Average: ");
        int averageMark =(mark+compMark)/2;
        System.out.println(averageMark);
        System.out.println(!(averageMark > 30 || mark <0));
        System.out.println(!(averageMark > 50 && compMark > mark ));
       int fivePoint =1;
        if (averageMark<33){
            fivePoint = 2;
        }
        if (averageMark>=33&&averageMark<66){
            fivePoint= 3;
        }
        if (averageMark>=66&&averageMark<80){
           fivePoint= 4;
        }
        if (averageMark>=80){
           fivePoint= 5;
        }
      String markname =switch (fivePoint){
            case 2->"neut";
            case 3->"udov";
            case 4->"horoso";
            case 5->"otklicno";
          default -> "neizvesnaea otcenka";

      };
        System.out.println(markname);
       AmerkanMark amerk = switch (fivePoint){
           case 0->AmerkanMark.F;
           case 1-> AmerkanMark.E;
           case 2->AmerkanMark.F;
           case 3->AmerkanMark.C;
           case 4->AmerkanMark.B;
           default ->AmerkanMark.A;
       };
        System.out.println(amerk);

        String result = switch (amerk){
            case A,B,C -> "pass";
            case D -> "fail";
            case E,F -> "nodata";
        };
        System.out.println(result);
    }
}
