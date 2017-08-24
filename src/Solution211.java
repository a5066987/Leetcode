/**
 * Created by cuibowu on 2017/8/24.
 */
public class Solution211 {
    private TrieTreeNode root = new TrieTreeNode();

    /**
     * Initialize your data structure here.
     */
    public Solution211() {
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        TrieTreeNode tempNode = root;
        char[] chars = word.toCharArray();
        for (char c : chars) {
            if (tempNode.children[c - 'a'] != null)
                tempNode.children[c - 'a'] = new TrieTreeNode();
            tempNode = tempNode.children[c - 'a'];
        }
        tempNode.isEnd = true;
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        return search(word.toCharArray(), 0, root);
    }
    private boolean search(char[] chars, int index, TrieTreeNode root) {
        if (index == chars.length) {
            if (root.isEnd)
                return true;
            return false;
        }
        TrieTreeNode[] childNodes = root.children;
        char c = chars[index];
        if(c=='.'){
            for(int i =0;i<childNodes.length;i++){
                TrieTreeNode n = childNodes[i];
                if(n!=null){
                    boolean b = search(chars,index+1,n);
                    if(b)
                        return true;
                }
            }
            return false;
        }
        TrieTreeNode node = childNodes[c-'a'];
        if(node==null)
            return false;
        return search(chars,++index,node);
    }
}

class TrieTreeNode {
    boolean isEnd;
    TrieTreeNode[] children = new TrieTreeNode[26];
}
