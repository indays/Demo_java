package hot100;

import java.util.List;

public class 删除链表的倒数第N个结点 {
    public static void main(String[] args) {

        ListNode list = new ListNode(1);
        ListNode list1 = new ListNode(2);
        ListNode list2 = new ListNode(3);
        ListNode list3 = new ListNode(4);
        ListNode list4 = new ListNode(5);

        list.next=list1;
        list1.next=list2;
        list2.next=list3;
        list3.next=list4;

        removeNthFromEnd(list,2);
    }


    public static ListNode removeNthFromEnd(ListNode head, int n) {

        int size =0;


        ListNode temp =head;

        // 计算长度
        while(head!=null){

            size++;
            head=head.next;



        }
        // 正序删除

        int rIndex =size -n;

        ListNode rNode =temp;


        for(int i=0;i<=size;i++){

            if(i==rIndex-1){

                temp.next=temp.next.next;
                break;
            }else{
                temp=temp.next;
            }

        }


        return rNode;



    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
