import java.util.Scanner;
class merge{
    void merge1(int a[], int start, int mid, int end){
        int l = mid - start + 1;
        int r = end - mid;
        int left_subarray[] = new int[l];
        int right_subarray[] = new int[r];

        for (int i = 0; i < l; i++)
            left_subarray[i] = a[start + i];
        for (int j = 0; j < r; j++)
            right_subarray[j] = a[mid + 1 + j];
        int i= 0, j = 0;
        int k = start;
        while (i < l && j < r){
            if (left_subarray[i] <= right_subarray[j]){
                a[k] = left_subarray[i];
                i++;
            } else {
                a[k] = right_subarray[j];
                j++;
            }
            k++;
        }
    }
}
public class Merge_sort {
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
        merge ob = new merge();
        ob.mergesort(a,0,n-1);

        for (i = 0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}
