package exercises.tasks.number_tasks;

import java.util.List;

public class Number_Nodes_TraverseTheTree {

    /*
    Please implement this method to traverse the tree and return the sum of the values (Node.getValue()) of all nodes at the level N in the tree.
    Node root is assumed to be at the level 1. All its children are level 2, etc.

     */

    // Please do not change this interface
    public static interface Node {
        int getValue();

        List<Node> getChildren();
    }

    public static int getLevelSum(Node root, int N) {

        int result = 0;

        if (N == 1) {
            result = root.getValue();
            return result;
        }

        for (Node eachChild : root.getChildren()) {
            result += getLevelSum(eachChild, N - 1);
        }

        return result;
    }


}
