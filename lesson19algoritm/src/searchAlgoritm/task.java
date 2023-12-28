package searchAlgoritm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task {
    public static  void main(String[] args){
        String[] strings={"каждыи", "ohotnik","jelaet","znati","gde","sidit","fazan"};

        //Scenario 1
        String[] strings1=new String[strings.length];

        for (int i=0; i < strings.length; i++){
            strings1[strings1.length-1 -i]=strings[i];

        }
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(strings1));

        //Scenario 2
        for (int i=0; i<strings.length / 2; i++){
            String tempString =strings[i];
            strings[i]=strings[strings.length -1 -i];
            strings[strings.length -1 -i] =tempString;
        }
        System.out.println(Arrays.toString(strings));
    }

}
