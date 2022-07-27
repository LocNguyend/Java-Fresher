package JavaFresherDay8.Exercise.BinarySearchTree;

public interface BSTree<E> {

    boolean insert(E e);

    void inorder();
    void preorder();
    void postorder();

    boolean search(E e);

    boolean delete(E e);

    int getSize();
}
