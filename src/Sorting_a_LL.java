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
                        temp1.next = new_node;
                        break;
                }
            }
            System.out.println("You want to add more data so press 1:");
            n = sc.nextInt();
        } while (n==1);
    }
    public void display(){
        Node temp = head;
        if (temp==null){
            System.out.println("The linked list is empty");
        } else {
            while (temp!=null){
                System.out.println(temp.data+"");
                temp = temp.next;
            }
        }
    }
    public void sorting() {
        int c = 0;
        if (head != null) {
            Node temp = head;
            while (temp!= null) {
                temp = temp.next;
                c++;
            }
            System.out.println("The number of the nodes are: " + c);
            for (int i = 0; i<c; i++){
                for (int j = 0; j<c-i-1; j++){
                    temp = head;
                    Node temp1 = temp.next;
                    int d;
                    if (temp.data>temp1.data){
                        d = temp.data;
                        temp1.data = temp.data;
                        temp.data = d;
                    }
                    temp = temp1;
                    temp1 = temp1.next;
                }
            }
        }
        System.out.println("The sorted linked list is:");
        Node temp2 = head;
        while (temp2!=null){
            System.out.println(temp2.data+"");
            temp2 = temp2.next;
        }
    }
    public static void main(String[] args) {
     Sorting_a_LL ll = new Sorting_a_LL();
     ll.creation();
     ll.display();
     ll.sorting();
    }
}
