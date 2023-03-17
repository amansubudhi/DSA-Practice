    class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

    public class qs_2181 {
    // My code beats 48%
        public static ListNode mergeNodes(ListNode head) {
            ListNode ans = new ListNode();
            ListNode newHead = ans;
            ListNode temp = head.next;
            int sum = 0;


            while(temp.next != null) {
                sum += temp.val;
                temp = temp.next;
                if(temp.val == 0) {
                    ans.next = new ListNode(sum);
                    ans = ans.next;
                    sum = 0;
                }
            }

            return newHead.next;
        }

        public static void main(String[] args) {
            ListNode head = new ListNode(0);
            head.next = new ListNode(3);
            head.next.next = new ListNode(1);
            head.next.next.next = new ListNode(0);
            head.next.next.next.next = new ListNode(4);
            head.next.next.next.next.next = new ListNode(5);
            head.next.next.next.next.next.next = new ListNode(2);
            head.next.next.next.next.next.next.next = new ListNode(0);

            System.out.println(mergeNodes(head));
        }

    }

    //Beats 98%
    /**public ListNode mergeNodes(ListNode head) {
        if(head == null){ return null; }

        int sum = 0;
        head = head.next;
        ListNode start = head;


        while(start != null){
            ListNode end = start;

            while(end.val != 0){
                sum += end.val;
                end = end.next;
            }
            start.val = sum;
            start.next = end.next;
            start = start.next;
            sum = 0;
        }
        return head;
    } */



