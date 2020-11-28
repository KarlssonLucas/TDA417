package pack;

public class bst {
    private bstNODE root;

    public void put(String key, Object value) {
        if(root == null) {
            root = new bstNODE(key, value);
        } else {
            root.put(key, value);
        }
    }

    public Object get(String key) {
        return root == null ? null : root.get(key);
    }
}
