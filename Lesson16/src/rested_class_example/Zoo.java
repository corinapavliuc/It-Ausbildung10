package rested_class_example;

public class Zoo {
    public static void main(String[] args) {
Zoo zoo = new Zoo();
        Zoo.Monkey.Banana banana = new Zoo().new Monkey().new Banana();

    }
    class  Monkey {

       public class Banana{
           private String sort ="Yellow";
           public String getSort(){
               return  sort;
           }

        }
    }
}
