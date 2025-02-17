import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args) {
        int n,i,j,temp,loc;
        int a[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter the values: ");
        for (i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for (i=1; i<=n-1;i++){
            temp=a[i];
            j=i-1;
            while (temp<a[j] && j>-1){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=temp;
        }
        for (i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
