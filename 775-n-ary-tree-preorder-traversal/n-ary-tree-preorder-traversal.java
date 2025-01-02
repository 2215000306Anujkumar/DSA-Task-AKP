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
    public void Helper(List<Integer> list , Node node){
        if(node == null) return;
        list.add(node.val);
        for(Node tmp : node.children)
            Helper(list , tmp);
            
    }
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        Helper(list , root);
        return list;
    }
}