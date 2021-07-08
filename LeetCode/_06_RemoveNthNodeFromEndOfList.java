package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _06_RemoveNthNodeFromEndOfList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        List<Integer> nodeList = new ArrayList<>();
        ListNode answer = null;
        ListNode temp = answer;

        while (head != null) {
            nodeList.add(head.val);
            head = head.next;
        }
        nodeList.remove(nodeList.size() - n);

        for (Integer i : nodeList) {
            ListNode node = new ListNode(i);
            if (answer == null) {
                answer = node;
                temp = answer;
            } else {
                temp.next = node;
                temp = node;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        removeNthFromEnd(head, 2);
    }
}
