import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        int n,i,item,c=0;
        int beg,end,mid=0;
        int[] a;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements do u want to add in array: ");
        n = sc.nextInt();
        a=new int[n];
        System.out.println("Enter elements: ");
        for (i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter item to find: ");
        item = sc.nextInt();
        beg=0;
        end=n-1;
        while (beg<=end){
            mid = beg+end/2;
            if (item==a[mid]){
                c++;
                break;
            } else if (item>a[mid]) {
                beg=mid+1;
            } else if (item<a[mid]) {
                end=mid-1;
            }
        }
        if (c>0){
            System.out.println("Item found at:  "+mid);
        } else {
            System.out.println("Item not find");
        }
    }
}
