package java401_code_challenges.treeIntersection;

import java401_code_challenges.hashtable.HashTable;
import java401_code_challenges.tree.BinaryTree;
import java401_code_challenges.tree.Node;

import java.util.ArrayList;

public class TreeIntersection {
    public static ArrayList treeIntersectionSet(BinaryTree tree1, BinaryTree tree2){

      HashTable  newTable = new HashTable();
      ArrayList arrayOfTree1 = tree1.postOrder();
      HashTable hashTableOfTree1 = new HashTable();
      HashTable hashTableOfTree2 = new HashTable();

      ArrayList arrayOfTree2 = tree2.postOrder();
      ArrayList arrayToReturn = new ArrayList();


        for(int i = 0; i < arrayOfTree1.size(); i++){
            hashTableOfTree1.add(arrayOfTree1.get(i).toString(), 1);
        }

        for(int j = 0; j < arrayOfTree2.size(); j++){
            hashTableOfTree2.add(arrayOfTree2.get(j).toString(), 1);
        }


      for(int i = 0; i < hashTableOfTree2.numberOfBuckets; i++){
          if(hashTableOfTree2.bucketsArray[i].head!=null) {
              if (hashTableOfTree1.contains(hashTableOfTree2.bucketsArray[i].head.key)) {
                  newTable.add(hashTableOfTree2.bucketsArray[i].head.key, 1);
              }
          }
      }


      for(int i = 0; i<newTable.numberOfBuckets; i++){
          if(newTable.bucketsArray[i].head!=null){
              arrayToReturn.add(Integer.parseInt(newTable.bucketsArray[i].head.key));
          }
      }

    return arrayToReturn;

    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(3);
        tree.root.leftChild.leftChild = new Node(40);
        tree.root.leftChild.rightChild = new Node(5);
        tree.root.rightChild.rightChild = new Node(100);

        BinaryTree tree1 = new BinaryTree();
        tree1.root = new Node(10);
        tree1.root.leftChild = new Node(2);
        tree1.root.rightChild = new Node(30);
        tree1.root.leftChild.leftChild = new Node(40);
        tree1.root.leftChild.rightChild = new Node(5);
        tree1.root.rightChild.rightChild = new Node(1000);

        ArrayList newArr = treeIntersectionSet(tree, tree1);
        for(int i = 0; i < newArr.size(); i++){
            System.out.println(newArr.get(i));
        }
    }


}
