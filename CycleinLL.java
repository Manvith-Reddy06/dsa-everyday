public class CycleinLL {
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode newNode= temp.next;
            temp.next=prev;
            prev=temp;
            temp=newNode;
        }
        return prev;
    }
}
