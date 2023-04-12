/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        if(root==null) return new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(root.val);
        for(Node child : root.children)
            ans.addAll(preorder(child));
        
        return ans;
    }
}