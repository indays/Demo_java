package hot100;

import java.util.HashMap;
import java.util.Map;

public class 复制带随机指针的链表 {

    public static void main(String[] args) {

        Node node = new Node(7);
        Node node1 = new Node(13);
        Node node2 = new Node(11);
        Node node3 = new Node(10);
        Node node4 = new Node(1);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node.random = null;
        node1.random = node;
        node2.random = node4;
        node3.random = node2;
        node4.random = node;
        copyRandomList(node);

    }

    public static Node copyRandomList(Node head) {

        //  hashMap 维护所有节点信息  index   node
        Map<Node, Node> hashMap = new HashMap();

        Node te=head;
        Node temp = head;

        while (temp != null) {
            hashMap.put(temp, new Node(temp.val));
            temp = temp.next;

        }
        // 遍历节点  将节点信息组装
        int index = 0;

        while (head != null) {

            Node node = hashMap.get(head);

            node.next = hashMap.get(head.next);

            node.random = hashMap.get(head.random);

            head = head.next;
        }

        return hashMap.get(te);
    }


    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
