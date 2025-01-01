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
}
*/

class Solution {
    public void Helper(List<Integer> list , Node node){
        if(node == null) return;
        for(Node tmp : node.children)
            Helper(list , tmp);
            list.add(node.val);
    }
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        Helper(list , root);
        return list;
    }
}

