import bstNODE;

public class bst {
    private bstNODE root;

    public void put(String key, Object value) {
        if(root == null) {
            root = new bstNODE(key, value);
        }
    }
}
