// Chapter 17 Binary Search Tree Code Along
// Author:      Aaron Neagle
// Date:        12/9/2021
// Filename:    IntTreeClient.java

// Short program that demonstrates the use of the IntTree class.

public class IntTreeClient {
    public static void main(String[] args) {
        IntTree t = new IntTree(12);
        System.out.println("Tree structure:");
        t.printSideways();
        System.out.println();
        t.printPreorder();
        t.printInorder();
        t.printPostorder();
        //new code to get and print the sum, levels, and leaves of the IntTree that was previously created.
        System.out.println("Sum = "+ t.sum());
        System.out.println("Levels = " + t.countLevels());
        System.out.println("Leaves = " + t.countLeaves());

        //test code for BJP5 video additional methods
        for(int i = 1; i <= 10; i++){
            IntTree t1 = new IntTree(i);
            t1.printPreorder();
            System.out.println("sum = " + t1.sum());
            System.out.println("evens = " + t1.countEvens());
        }

    }
}