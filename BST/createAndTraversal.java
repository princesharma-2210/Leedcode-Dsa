public class createAndTraversal {
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node create(int val,Node root){
        if(root== null){
            root= new Node(val);
            return root;
        }
        if(root.data>val){
           root.left= create(val,root.left);
        }
        else{
            root.right= create(val,root.right);
        }
        return root;
    }
    static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }

    public static void main(String[] args) {
        int arr[]= {7,3,2,5,8,9,1,4};
        Node root= null;
        for(int i=0; i<arr.length; i++){
             root= create(arr[i],root);
        }
        Inorder(root);
       
    }
}
