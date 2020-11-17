Note: If you are uncertain about any problem or want to discuss, write on the Slack channel #exercises. Solution suggestions will be published after the exercise sessions in week 4.

The weekly exercises are optional but recommended. Some of these will be reviewed at the exercise sessions in week 4.

Some questions are marked as bonus questions. We do not expect you to attempt these, and they will probably not be covered in the exercise session, but they are there for those who are interested. Many of them are harder or more unusual than the normal exercises.

    Try the quiz.

    Insert the values 2,1,4,5,9,3,6,7 into:

        A binary search tree

        A 2-3 tree

        A red-black BST
        An AVL tree

    Insert the values 1,2,3,4,5,6,7,8 into:

        A binary search tree

        A 2-3 tree

        A red-black BST
        An AVL tree
    Suppose we have a class Set<Key> implementing a set. Describe in pseudocode how to implement the following operations:
        void union(Set<Key> other): add all keys in other to the set.
        void intersection(Set<Key> other): keep only keys that are also present in other.
        void difference(Set<Key> other): delete all keys in other from the set.
        Bonus: Show how to implement intersection and difference so that their runtime is O(n log m), where n is the size of the smaller of the two sets this and other, and m is the size of the larger set. Hint: first check which of the sets is larger, then write code for that particular case.
    Design a data structure representing a multiset: a set where each key can appear multiple times. Think first about what operations you would like the data structure to support. Hint: use a red-black BST; you do not need to modify any of the code for it. Also design a data structure representing a multimap: a symbol table (map) where each key can be associated with multiple values.

    Design an algorithm that, given a BST and two keys x and y, finds all keys between x and y in the BST (for example, returning them in a queue). The runtime should be O(log N + M) for a balanced BST, where N is the size of the BST and M is the number of keys returned. Hint: combine ideas from BST search and in-order traversal.
    Implement the method void delete(Key key) that deletes a key from a BST. You will probably need to define a helper method that finds the largest key in a subtree.
    Consider the following algorithm for sorting a list of keys:
            Shuffle the list of keys.
            Add each key in turn to a BST.
            Do an in-order traversal of the BST to get the keys in ascending order.
        Why is this algorithm not a fully correct sorting algorithm?
        What is its complexity?
        What is the purpose of shuffling the list of keys first?
    Bonus: Book exercises: section 3.2 (Links to an external site.) exercises 3 and 13; creative problem 25; web exercises 2 and 6. Section 3.3   (Links to an external site.)exercise 9; creative problems 33 and 38 (harder: 39 to 41; web exercises 1 to 4). Section 3.5 (Links to an external site.) creative exercise 23; web exercise 6 (harder: 22)
    Bonus: Design a data structure representing a bidirectional map: a symbol table where there is a one-to-one relationship between key and values - each key is associated with one value, and each value is associated with one key. In addition to the usual symbol table operations it should provide a "reverse lookup" operation which takes a value and finds the corresponding key (efficiently). When inserting a key-value pair, any conflicting key-value pair should be removed. Hint: use two red-black BSTs. The code for adding a new key-value pair is a little tricky, so make sure to write down an invariant relating the two BSTs.
    Bonus: Describe an algorithm that finds the successor of a key in a BST: the key that comes directly after it in sorted order. The runtime should be proportional to the height of the BST. Hint: make the algorithm return null if the key is the largest one. The algorithm is recursive (similar to the search algorithm) but there are extra cases depending on whether each recursive call returns null or not.
    Bonus: Implement AVL trees. You may want to start from the book's implementation of binary search trees. There are several steps:
        Add a height field to the Node class.
        Add an invariant that for each node, the value of the height field is equal to 1 + the maximum of the children's heights.
        Modify put to update the height field.
        Define functions Node rotateLeft(Node node) and Node rotateRight(Node node) which do rotations. (You can copy these from the book's implementation of red-black trees, but removing the lines which talk about node colours.)
        Modify put so that, after returning from the recursive call, it checks if the node is now unbalanced. If so, it checks which case we are in (left/left, left/right, right/left, right/right) and does the appropriate sequence of rotations.

    Bonus: Programming exercise: implement expression trees and a function to evaluate them. Harder: Make a program that reads in expressions and evaluates them, using Dijkstra's two-stack algorithm to parse the expression. Open-ended challenge: allow expressions to contain variables and instead of evaluating them numerically, simplify them symbolically.

    Bonus: (not really a question) We skipped over 2-3 tree deletion, which is more complicated than insertion. If you want, you can read about it in these notes: http://www.cs.princeton.edu/~dpw/courses/cos326-12/ass/2-3-trees.pdf (Links to an external site.).

    Bonus: In red-black BSTs, we only allowed the left child to have the same level as its parent. We could weaken the invariant, so that either child (but not both) can have the same level as its parent. In other words, a 3-node is constructed by a node and either of its children. What happens if you do this? Is there an advantage to doing it? Is there a disadvantage?

    Bonus: Suppose that we have a binary search tree where each node also contains a reference to its parent node. Design an algorithm that performs an in-order traversal of the tree (e.g. printing out the nodes in ascending order), but using a constant amount of extra memory. Note that the normal recursive algorithm for in-order traversal requires O(height of tree) extra memory because each recursive call consumes memory.

    Bonus: Adapt the algorithms for rotation so that they work on a binary search tree with parent pointers. You may want to try it on the red-black BST code from the book (Links to an external site.). If you do, first extend the method check() so that it also checks that the parent pointers are consistent.

    Bonus, hard: a 2-3-4 tree consists of 2-nodes, 3-nodes and 4-nodes (a node with three values and four children). Insertion in 2-3-4 trees uses a more efficent insertion algorithm called top-down insertion. In top-down insertion, as you move down the tree looking for the insertion point, whenever you reach a 4-node you split it and absorb it into its parent (note that because we split all 4-nodes on the way down, the parent is always a 2- or 3-node so absorption is easy). When we reach the leaf, we split it and insert the appropriate value.
        Describe in more detail the algorithm for inserting into a 2-3-4 tree using top-down insertion.
        A red-black tree is a version of red-black BSTs which also allows 4-nodes. A 4-node is represented as a black node with two red children. Work out a suitable invariant for red-black trees and design an algorithm for inserting into them using top-down insertion.

