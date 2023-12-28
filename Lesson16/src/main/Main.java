package main;

import main.task.Test;
import sub_task.SubTest;




public class Main {
    public static void main(String[] args) {
 Test test = new Test ();

        System.out.println(test.testCase);
        SubTest subTest =new SubTest();
        System.out.println(subTest.getHiddenField());
        subTest.setHiddenField("not smal stroka");

    }
}
