package JavaFresherDay8.Exercise.BinarySearchTree;

import java.util.*;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {

    protected TreeNode<E> root;
    protected int size=0;

    public BST() {
    }

    public BST(E[] objects) {
        for (int i = 0; i <objects.length; i++){
            insert(objects[i]);
        }
    }

    @Override
    public boolean search(E e) {
        if (root == null) {
            return false;
        }
        else {
            TreeNode<E> parent = null;
            TreeNode<E> curent = root;
            while (curent != null){
                if (e.compareTo(curent.element)<0){
                    parent = curent;
                    curent = curent.left;
                } else if (e.compareTo(curent.element)>0) {
                    parent = curent;
                    curent = curent.right;
                }
                else return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(E e) {
        if (!search(e)) {
            return false;
        } else {
            root = deleteRec(root, e);
            size --;
            return true;
        }
    }

    protected TreeNode<E> deleteRec(TreeNode<E> root, E e){
        if(root == null){
            return root;
        }
        if(e.compareTo(root.element) < 0){
            root.left = deleteRec(root.left, e);
        } else if (e.compareTo(root.element) > 0) {
            root.right = deleteRec(root.right, e);
        } else {
            if(root.left == null){
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                root.element = minValue(root.right);
                root.right = deleteRec(root.right,root.element);
            }
        }
        return root;
    }

    E minValue (TreeNode<E> root){
        E min = root.element;
        while (root.left != null){
            min = root.left.element;
            root = root.left;
        }
        return min;
    }

    @Override
    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e); /*create a new root*/
        else {
            /*locate the parent node*/
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false; /*Duplicate node not inserted*/
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true; /*element inserted successfully*/
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    @Override
    public void preorder() {
        preorder(root);
    }

    @Override
    public void postorder() {
        postorder(root);
    }

    protected void postorder(TreeNode<E> root){
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }

    protected void preorder(TreeNode<E> root){
        if (root == null) return;
        System.out.print(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }

    @Override
    public int getSize() {
        return size;
    }
}

