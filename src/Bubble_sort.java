import java.util.Scanner;

public class Bubble_sort {
    public static void main(String[] args) {
        int n,i,k,temp;
        int a[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter the values: ");
        for (i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for (i=0; i<n-1; i++){
            for (k=0;k<n-i-1;k++){
                if (a[k]>a[k+1]){
                    temp=a[k];
                    a[k]=a[k+1];
                    a[k+1]=temp;
                }
            }
        }
        for (i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}
