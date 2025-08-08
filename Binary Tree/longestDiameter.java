public class longestDiameter{
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data= data;
            this.left= null;
            this.right= null;
        }
    }
    public static int height(Node root){
        if(root== null){
            return 0;
        }
        int lh= height(root.left);
        int rh= height(root.right);
        return Math.max(lh,rh)+1;

    }
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int lengthLeft= diameter(root.left);
        int lengthRight= diameter(root.right);
        int leftHeight= height(root.left);
        int rightHeight= height(root.right);
        return Math.max(Math.max(lengthLeft,lengthRight),(leftHeight+rightHeight+1));
    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.right= new Node(4);
        System.out.println(diameter(root));
    }
}