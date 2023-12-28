package searchAlgoritm;

public class LinearSearch {
    public static  void main(String[] args){
        int[] arrayForSearch = {8,3,5,2,1,4,7,6};

        int elementForSearch =5;
        int indexForSearch = LinearSearch(arrayForSearch,elementForSearch);
        if (indexForSearch >=0) {
            System.out.println("Search Elemat " + elementForSearch +"in the our array has  index"+ indexForSearch);

        }else{
            System.out.println("Search Elemat " + elementForSearch +"didnt find in the our  array "+ indexForSearch);
        }
}

public static int LinearSearch(int[] worikingArray, int elementForSearch){
    for (int index =0; index < worikingArray.length; index++){
        if (worikingArray[index]== elementForSearch){
            return index;
        }
    }
    return -1;
}
}
// сложность алгоитма -0(сложность)
// 0(1)
//0(n),где п -размерность массива
// 0 (n^2)
//0(n^exp)