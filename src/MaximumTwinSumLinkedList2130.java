public class MaximumTwinSumLinkedList2130 {
    private static class ListNode {
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

    private int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int maxSum = 0;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode nextNode, prev = null;
        while (slow != null) {
            nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        while (prev != null) {
            maxSum = Math.max(maxSum, head.val + prev.val);
            prev = prev.next;
            head = head.next;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        MaximumTwinSumLinkedList2130 solution = new MaximumTwinSumLinkedList2130();

        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);

        System.out.println(solution.pairSum(head));
    }
}
