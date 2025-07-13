import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
//         Static Array
        // 1D array
        int array[]= {2,4,6,8};
        int[] array2 = {4,6,8,9};

//        System.out.println(array);

        // 2D array
        int[][] twod= {{12,45},{23,57}};
//        System.out.println(twod);

        // 3D array
        int[][][] threeD = {{{20,60},{30,60}},{{4,78},{45,78,}}};
//        System.out.println(threeD);

//        Dynamic array
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
//        arr[0]=sc.nextInt();
//        arr[1]=sc.nextInt();

//        System.out.println(arr[0]+"  "+arr[1]);

        // create a dynamic array using loop

        System.out.print("Enter size of array: ");
        int n= sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter elem in array: ");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Elem of array: ");
        for(int i:arr1) {
            System.out.print(i + " ");
        }

//        jagged array
//        rows are fixed but column not fixed
        int [][] jaggedArray = new int[2][];
    }
}
