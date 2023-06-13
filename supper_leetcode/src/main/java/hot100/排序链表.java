
package hot100;

import java.net.Socket;
import java.util.*;

public class 排序链表 {

    public static void main(String[] args) {

        ListNode node = new ListNode(4);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(3);

        node.next=node1;
        node1.next=node2;
        node2.next=node3;

        sortList(node);


        Stack<Integer> stack = new Stack<>();

        Stack<Integer> stack1 = new Stack<>();



    }




    public static ListNode sortList(ListNode head) {

        // treeMap
//        Map<Integer,ListNode> map = new TreeMap<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        });

        Queue<ListNode> queue =new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o2.val- o1.val;
            }
        });

        while(head!=null){

            queue.add(head);
            head=head.next;

        }

        ListNode temp = new ListNode(0);
        ListNode temp1 = temp;

        while(!queue.isEmpty()){

            temp1.next=queue.poll();
            temp1=temp1.next;
        }
        temp1.next=null;

        return temp;



    }
    
    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
