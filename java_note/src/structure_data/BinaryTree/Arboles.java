package structure_data.BinaryTree;

public class Arboles {

    public static void main(String[] args){
        
        BinaryTree tree = new BinaryTree();
        tree.root = new NodeTree('A');
        tree.root.left = new NodeTree('B');
        tree.root.right = new NodeTree('C');
        tree.root.left.left = new NodeTree('D');
        tree.root.left.right = new NodeTree('E');
        tree.root.right.left = new NodeTree('F');
        tree.root.right.right = new NodeTree('G');
        tree.root.left.left.right = new NodeTree('H');
        tree.root.right.left.left = new NodeTree('I');
        
        System.out.println("El recorrido Preorder del arbol binario es: ");
        tree.preOrder(tree.root);
        System.out.println("");
        
        System.out.println("\nEl recorrido Inorder del arbol binario es: ");
        tree.inOrder(tree.root);
        System.out.println("");
        
        System.out.println("\nEl recorrido Postorder del arbol binario es: ");
        tree.postOrder(tree.root);
        System.out.println("");
        
    }
    
}
