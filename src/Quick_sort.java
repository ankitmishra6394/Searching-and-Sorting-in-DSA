import java.util.Scanner;
class quicksort{
    int partition (int a[], int start, int end){
        int pivot = a[end];
        int pindex = start;
        for (int i =start; i<end-1; i++){
            if (a[i]<=pivot)
            {
                int t = a[pindex];
                a[pindex] = a[i];
                a[i] = t;
                pindex++;
            }
        }
        int t = a[pindex];
        a[pindex] = a[end];
        a[end] = t;
        return (pindex);
    }
    void quick (int a[], int start, int end){
        if (start < end){
            int p = partition(a,start,end);
            quick(a,start,p-1);
            quick(a,p+1,end);
        }
    }
}

public class Quick_sort {
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
        quicksort q1 = new quicksort();
        q1.quick(a,0,n-1);
        for (i = 0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}
