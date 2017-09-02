/**
 * Created by cuibowu on 2017/9/2.
 */
public class Solution234 {
    public boolean isPalindrome(ListNode head){
        ListNode fast=head,slow=head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast!=null){
            slow=slow.next;
        }

        slow=reverseLinkedList(slow);
        fast=head;

        while (slow!=null){
            if(slow.val!=fast.val)
                return false;
            fast=fast.next;
            slow=slow.next;
        }

        return true;
    }

    private  ListNode reverseLinkedList(ListNode head){
        ListNode pre = null;
        while (head!=null){
            ListNode next = head.next;
            head.next = pre;
            pre= head;
            head=next;
        }
        return pre;
    }
}
