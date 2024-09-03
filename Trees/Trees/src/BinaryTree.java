import java.util.Scanner;
class BinaryTree{


    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    public BinaryTree(){

    }

    // insert elements
    public void Insert(Scanner sc){          // remove static
        System.out.println("Enter the root node ");
        int value = sc.nextInt();
        root = new Node(value);
        Insert(sc,root);
    }

    public void Insert(Scanner sc, Node node){              // private function
        System.out.println("Do you want to insert left node value "+node.value);

        boolean left = sc.nextBoolean();

        if(left){
            System.out.println("Enter the left node value "+node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            Insert(sc,node.left);
        }

        System.out.println("Do you want to insert right of "+node.value);

        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the right node value "+node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            Insert(sc,node.right);
        }

    }
    public void display(){
        display(root,"");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }

        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        BinaryTree tree = new BinaryTree();
        tree.Insert(sc);
        tree.display();
        sc.close();
    }
}

