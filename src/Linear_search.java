import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        int n,i,item, c=0;
        int[] a;
        Scanner sc  =new Scanner(System.in);
        System.out.println("How many elements do u want to add in array: ");
        n = sc.nextInt();
        a=new int[n];

        System.out.println("Enter elements: ");
        for (i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter item to find: ");
        item = sc.nextInt();
        for (i =  0; i<a.length; i++){
            if (a[i]==item){
                c++;
                break;
            }
        }
        if (c>0){
            System.out.println("item exists at index: "+i);
        } else {
            System.out.println("Item does not exists");
        }
    }
}
