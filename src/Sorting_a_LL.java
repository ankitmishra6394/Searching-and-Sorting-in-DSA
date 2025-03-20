import java.util.Scanner;

public class Sorting_a_LL {
    static class Node{
        int data;
        Node next;
        Node(int data){
          this.data = data;
          this.next = null;
        }
    }
    Node head = null;
    public void creation(){
        Scanner sc = new Scanner(System.in);
        int m,n,p;
        do {
            System.out.println("Enter data");
            int data = sc.nextInt();
            Node new_node = new Node(data);
            if (head==null){
                head = new_node;
            } else {
                System.out.println("If you want to add the data at the starting Press 1: ");
                System.out.println("If you want to add the data at the end Press 2: ");
                System.out.println("If you want to add the data at the specific location 3: ");
                m = sc.nextInt();
                switch (m){
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        break;
                    case 2:
                        Node temp = head;
                        while (temp!=null){
                            temp = temp.next;
                        }
                        temp.next = new_node;
                        break;
                    case 3:
                        System.out.println("Enter the location: ");
                        p = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i<p-1; i++){
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1 = new_node;
                        break;
                }
            }
            System.out.println("You want to add more data so press 1:");
            n = sc.nextInt();
        } while (n==1);
    }
}
