public class Node {
    int value;
    Node left;
    Node right;
    Node(int value) {
        this.value = value;
    }
    public String toString() {
        String output;
        output = "Root: " + this.value;
        if(right != null) {
            output = output + "" + this.right.toString();
        }
        if(left != null) {
            output = output + " " + this.left.toString();
        }
        return output;
    }
    public void insert(int value) {
        if(value <= this.value) {
            if(left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if(right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }
    public boolean contains (int value) {
        if(value == this.value) {
            return true;
        } else if (value <= this.value){
            if(left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if(right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }
    public void printInOrder() {
        if(left != null) {
            left.printInOrder();
        }
        System.out.println(value);
        if(right != null) {
            right.printInOrder();
        }
    }
    public void printPostOrder() {
        if(right != null) {
            right.printPostOrder();
        }
        System.out.println(value);
        if(left != null) {
            left.printPostOrder();
        }
    }
}
