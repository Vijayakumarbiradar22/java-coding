package Tree.diameteroftree;

public class dia {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int indx=-1;
        public Node buildTree(int nodes[]){
            indx++;
            if(nodes[indx]==-1){
                return null;
            }

            Node newNode=new Node(nodes[indx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        int myheight = Math.max(leftheight,rightheight)+1;
        return myheight;
    }

    public static int diameter(Node root){
        if(root==null){
            return 0;
        }

        int dia1=diameter(root.left);
        int dia2=diameter(root.right);
        int dia3=height(root.left)+height(root.right)+1;

        return Math.max(dia3,Math.max(dia1,dia2));
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);
        System.out.println(diameter(root));

    }
    
}
