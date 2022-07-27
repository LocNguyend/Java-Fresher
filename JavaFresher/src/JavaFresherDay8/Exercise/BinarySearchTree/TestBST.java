package JavaFresherDay8.Exercise.BinarySearchTree;

public class TestBST {
    public static void main(String[] args) {
        //create a BST
        /* BST tree example
              50
           /     \
          29      79
         /  \    /  \
        27   31  58   98 */
        BST<String> tree = new BST<>();
        tree.insert(String.valueOf(50));
        tree.insert(String.valueOf(29));
        tree.insert(String.valueOf(27));
        tree.insert(String.valueOf(31));
        tree.insert(String.valueOf(79));
        tree.insert(String.valueOf(58));
        tree.insert(String.valueOf(98));
        //traverse tree
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println();
        System.out.println("Postorder (sorted): ");
        tree.postorder();
        System.out.println();
        System.out.println("Preorder (sorted): ");
        tree.preorder();
        System.out.println();
        System.out.println("The number of nodes is: " + tree.getSize());


        //test search
        System.out.println("-----------------------------------------");
        System.out.println("Test search");
        System.out.println(tree.search(String.valueOf(20)));
        System.out.println(tree.search(String.valueOf(58)));

        //test delete
        System.out.println("-----------------------------------------");
        System.out.println("Test delete");
        //tree.delete(String.valueOf(60));
        tree.delete(String.valueOf(50));
         /* BST tree example
              58
           /     \
          29      79
         /  \    /  \
        27   31     98 */
        tree.inorder();
    }
}
