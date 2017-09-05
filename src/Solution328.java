/**
 * Created by cuibowu on 2017/9/5.
 */
public class Solution328 {
    public ListNode oddEvenList(ListNode head) {
//        if(head==null||head.next==null)
//            return head;
//        ListNode tail = head;
//        int count = 1 ;
//        while (tail.next.next!=null){
//            tail=tail.next;
//            count++;
//        }
//        if(count%2==0)
//            tail=tail.next;
//        ListNode pointer = head;
//        count=1;
//        while (pointer!=null){
//
//        }
        if (head != null) {

            ListNode odd = head, even = head.next, evenHead = even;

            while (even != null && even.next != null) {
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
        }
        return head;
    }
}
