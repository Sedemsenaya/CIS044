import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Main
{
    public static void main(String[ ] args)
    {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(50);
        bst.insert(25);
        bst.insert(75);
        bst.insert(5);
        bst.insert(7);
        bst.insert(9);

        bst.printTree();
        System.out.println("Number of nodes is " + bst.numNodes());
    }
}