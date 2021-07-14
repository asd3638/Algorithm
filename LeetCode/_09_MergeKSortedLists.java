package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _09_MergeKSortedLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }

    public static ListNode solution1(ListNode[] lists) {
        ListNode answer = new ListNode();
        ListNode tmp = answer;
        for (ListNode listNode : lists) {
            while (listNode != null) {
                tmp.val = listNode.val;
                tmp.next = new ListNode();
                tmp = tmp.next;
            }
        }

        return null;
    }
    //arrayList로 바꿔서 푸는 방법
    public static ListNode solution2(ListNode[] lists) {
        List<Integer> nodeList = new ArrayList<>();
        ListNode answer = new ListNode();
        ListNode tmp = answer;
        for (ListNode listNode : lists) {
            while (listNode != null) {
                nodeList.add(listNode.val);
                listNode = listNode.next;
            }
        }
        if (nodeList.size() == 0) {
            return null;
        }
        Collections.sort(nodeList);

        for (int i = 0; i < nodeList.size(); i++) {
            tmp.val = nodeList.get(i);
            if (i == nodeList.size() - 1) {
                break;
            }
            tmp.next = new ListNode();
            tmp = tmp.next;
        }

        return answer;
    }
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode listNode3 = new ListNode(2, new ListNode(6));

        ListNode[] lists = new ListNode[]{listNode1, listNode2, listNode3};
        solution2(lists);
        //ListNode answer = solution2(lists);

        /*while (answer.next != null) {
            System.out.println(answer.val);
            answer = answer.next;
        }*/

    }
}
