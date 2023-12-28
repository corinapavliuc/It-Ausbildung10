package array;

public class ArrayExemple1 {
    public static void main(String[] args){
        int[] intArray =new int[5];
        intArray[0] =10;
        intArray[1] =20;
        intArray[2] =-1;
        intArray[3] =30;
        intArray[4] =40;
        intArray[5] =50;
        intArray[6] =60;
        intArray[7] =70;
        intArray[8] =80;
        intArray[9] =90;

        int  minResultIndex=0;

        for (int i =0; i< intArray.length;i++) {
            if (intArray [minResultIndex] > intArray[i]){
                minResultIndex = intArray[1];
            }
        }
        System.out.println("Min элимкет нашево массиао: " + minResultIndex);

    }
}
