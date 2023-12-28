public class ForExemple {
    public static void infinityFor (){
        for (int i=0; i > -1 ; i++) {
            System.out.println(i);

            if (i== 100000) {
                break;
            }
        }

    }
    public static void printHelloAndEvenNumbers (int count){
     for (int i= 0; i < count;i++) {
         System.out.println("Hello my frieds");
         if (i%2==0){
             System.out.println(i);
         }
     }
    }
}

