package Tree.diaapproach2;

public class dia2 {
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

    static class treeInfo{
        int ht;
        int diam;

        treeInfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }

    public static treeInfo diameter2(Node root){
        if(root==null){
            return new treeInfo(0,0);
        }
        treeInfo left=diameter2(root.left);
        treeInfo right=diameter2(root.right);

        int myheight = Math.max(left.ht,right.ht)+1;

        int diam1=left.diam;
        int diam2=right.diam;
        int diam3=left.diam+right.diam+1;

        int mydiam=Math.max(Math.max(diam1,diam2),diam3);

        treeInfo myInfo=new treeInfo(myheight,mydiam);
        return myInfo;
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();

        Node root = tree.buildTree(nodes);
        System.out.println(diameter2(root).diam);

    }
    
}
