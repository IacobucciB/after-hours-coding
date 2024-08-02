public class Main {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 != null && list2 == null) {
            return list1;
        }
        if (list1 == null && list2 != null) {
            return list2;
        }


        ListNode res = new ListNode(0);
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode aux = res;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                ListNode n = new ListNode(l1.val);
                n.next = aux;
            } else {
                
            }
            
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println("021 - Merge Two Sorted Lists");

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode res = null;
        list1 = null;
        list2 = null;
        res = mergeTwoLists(list1, list2);
        // out = [1,1,2,3,4,4]

        ListNode current = res;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}
