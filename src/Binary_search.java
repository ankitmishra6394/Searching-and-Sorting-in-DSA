import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        int n, i;
        int[] a;
        Scanner sc  =new Scanner(System.in);
        System.out.println("How many elements do u want to add in array: ");
        n = sc.nextInt();
        a=new int[n];
        System.out.println("Enter elements: ");
        for (i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
    }
}
