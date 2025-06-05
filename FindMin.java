import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i = 0;i<5;i++){
            System.out.println("Enter"+ i+ "th element");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];

        for(int i=0;i<5;i++){
            if(min > arr[i]){
                min = arr[i];
            }
            if(min < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("minimun number is " + min);
        System.out.println("mximum number is " + max);

        sc.close();
    }
}
