
   class Node {//bu satır, Node sınıfını tanımlar.
    int key;//bu satır, Node sınıfının içerisinde key adlı bir int değişkeni tanımlar.
    Node left, right;//bu satır, Node sınıfının içerisinde left ve right adlı iki Node tipinde değişken tanımlar.
 
    public Node(int item)// bu satır, Node sınıfının yapıcı metodunu tanımlar ve item adlı bir int değişkeni alır.
    {
        key = item;
        left = right = null;
    }
}
 
class BinaryTree { //Bu sınıf, root adında Node tipinde bir değişken içermektedir.
  
    Node root;
 
    BinaryTree() { root = null; }//sınıfının yapıcı metodu tanımlanmıştır ve içerisinde root değişkeni null olarak başlatılmıştır.
 
   
    void printPreorder(Node node)
    {
        if (node == null)
            return;
 
        
        System.out.print(node.key + " ");
 
        
        printPreorder(node.left);
 
        printPreorder(node.right);
    }
    void printInorder(Node node)
    {
        if (node == null)
            return;
 
        
        printInorder(node.left);
 
       
        System.out.print(node.key + " ");
 
       
        printInorder(node.right);
    }
    void printPostorder(Node node)
    {
        if (node == null)
            return;
 
     
        printPostorder(node.left);
 
       
        printPostorder(node.right);
 
        System.out.print(node.key + " ");
    }
 
    void printPostorder() { printPostorder(root); }
    
    void printPreorder() { printPreorder(root); }
    void printInorder() { printInorder(root); }
   
 
    
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
          
        System.out.println(
            "Preorder ağacı");
        tree.printPreorder();
        System.out.println(
            "\nInorder ağacı ");
        tree.printInorder();

        System.out.println(
            "\nPostorder ağacı ");
        tree.printPostorder();
    }
}