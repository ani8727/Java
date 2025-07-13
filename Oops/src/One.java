class Calculator{

    public int add(int a, int b){
        System.out.println("Done Calculation");
        return a+b;
    }
}

public class One {
    public static void main(String[] args) {

        Calculator c= new Calculator();
        int result= c.add(5,8);
        System.out.println(result);
    }

}
