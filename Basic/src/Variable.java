public class Variable {
    public static void main(String[] args) {

//        integer data type
        int num1 = 9;
        byte by = 27;
        short sh=558;
        long l = 5854L;

//        flaot
        float f =5.8f;
        double d=5.8;

//        string and char
        char c= 'k';
        String name = "Aniket";

        boolean b= true;

        System.out.println(name);

//   type conversion and casting
     byte a=127;
     int i=a;
     // it called implicit conversion
        System.out.println(i);


//        int k=156;
//        byte m=k;
        //it got error

        int k=156;
        byte m=(byte)k;
        System.out.println(k);
//        it called explicit conversion or casting
    }


}
