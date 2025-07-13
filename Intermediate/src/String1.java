
public class String1 {
    public static void main(String[] args) {
//        Char Array -> String
        char[] charArray = {'A','B','C'};
        System.out.println(charArray);

        String str = "Aniket";
//        System.out.println(str);
//        System.out.println(str.charAt(0));

//        Ways to create String
        String str1 = "Ani";
        String str2 = "Ani";
        String str3 = new String("Ani");
        System.out.println(str1==str2);
//        System.out.println(str1==str3);
//        == operator used on instance not actual value
        System.out.println(str1.equals(str3));

        /*
        String is immutable, so used all other methods, we used
         stringBuffer and StringBuilder
*/
        StringBuffer str4 = new StringBuffer(("Ani"));
        System.out.println(str4);
        str4.append("ket");
        System.out.println(str4);



    }
}
