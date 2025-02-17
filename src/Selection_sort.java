import java.util.Scanner;

public class Selection_sort {
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
        for (i = 0; i<n; i++){
            loc=i;
            for (j = i+1; j<n; j++){
                if (a[j]<a[loc]){
                    loc = j;
                }
            }
            temp = a[i];
            a[i] = a[loc];
            a[loc] = temp;
        }
        for (i = 0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}
