import java.util.HashMap;
import java.util.Map;

/**
 * Created by cuibowu on 2017/8/24.
 */
public class Solution146 {
    private class doubleLinkdNode {
        int key, value;
        doubleLinkdNode pre, next;

        doubleLinkdNode(int k, int v) {
            key = k;
            value = v;
        }
    }

    private int capacity, count;
    private Map<Integer, doubleLinkdNode> map;
    private doubleLinkdNode head, tail;

    public Solution146(int capacity) {
        this.capacity = capacity;
        count = 0;
        map = new HashMap<>();
        head = new doubleLinkdNode(0,0);
        tail = new doubleLinkdNode(0,0);
        head.next=tail;
        tail.pre=head;
    }

    public int get(int key) {
        doubleLinkdNode node = map.get(key);
        if(node==null)
            return -1;
        update(node);
        return node.value;
    }

    public void put(int key, int value) {
        doubleLinkdNode node = map.get(key);
        if(node==null){
            node=new doubleLinkdNode(key,value);
            map.put(key,node);
            add(node);
            count++;
        }
        else {
            node.value=value;
            update(node);
        }
        if(count>capacity){
            doubleLinkdNode temp = tail.pre;
            map.remove(temp.key);
            remove(temp);
            count--;
        }
    }

    private void update(doubleLinkdNode node){
        remove(node);
        add(node);
    }

    private void add(doubleLinkdNode node){
        doubleLinkdNode temp = head.next;
        head.next=node;
        node.pre=head;
        node.next=temp;
        temp.pre=node;
    }

    private void remove(doubleLinkdNode node){
        doubleLinkdNode left = node.pre,right=node.next;
        left.next=right;
        right.pre=left;
    }
}
