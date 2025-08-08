
public class heigthTree {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data= data;
            this.left= null;
            this.right=null;
        }
    }
    public static class tree{
        static int idx=-1;
        public static Node BuildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
        }
        Node newNode= new Node(nodes[idx]);
        newNode.left=BuildTree(nodes);
        newNode.right= BuildTree(nodes);
        return newNode;
        }
    }
    public static int getHeight(Node root) {
    if (root == null) {
        return 0;
    }
    int leftHeight = getHeight(root.left);
    int rightHeight = getHeight(root.right);
    return Math.max(leftHeight, rightHeight) + 1;
}

    public static void main(String[] args) {
        int nodes[]= {1,2,3,-1,-1,40,-1,-1,-1};
        tree t= new tree();
        Node root= t.BuildTree(nodes);
        System.out.println(root.data);
        System.out.println("higth "+getHeight(root));
    }
}
