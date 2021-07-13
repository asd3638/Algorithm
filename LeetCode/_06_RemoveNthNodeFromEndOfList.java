package LeetCode;

public class _06_RemoveNthNodeFromEndOfList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int listNodeCount = 0;
        int countForAnswer = 0;
        ListNode tempNode1 = head;
        ListNode result = new ListNode(0, head);
        ListNode tempNode2 = result;
        //ListNode 길이 구하기
        while (tempNode1.next != null) {
            listNodeCount++;
            tempNode1 = tempNode1.next;
        }
        if (listNodeCount == 0) {
            return null;
        }

        while (tempNode2.next != null) {
            if (listNodeCount - n + 1 == countForAnswer) {
                tempNode2.next = tempNode2.next.next;
                break;
            }
            tempNode2 = tempNode2.next;
            countForAnswer++;
        }
        return result.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        removeNthFromEnd(head, 2);
    }
}
