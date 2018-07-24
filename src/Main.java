public class Main {
    public static void main(String args[]){
        Node myTree = new Node(10);
        myTree.insert(4124);
        myTree.insert(1);
        myTree.insert(1444);
        myTree.insert(4);
        myTree.insert(124);
        myTree.insert(124124124);
        System.out.println(myTree.toString());
        System.out.println(myTree.contains(4));
        myTree.printInOrder();
        myTree.printPostOrder();
    }
}
