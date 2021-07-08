package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _08_MergeTwoSortedLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode solution(ListNode l1, ListNode l2) {
        List<Integer> nodeList = new ArrayList<>();
        ListNode answer = null;
        ListNode temp = answer;

        while (l1 != null) {
            nodeList.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            nodeList.add(l2.val);
            l2 = l2.next;
        }
        Collections.sort(nodeList);

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
    }
}
